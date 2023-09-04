/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.makler.dao.impl;

import az.makler.config.AbstractDao;
import az.makler.dao.inter.ElanDaoInter;
import az.makler.entity.Agentlik;
import az.makler.entity.Category;
import az.makler.entity.Elan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp electron
 */
public class ElanDaoImpl extends AbstractDao implements ElanDaoInter {

    @Override
    public void insert(Elan elan) {

        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("insert into elan(tip, mertebe, sahe, unvan, category_id, agent_id) values(?,?,?,?,?,?)");
            st.setString(1, elan.getTip());
            st.setInt(2, elan.getMertebe());
            st.setInt(3, elan.getSahe());
            st.setString(4, elan.getUnvan());
            st.setInt(5, elan.getCategory().getCategory_id());
            st.setInt(6, elan.getAgentlik().getAgent_id());
            st.execute();

            /*Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb16", "user16", "12345");
            c.close();//bu fayllarla isimizi bitirdiyimizde derhal fayli baglamaq ucun yazdigimiz koddur.*/
        } catch (SQLException ex) {

            ex.getStackTrace();
        }
    }

    @Override
    public void update(Elan elan) {

        try (Connection conn = connect()) {
            PreparedStatement st = conn.prepareStatement("update elan set tip=?, mertebe=?, sahe=?, unvan=?, category_id=?, agent_id=? where elan_id=?");
            st.setString(1, elan.getTip());
            st.setInt(2, elan.getMertebe());
            st.setInt(3, elan.getSahe());
            st.setString(4, elan.getUnvan());
            st.setInt(5, elan.getCategory().getCategory_id());
            st.setInt(6, elan.getAgentlik().getAgent_id());
            st.setInt(7, elan.getElan_id());
            st.execute();

            /*Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb16", "user16", "12345");
            c.close();//bu fayllarla isimizi bitirdiyimizde derhal fayli baglamaq ucun yazdigimiz koddur.*/
        } catch (SQLException ex) {

            ex.getStackTrace();
        }
    }

    @Override
    public void delete(int id) {

        try (Connection conn = connect()) {

            Statement st = conn.createStatement();
            st.execute("delete from elan where elan_id=" + id);

        } catch (SQLException ex) {

            ex.getStackTrace();
        }

    }

    @Override
    public Elan getElanById(int id) {

        Elan e = null;
        try (Connection conn = connect()) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allinfoElan where elan_id=" + id);

            while (rs.next()) {

                e = getElan(rs);
            }

        } catch (SQLException ex) {

            ex.getStackTrace();
        }

        return e;
    }

    @Override
    public List<Elan> getAllElan() {

        List<Elan> list = new ArrayList();
        try (Connection conn = connect()) {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from allinfoElan");

            while (rs.next()) {

                Elan e = getElan(rs);
                list.add(e);
            }

        } catch (SQLException ex) {

            ex.getStackTrace();
        }

        return list;

    }

    //bu metod tekrarlanmanin qarshisini almaq ucun istifade olunur
    public Elan getElan(ResultSet rs) throws SQLException {

        int elan_id = rs.getInt("elan_id");
        String tip = rs.getString("tip");
        int mertebe = rs.getInt("mertebe");
        int sahe = rs.getInt("sahe");
        String unvan = rs.getString("unvan");
        Category category = new Category(rs.getInt("category_id"), rs.getString("category_name"));
        Agentlik agentlik = new Agentlik(rs.getInt("agent_id"), rs.getString("agent_name"), rs.getString("contact"));

        return new Elan(elan_id, tip, mertebe, sahe, unvan, category, agentlik);
    }

}
