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
    int healt_player;
    int att_zom;
    int att_player;
    int sum_damage=0;
    public void player(int healt,int damage){
        this.healt_player = healt;
        this.att_player = damage;
    }
    public void zombie(String name,int healt,int attack){
        this.healt_zom = healt;
        this.name = name;
        this.att_zom = attack;
    }
    public void player_attack_gun(){
        Random random = new Random();
        this.sum_damage+=(att_player*(random.nextInt(1)+1))*2.5;
        this.healt_zom = this.healt_zom-(att_player*(random.nextInt(1)+1));
    }
    public void player_attack_knife(){
        Random random = new Random();
        this.sum_damage+=(att_player*(random.nextInt(1)+1))*1.5;
        this.healt_zom = this.healt_zom-((att_player-10)*(random.nextInt(3 )+1));
    }
    public void zombie_attack(){
        Random random = new Random();
        this.sum_damage-=random.nextInt(att_zom);
        this.healt_player = this.healt_player-random.nextInt(att_zom);
    }
    public void player_heal(){
        Random random = new Random();
        this.healt_player = this.healt_player+(15*(random.nextInt(1)+1));
    }
    
}
