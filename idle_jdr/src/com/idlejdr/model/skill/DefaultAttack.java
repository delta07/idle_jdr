package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;

public class DefaultAttack extends Skill {
	/**
	 * Constructor of default Atttack
	 * 
	 * @param name
	 * @param description
	 * @param job
	 * @param level
	 * @param cost
	 */
	public DefaultAttack(String name, String description, Job job, int level,
			int cost) {
		super(name, description, job, level, cost);
	}

	/**
	 * Method use() for using a skill, with caster of the skill and List of
	 * fighter into parameters. Have to decide here who is the target for using
	 * use with single target
	 * 
	 * @param caster
	 * @param persoList
	 */
	public void use(Personnage caster, ArrayList<Personnage> persoList) {

		ArrayList<Personnage> allies = new ArrayList<Personnage>();
		ArrayList<Personnage> enemies = new ArrayList<Personnage>();
		// suppress caster of targetList
		for (Personnage p : persoList) {
			if (p.equals(caster))
				continue;
			if (caster.getType() == Type.ally && p.getType() == Type.ally)
				allies.add(p);
			else if (caster.getType() == Type.enemy
					&& p.getType() == Type.enemy)
				allies.add(p);
			else
				enemies.add(p);
		}
		Personnage cible = enemies.get(0);
		for (Personnage p : enemies) {
			if (cible.getHp() > p.getHp() && p.getHp() != 0)
				cible = p;
		}

		use(caster, cible);

	}

	/**
	 * Method use() caster + cible
	 * 
	 * @param caster
	 * @param perso
	 * 
	 */
	@Override
	public void use(Personnage caster, Personnage perso) {
		System.out.println(caster.getName() + " lance " + this.getName()
				+ " sur " + perso.getName());
		System.out.println(caster.getName() + " inflige : "
				+ caster.attackPhysDamage(perso) + " a " + perso.getName());
		perso.setHp(perso.getHp() - caster.attackPhysDamage(perso));
	}
}
