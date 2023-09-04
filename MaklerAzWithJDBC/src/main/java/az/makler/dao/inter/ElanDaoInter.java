/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.makler.dao.inter;

import az.makler.entity.Elan;
import java.util.List;

/**
 *
 * @author Hp electron
 */
public interface ElanDaoInter {
    void insert(Elan elan);
    void update(Elan elan);
    void delete(int id);
    Elan getElanById(int id);
    List<Elan> getAllElan();
}
