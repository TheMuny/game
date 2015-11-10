package com.game.api.model.monster.impl;

import java.awt.Point;

import com.game.api.model.AttackType;
import com.game.api.model.CharacterAction;

public class HeroPlayer extends com.game.api.model.monster.impl.Character {


	private AttackType Type2;
	private AttackType Type3;
	
    public HeroPlayer() {
    	
    	health=500;
		Type = AttackType.MELEE;
		Type2 =AttackType.RANGE;
		Type3 =AttackType.MAGIC;
	
	}
	
	public HeroPlayer(int health, 
			Point location) {
		
		this.health = health;
		Type = AttackType.MELEE;
		Type2 =AttackType.RANGE;
		Type3 =AttackType.MAGIC;
		this.location = location;
	}

	@Override
	public boolean canDoAction(CharacterAction action) {
		return false;
	}

	
	@Override
	public void doAction(CharacterAction action) {
		
	}

	
	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void modifyHealth(int val) {
		health=val;
		
	}

	@Override
	public boolean isNpc() {
		return false;
	}

	@Override
	public boolean canMove() {	
		return true;
	}


}
