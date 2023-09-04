/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.dao.impl;

import az.makler.config.AbstractDao;
import static az.makler.config.AbstractDao.connect;
import az.makler.dao.inter.AgentlikDaoInter;
import az.makler.entity.Agentlik;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp electron
 */
public class AgentlikDaoImpl extends AbstractDao implements AgentlikDaoInter{

    @Override
    public void insert(Agentlik agentlik) {

        try (Connection conn = connect()){
            PreparedStatement st = conn.prepareStatement("insert into agentlik(agent_id, agent_name, contact) values(?, ?, ?)");
            st.setInt(1, agentlik.getAgent_id());
            st.setString(2, agentlik.getAgent_name() );
            st.setString(3, agentlik.getContact());
            st.execute();
            
            
            /*Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb16", "user16", "12345");
            c.close();//bu fayllarla isimizi bitirdiyimizde derhal fayli baglamaq ucun yazdigimiz koddur.*/
        } catch (SQLException ex) {
            
            ex.getStackTrace();
        }
    }

    @Override
    public void update(Agentlik agentlik) {

         try (Connection conn = connect()){
            PreparedStatement st = conn.prepareStatement("update agentlik set agent_id=?, agent_name=?, contact=? where agent_id=?");
            st.setInt(1, agentlik.getAgent_id());
            st.setString(2, agentlik.getAgent_name());
            st.setString(3, agentlik.getContact());
            st.setInt(4, agentlik.getAgent_id());
            st.execute();
            
            
            /*Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb16", "user16", "12345");
            c.close();//bu fayllarla isimizi bitirdiyimizde derhal fayli baglamaq ucun yazdigimiz koddur.*/
        } catch (SQLException ex) {
            
            ex.getStackTrace();
        }
    }

    @Override
    public void delete(int id) {

        try(Connection conn = connect()) {
            
            Statement st = conn.createStatement();
            st.execute("delete from agentlik where agent_id=" + id);
            
        } catch (SQLException ex) {

            ex.getStackTrace();
        }
        
    }

    @Override
    public Agentlik getAgentlikById(int id) {

        Agentlik a = null;
        try(Connection conn = connect()) {
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allInfoAgentlik where agent_id=" + id);
            
            while(rs.next()) {
                
                a = getAgentlik(rs);
            }
            
        } catch (SQLException ex) {

            ex.getStackTrace();
        }
        
        return a;

    }

    @Override
    public List<Agentlik> getAllAgentlik() {

        List<Agentlik> list = new ArrayList();
        try(Connection conn = connect()) {
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allInfoAgentlik");
            
            while(rs.next()) {
     
                Agentlik a = getAgentlik(rs);
                list.add(a);
            }
            
        } catch (SQLException ex) {

            ex.getStackTrace();
        }
        
        return list;
        
    }

    public Agentlik getAgentlik(ResultSet rs) throws SQLException {

        int agent_id = rs.getInt("agent_id");
        String agent_name = rs.getString("agent_name");                
        String contact = rs.getString("contact");
                
        return new Agentlik(agent_id, agent_name, contact);         

    }
    
}
