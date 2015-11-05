package com.game.api.model.monster.impl;

import java.awt.Point;

import com.game.api.model.AttackType;
import com.game.api.model.CharacterAction;

public class HeroPlayer extends com.game.api.model.monster.impl.Character{

	
    public HeroPlayer() {
		
		health = 500;
		Type = AttackType.MAGIC;
		location.setLocation((int)(Math.random()*10),(int)(Math.random()*5));
	}
	
	public HeroPlayer(int health, 
			Point location) {
		
		this.health = health;
		Type = AttackType.RANGE;
		this.location = location;
	}

	@Override
	public boolean canDoAction(CharacterAction action) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doAction(CharacterAction action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyHealth(int val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isNpc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

}
