package com.game.api.model.monster.impl;

import java.awt.Point;


import com.game.api.model.monster.Movable;

public abstract  class Monster extends Character implements Movable{

	@Override
	public void moveTo(Point point) {
		location.setLocation(point);		
	}

	@Override
	public boolean canMoveTo(Point point) {
		//*********************************
		//*********************************
		return true;
		}
	

	
	@Override
	public Point getPosition() {		
		return location;
	}

	public Point getLocation(){
		return location.getLocation();
		
	}
	
}

