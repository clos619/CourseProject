/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FightClub;

/**
 *
 * @author leggc
 */
public class Players {
    
    private String name;
    private int health;
    
    public Players(){
        name="bad Usesr";
        health=-1;
    }
    public Players(String cName){
        
        name=cName;
        health=100;
        
    }
    
    public void setName(String cName){name = cName;}
    public void setHealth(int cHealth){health = cHealth;}
    public String getName(){return name;}
    public int getHealth(){return health;}
    
    
    
}
