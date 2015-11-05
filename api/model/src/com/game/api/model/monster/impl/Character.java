package com.game.api.model.monster.impl;

import java.awt.Point;

import com.game.api.model.AttackType;

public abstract class Character implements  com.game.api.model.Character{
	
	protected int health;
	protected AttackType Type;/*Enum AttackType*/
	protected Point location;/*Location*/
	protected Character target;
	
}
