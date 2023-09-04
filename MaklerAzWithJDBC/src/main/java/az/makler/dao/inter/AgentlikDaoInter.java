/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.makler.dao.inter;

import az.makler.entity.Agentlik;
import java.util.List;

/**
 *
 * @author Hp electron
 */
public interface AgentlikDaoInter {
    void insert(Agentlik agentlik);
    void update(Agentlik agentlik);
    void delete(int id);
    Agentlik getAgentlikById(int id);
    List<Agentlik> getAllAgentlik();
}
