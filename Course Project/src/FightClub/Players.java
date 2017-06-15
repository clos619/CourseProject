/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FightClub;

public class Players {
    
    private String name;
    private int health;
    private boolean dead;
    
    public Players(){
        name="bad User";
        health=-1;
        dead = true;
    }
    public Players(String cName){
        
        name=cName;
        health=100;
        dead=false;
        
    }
    
    public void setName(String cName){name = cName;}
    public void setHealth(int cHealth){health = cHealth;}
    public String getName(){return name;}
    public int getHealth(){return health;}
    public void setDead(boolean cdead){dead=cdead;}    
    public boolean getDead(){return dead;}
    
    
}
