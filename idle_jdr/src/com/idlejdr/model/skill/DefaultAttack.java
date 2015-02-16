package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;

public class DefaultAttack extends Skill {

	public DefaultAttack(String name, String description, Job job, int level,
			int cost) {
		super(name, description, job, level, cost);
	}

	@SuppressWarnings("null")
	@Override
	public void use(Personnage caster, ArrayList<Personnage> persoList) {

		// tri amis, enemy sans le caster dans son tableau
		ArrayList<Personnage> allies = new ArrayList<Personnage>();
		ArrayList<Personnage> enemies = new ArrayList<Personnage>();
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

		caster.printStatus();
		cible.printStatus();
		use(caster, cible);

	}

	@Override
	public void use(Personnage caster, Personnage perso) {
		System.out.println(caster.getName() + " lance " + this.getName()
				+ " sur " + perso.getName());
		System.out.println(caster.getName() + " inflige : "
				+ caster.attackPhysDamage(perso) + " a " + perso.getName());
		perso.setHp(perso.getHp() - caster.attackPhysDamage(perso));
	}
}
