package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;

public class Slash extends Skill {

	public Slash(String name, String description, Job job, int level, int cost) {
		super(name, description, job, level, cost);
		this.description = "Une grande attaque qui inflige 150% des dégats normaux";
	}

	@Override
	public void use(Personnage caster, Personnage perso) {

	}

	@Override
	public void use(Personnage caster, ArrayList<Personnage> persoList) {
		// TODO Auto-generated method stub

	}

}
