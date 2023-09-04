/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.config;

import az.makler.dao.impl.AgentlikDaoImpl;
import az.makler.dao.impl.ElanDaoImpl;
import az.makler.dao.inter.AgentlikDaoInter;
import az.makler.dao.inter.ElanDaoInter;

/**
 *
 * @author Hp electron
 */
public class Context {
   public static ElanDaoInter instanceElanDao() {
        return new ElanDaoImpl();
   }
   
   public static AgentlikDaoInter instanceAgentlikDao() {
   
       return new AgentlikDaoImpl();
       
   }
}
