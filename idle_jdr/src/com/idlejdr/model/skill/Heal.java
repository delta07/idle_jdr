package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;

public class Heal extends Skill {

	// facteur de heal 20%, 30%, etc
	double fact;

	public Heal(String name, String description, Job job, int level, int cost) {
		super(name, description, job, level, cost);
		this.fact = fact;
		this.description = "Soigne la cible de " + fact * 100
				+ "% de ces points de vie";
		this.level = level;
		this.job = job.Caster;
		this.cost = (int) (fact * 50);

	}

	public void use(Personnage caster, ArrayList<Personnage> perso) {
		for (Personnage perso1 : perso) {
			// perso1.setHp((int) perso1.getHp() + perso1.getHp() * this.fact);
		}

	}

	@Override
	public void use(Personnage caster, Personnage perso1) {
		// perso1.setHp((int) perso1.getHp() + perso1.getHp() * this.fact);

	}
}
