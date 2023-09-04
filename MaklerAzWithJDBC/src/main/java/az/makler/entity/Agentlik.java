/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.entity;

/**
 *
 * @author Hp electron
 */
public class Agentlik {
    private int agent_id;
    private String agent_name;
    private String contact;

    public Agentlik() {
    }

    //bunu sout etmek ucun yaradiriq
    public Agentlik(int agent_id) {
        this.agent_id = agent_id;
    }
        

    public Agentlik(int agent_id, String agent_name, String contact) {
        this.agent_id = agent_id;
        this.agent_name = agent_name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Agentlik{" + "agent_id=" + agent_id + ", agent_name=" + agent_name + ", contact=" + contact + '}';
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
