/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.entity;

/**
 *
 * @author Hp electron
 */
public class Elan {
    
    private int elan_id;
    private String tip;
    private int mertebe;
    private int sahe;
    private String unvan;
    private Category category;
    private Agentlik agentlik;

    public Elan() {
    }

    public Elan(int elan_id, String tip, int mertebe, int sahe, String unvan, Category category, Agentlik agentlik) {
        this.elan_id = elan_id;
        this.tip = tip;
        this.mertebe = mertebe;
        this.sahe = sahe;
        this.unvan = unvan;
        this.category = category;
        this.agentlik = agentlik;
    }

    @Override
    public String toString() {
        return "Elan{" + "elan_id=" + elan_id + ", tip=" + tip + ", mertebe=" + mertebe + ", sahe=" + sahe + ", unvan=" + unvan + ", category=" + category + ", agentlik=" + agentlik + '}';
    }

    public int getElan_id() {
        return elan_id;
    }

    public void setElan_id(int elan_id) {
        this.elan_id = elan_id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getMertebe() {
        return mertebe;
    }

    public void setMertebe(int mertebe) {
        this.mertebe = mertebe;
    }

    public int getSahe() {
        return sahe;
    }

    public void setSahe(int sahe) {
        this.sahe = sahe;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Agentlik getAgentlik() {
        return agentlik;
    }

    public void setAgentlik(Agentlik agentlik) {
        this.agentlik = agentlik;
    }
    
    
}
