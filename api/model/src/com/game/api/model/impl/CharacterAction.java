package com.game.api.model.impl;

import com.game.api.model.Character;


public class CharacterAction implements com.game.api.model.CharacterAction{

	private Character Char;
	
	@Override
	public void doAction() {
			Char.isNpc();
	}

	@Override
	public Character getActionTarget() {		
		return Char;
	}

}
