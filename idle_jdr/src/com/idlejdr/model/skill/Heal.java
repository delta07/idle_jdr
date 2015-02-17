package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;

public class Heal extends Skill {

	// facteur de heal 20%, 30%, etc
	double fact;

	/**
	 * 
	 * @param name
	 * @param description
	 * @param job
	 * @param level
	 * @param cost
	 */
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

	/**
	 * 
	 * Method use() for using a skill, with caster of the skill and List of
	 * fighter into parameters. Have to decide here who is the target for using
	 * use with single target
	 * 
	 * @param caster
	 * @param persoList
	 * 
	 */
	public void use(Personnage caster, ArrayList<Personnage> persoList) {

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
		Personnage target = allies.get(0);
		for (Personnage p : allies) {
			if (target.getHp() > p.getHp())
				target = p;
		}

		use(caster, target);

	}

	/**
	 * Method use() caster + cible
	 * 
	 * @param caster
	 * @param cible
	 * 
	 */
	public void use(Personnage caster, Personnage cible) {
		cible.setHp(cible.getHp() + Math.round(cible.getHpMax() * this.fact));
		System.out.println(caster.getName() + " soigne " + cible.getName()
				+ " de " + Math.round(cible.getHpMax() * this.fact)
				+ " points de vie");
		caster.setMp(caster.getMp() - this.cost);

	}
}
