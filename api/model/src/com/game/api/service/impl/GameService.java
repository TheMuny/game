package com.game.api.service.impl;

import java.awt.Point;

import com.game.api.model.Character;
import com.game.api.model.monster.Monster;
import com.game.api.model.monster.impl.FlyingMonster;
import com.game.api.model.monster.impl.HeroPlayer;
import com.game.api.model.monster.impl.WalkingMonster;

public class GameService implements com.game.api.service.GameService{

	
	
	@Override
	public Character getUserCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Monster[] getMonsters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void calculateNextStep() {
		
		
		
	}


	public static void main(String[] args){
		
		Point p   = new Point();
		Character [][] map = new Character[7][13];
		HeroPlayer h = new HeroPlayer();
		
	    map[0][3]  =   (Character)h;
//	    map [12][1]= new WalkingMonster();
//	    map [12][6]= new FlyingMonster();
//		
//	    
//	    //moveMonsters
//	    for(int i=0;i<map.length;i++){
//	    	for(int j=0;j<map[i].length;j++){
//	    		if(map[i][j] instanceof WalkingMonster){
//	    			map[11][1] = map[i][j];
//	    			map[i][j]=null;		
//	    		}else if(map[i][j]instanceof FlyingMonster){
//	    			map[11][6]=map[i][j];
//	    			map[i][j]=null;
//	    		}
//	    	}
//	    }
	}
    
}
