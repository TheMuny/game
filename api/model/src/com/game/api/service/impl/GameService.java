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

	private Character [][]map= new Character[25][25];
	private Monster[]monsters = new Monster[10];
	private HeroPlayer hero = new HeroPlayer();

	
	
	public void setLocationCell(){		
		for(int i =0;i<monsters.length;i++){
			if(i%2==0){
				Point s = new Point();
				Random r = new Random();
				s.setLocation(r.nextInt(25),r.nextInt(25));
				monsters[i]=new WalkingMonster(60,s);			
			}else{
				Point m = new Point();
				Random r = new Random();
				m.setLocation(r.nextInt(25),r.nextInt(25));
				monsters[i]=new FlyingMonster(25,m);
			}
		}		
	}
	
	
	public void fight(){
	    
		for (int i=0;i<monsters.length;i++){
			Movable m = (Movable) monsters[i];
			for(int j=0;j<monsters.length;j++){
				if(i!=j){
			Movable s = (Movable) monsters[j];
			if((int)(m.getPosition().distance(s.getPosition()))<=monsters[i].getAttackDistance()){
				monsters[i].attack(monsters[j]);
				  }
			   }
			}
		}
	}
	
	
	
	public void showOnMap(){
    	Character [][]map1 = new Character[25][25];
    	for (int i=0;i<monsters.length;i++){
    		 Movable m = (Movable) monsters[i];
    		map1[m.getPosition().x][m.getPosition().y]= (Character) m;
    	}
    	map=map1;
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
		
		                        /** test locationCell*/
		G.setLocationCell();
//		for (int i=0;i<G.monsters.length;i++){
//			if(G.monsters[i]!=null){
//				Movable m = (Movable) monsters[i];
//				int x = m.getPosition().x;
//				int y = m.getPosition().y;
//				System.out.println(x+" "+y);
//			}else{
//				System.out.println(i+" ");
//			}
//		}
		                      /** test showOnMap*/
//		G.showOnMap();
//		for (int i=0;i<G.map.length;i++){
//			for (int j=0;j<G.map[i].length;j++){
//				if(G.map[i][j]!=null){
//					System.out.print(i+" "+j+" "+" - Monster"+"\r\n");
//				
//		    	}
//			}
//		}
//		System.out.println("________________________________________");
		
		                    /** test calculateNextStep*/
//		G.showOnMap();
//		for (int i=0;i<G.map.length;i++){
//			for (int j=0;j<G.map[i].length;j++){
//				if(G.map[i][j]!=null){
//					System.out.print(i+" "+j+" "+" - Monster"+"\r\n");
//				
//		    	}
//			}
//		}
//		G.calculateNextStep();
//		
//		G.showOnMap();
//		for (int i=0;i<G.map.length;i++){
//			for (int j=0;j<G.map[i].length;j++){
//				if(G.map[i][j]!=null){
//					System.out.print(i+" "+j+" "+" - Monster"+"\r\n");
//				
//		    	}
//			}
//		}
		
		                         /** test fight*/
		for(int i=0;i<G.monsters.length;i++){
			System.out.println(G.monsters[i].getHealth());	
		}
		System.out.println("________________________________________");
		G.fight();
		for(int i=0;i<G.monsters.length;i++){
			System.out.println(G.monsters[i].getHealth());
		}
		

	    
	}
    
}
