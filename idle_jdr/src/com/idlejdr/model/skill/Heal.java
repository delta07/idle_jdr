package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;

public class Heal extends Skill {

	// facteur de heal 20%, 30%, etc
	double fact;

	public Heal(String name, String description, Job job, int level, int cost) {
		super(name, description, job, level, cost);
		this.fact = 0.3;
		this.description = "Soigne la cible de " + fact * 100
				+ "% de ces points de vie";
		this.level = level;
		this.job = job.Caster;
		// this.cost = (int) (fact * 50);
		this.cost = 1;
	}

	public void use(Personnage caster, ArrayList<Personnage> persoList) {
		// tri amis, enemy sans le caster dans son tableau
		ArrayList<Personnage> allies = new ArrayList<Personnage>();
		ArrayList<Personnage> enemies = new ArrayList<Personnage>();
		for (Personnage p : persoList) {

			if (caster.getType() == Type.ally && p.getType() == Type.ally)
				allies.add(p);
			else if (caster.getType() == Type.enemy
					&& p.getType() == Type.enemy)
				allies.add(p);
			else
				enemies.add(p);
		}
		Personnage cible = allies.get(0);
		for (Personnage p : allies) {
			if (cible.getHp() > p.getHp())
				cible = p;
		}
		caster.printStatus();
		cible.printStatus();
		use(caster, cible);

	}

	@Override
	public void use(Personnage caster, Personnage cible) {
		cible.setHp(cible.getHp() + Math.round(cible.getHpMax() * this.fact));
		System.out.println(caster.getName() + " soigne " + cible.getName()
				+ " de " + Math.round(cible.getHpMax() * this.fact)
				+ " points de vie");
		caster.setMp(caster.getMp() - this.cost);

	}
}
