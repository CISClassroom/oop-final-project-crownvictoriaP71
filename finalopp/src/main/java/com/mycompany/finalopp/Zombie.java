/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalopp;

/**
 *
 * @author TPEC
 */
public class Zombie {
    public int zombie_healt;
    public String zombie_name;

    Zombie(String licker, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Zombie(String name,int healt) {
        this.zombie_healt = healt;
        this.zombie_name = name;
    }
    public int gethealt(){
        return zombie_healt;
    }
    public String getname(){
        return zombie_name;
    }
}
