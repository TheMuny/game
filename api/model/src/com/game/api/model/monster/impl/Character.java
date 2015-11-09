package com.game.api.model.monster.impl;

import java.awt.Point;

import com.game.api.model.AttackType;
import com.game.api.model.Npc;
import com.game.api.model.monster.Flying;
import com.game.api.model.monster.Monster;
import com.game.api.model.monster.Movable;


public abstract class Character implements  com.game.api.model.Character{
	
	protected int health;
	protected AttackType Type;/*Enum AttackType*/
	protected Point location;/*Location*/
	protected Character target;
	
	public void setLocation(Point location){
		this.location=location;
	}
	
	
}
