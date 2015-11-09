package com.game.api.service.impl;


import java.awt.Point;

import com.game.api.model.AttackType;
import com.game.api.model.Character;
import com.game.api.model.CharacterAction;
import com.game.api.model.Npc;
import com.game.api.model.monster.Monster;
import com.game.api.model.monster.Movable;

public class Map {

	private Character[][] map = new Character[7][13];
	
	
	public void moveAllMonsters(){
		
	  Character[][] newMap = new Character[7][13];
      for(int i=0;i<newMap.length;i++){
		for(int j=0;j<newMap[i].length;j++){
			if(newMap[i][j].isNpc()){
				
			}
		}
	}
            map=newMap;       
	}



	public Character[][] getMap() {
		return map;
	}
	
}
