package com.game.api.model;

/**
 * Created by Denis on 5/27/2015.
 */
public enum AttackType {
    RANGE(2, 3), MAGIC(5,7), MELEE(1,4);
    
    
    private final int distance;
    private final int damage;
    
    private AttackType(int distance, int damage){
    	this.distance=distance;
    	this.damage=damage;
    }

	public int getDistance() {
		return distance;
	}

	public int getDamage() {
		return damage;
	}
    
    
    
    
    
}
