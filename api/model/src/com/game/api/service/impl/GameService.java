package com.game.api.service.impl;

import java.awt.Point;
import java.util.Random;

import com.game.api.model.Character;
import com.game.api.model.monster.Monster;
import com.game.api.model.monster.Movable;
import com.game.api.model.monster.impl.FlyingMonster;
import com.game.api.model.monster.impl.HeroPlayer;
import com.game.api.model.monster.impl.WalkingMonster;

public class GameService implements com.game.api.service.GameService{

//	private Character [][]map= new Character[25][25];
	private Monster[]monsters = new Monster[10];
	private HeroPlayer hero = new HeroPlayer();
	private Point p = new Point();
	
	
	public void setLocationCell(){		
		for(int i =0;i<monsters.length;i++){
			if(i%2==0){
				Random r = new Random();
				p.setLocation(r.nextInt(25),r.nextInt(25));
				monsters[i]=new WalkingMonster(60,p);			
			}else{
				 Random r = new Random();
				p.setLocation(r.nextInt(25),r.nextInt(25));
				monsters[i]=new FlyingMonster(25,p);
			}
		}		
	}
	
	
	
	
	
	@Override
	public Character getUserCharacter() {
		return hero;
	}

	@Override
	public Monster[] getMonsters() {
		return monsters;
	}

	public Monster getMonster(int index) {
		return monsters[index];
	}
	@Override
	public void calculateNextStep() {
	   
	    for(int i = 0; i < monsters.length; i++) {            	
                Movable m = (Movable) monsters[i];
                Random r = new Random();
                m.moveTo(new Point(r.nextInt(25),r.nextInt(25)));
                
                monsters[i]= (Monster) m;
        }
		
	}


	public static void main(String[] args){


		
		GameService G = new GameService();
		G.setLocationCell();
		
		G.calculateNextStep();
		
		
//		Point p   = new Point();
//		Character [][] map = new Character[7][13];
//	
//	    map [0][3] = new HeroPlayer();
//	    map [1][12]= new WalkingMonster();
//	    map [6][12]= new FlyingMonster();
//		
//	    
//	    //moveMonsters
//	    for(int i=0;i<map.length;i++){
//	    	for(int j=0;j<map[i].length;j++){
//	    		if(map[i][j] instanceof WalkingMonster){
//	    			map[1][11] = map[i][j];
//	    			map[i][j]=null;		
//	    		}else if(map[i][j]instanceof FlyingMonster){
//	    			map[6][11]=map[i][j];
//	    			map[i][j]=null;
//	    		}
//	    	}
//	    }
	    
	    
	    
	}
    
}
