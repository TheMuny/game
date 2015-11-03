package com.game.api.model.monster.impl;

import com.game.api.model.CharacterAction;

public class FlyingMonster extends com.game.api.model.monster.impl.Character{

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
