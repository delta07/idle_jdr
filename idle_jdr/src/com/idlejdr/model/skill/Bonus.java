package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;

public class Bonus extends Skill {

	public Bonus(String name, String description, Job job, int level, int cost) {
		super(name, description, job, level, cost);
	}

	@Override
	public void use(Personnage caster, ArrayList<Personnage> persoList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void use(Personnage caster, Personnage perso) {
		// TODO Auto-generated method stub

	}

}
