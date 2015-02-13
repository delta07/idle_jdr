package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;

public class Slash extends Skill {

	public Slash(String desc) {
		this.description = "Une grande attaque qui inflige 150% des dégats normaux";
	}

	@Override
	public void use(Personnage perso) {

	}

	@Override
	public void use(ArrayList<Personnage> persoList) {
		// TODO Auto-generated method stub

	}

}
