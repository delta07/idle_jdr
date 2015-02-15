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

	@Override
	public void use(Personnage caster, ArrayList<Personnage> persoList) {
		Personnage temp = persoList.get(0);
		Type tp;
		if (caster.getType() == Type.enemy)
			tp = Type.ally;
		else
			tp = Type.enemy;
		for (Personnage persoL : persoList) {
			if (persoL.getType() == tp && persoL.getHp() < temp.getHp())
				temp = persoL;
		}
		use(caster, temp);

	}

	@Override
	public void use(Personnage caster, Personnage perso) {
		perso.setHp(perso.getHp() - caster.attackPhysDamage(perso));
	}
}
