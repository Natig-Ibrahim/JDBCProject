/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package az.makler.maklerazwithjdbs;

import az.makler.config.Context;
import az.makler.dao.inter.AgentlikDaoInter;
import az.makler.dao.inter.ElanDaoInter;
import az.makler.entity.Agentlik;
import az.makler.entity.Category;
import az.makler.entity.Elan;

/**
 *
 * @author Hp electron
 */
public class MaklerAzWithJDBS {

    public static void main(String[] args) {

        /*//burada melumatlari insert edirik
        Elan e = new Elan(13, "satilir", 4, 90, "Genclik", new Category(4), new Agentlik(3));
        
        //burada ise insert etdiyimiz melumatlari mysql bazasina gonderirik
        ElanDaoInter edao = Context.instanceElanDao();
        edao.insert(e);*/
        
        /*//burada melumatlari update edirik
        Elan e = new Elan(12, "satilir", 4, 90, "Genclik", new Category(4), new Agentlik(3));
        
        e.setTip("Satilir");
        //burada ise update etdiyimiz melumatlari mysql bazasina gonderirik
        ElanDaoInter edao = Context.instanceElanDao();
        edao.update(e);*/
        
        
        /*ElanDaoInter edao = Context.instanceElanDao();
        System.out.println(edao.getElanById(11));*/
        
        AgentlikDaoInter adao = Context.instanceAgentlikDao();
        System.out.println(adao.getAgentlikById(2));
        
    }
}




















