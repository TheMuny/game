package com.game.api.model.monster.impl;

import java.awt.Point;

import com.game.api.model.AttackType;
import com.game.api.model.Character;
import com.game.api.model.CharacterAction;
import com.game.api.model.Npc;
import com.game.api.model.monster.Flying;
import com.game.api.model.monster.Monster;
import com.game.api.model.monster.Movable;


public class WalkingMonster extends  com.game.api.model.monster.impl.Monster implements Monster,Npc{


	public WalkingMonster() {
		
		health = 100;
		Type = AttackType.MELEE;
		
	}
	public WalkingMonster(int health, 
			Point location) {
		
		this.health = health;
		Type = AttackType.MELEE;
		this.location = location;
	}
	public Point getLocation(){
		return location.getLocation();
		
	}
	
	
	
	@Override
	public boolean canDoAction(CharacterAction action) {
		if(action.getActionTarget()!=null){
			return true;
		}else{		
		return false;}		
	}

	@Override
	public void doAction(CharacterAction action) {
		action.doAction();		
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
		return true;
	}

	@Override
	public boolean canMove() {
//		if(health!=0){
//		return true;
//		}else{
//			return false;
//		}
		return true;
	}

	@Override
	public void attack(Character character) {
		character.modifyHealth(character.getHealth()-Type.getDamage());
		
	}

	@Override
	public int getAttackDistance() {	
		return Type.getDistance();
	}


}
