package com.game.api.service.impl;

import com.game.api.model.Character;
import com.game.api.model.monster.Monster;
import com.game.api.model.monster.impl.WalkingMonster;
import com.game.api.model.monster.impl.FlyingMonster;


public class GameService implements com.game.api.service.GameService{

	private Character [] monsters = new Character[10];
	
	
	public GameService(){	
		
	for (int i = 0;i<monsters.length;i++){
		if(i%2==0){
		monsters[i]= new WalkingMonster();
	}else{
		monsters[i]= new FlyingMonster();
		
		
	    }
      }
	}
	
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
		// TODO Auto-generated method stub
		
	}

}
