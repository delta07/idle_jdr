package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;

public class DefaultAttack extends Skill {

	public DefaultAttack(String name, String description, Job job, int level,
			int cost) {
		super(name, description, job, level, cost);
	}

	@Override
	public void use(Personnage caster, ArrayList<Personnage> persoList) {
		use(caster, persoList.get(0));

	}

	@Override
	public void use(Personnage caster, Personnage perso) {
		caster.attackPhysDamage(perso);
	}
}
