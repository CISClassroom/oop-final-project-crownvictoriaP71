/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalopp;

import java.util.Random;

/**
 *
 * @author TPEC
 */
public class ClassBattle {
    String name;
    int healt_zom;
    int healt_leon;
    int att_zom;
    public void leon(int healt){
        this.healt_leon = healt;
    }
    public void zombie(String name,int healt,int attack){
        this.healt_zom = healt;
        this.name = name;
        this.att_zom = attack;
    }
    public void leon_attack_gun(int damage){
        Random random = new Random();
        this.healt_zom = this.healt_zom-(damage*(random.nextInt(2)+1));
    }
    public void leon_attack_knife(int damage){
        Random random = new Random();
        this.healt_zom = this.healt_zom-(damage*(random.nextInt(2)+2));
    }
    public void zombie_attack(){
        Random random = new Random();
        this.healt_leon = this.healt_leon-random.nextInt(att_zom);
    }
    public void leon_heal(){
        Random random = new Random();
        this.healt_leon = this.healt_leon+(15*(random.nextInt(1)+1));
    }
    
}
