package com.idlejdr.test;

import java.util.ArrayList;

import com.idlejdr.controler.fight.Fight;
import com.idlejdr.model.personnage.Gambit;
import com.idlejdr.model.personnage.Gambit.GambitCaracCible;
import com.idlejdr.model.personnage.Gambit.GambitCible;
import com.idlejdr.model.personnage.Gambit.GambitOpe;
import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;
import com.idlejdr.model.skill.Heal;
import com.idlejdr.model.skill.Skill;

public class RunTest {

	public static void main(String[] args) {

		// Skill skAttack = new DefaultAttack("Attack de base",
		// "Attacke de base",
		// Job.Caster, 1, 0);

		// Gambit gam2 = new Gambit(GambitCaracCible., gambitCible, gambitOpe,
		// priority, value, sk)

		Personnage perso = new Personnage(Job.Fighter, "Delta", Type.ally);

		Personnage perso2 = new Personnage(Job.Caster, "boby", Type.ally);
		Skill skHeal = new Heal("Heal 50",
				"Soigne a hateur de 50% de la vie de la cible", Job.Caster, 1,
				0);
		Gambit gam = new Gambit(GambitCaracCible.hp, GambitCible.ally,
				GambitOpe.infEqual, 1, 50, skHeal);
		perso2.addSkill(skHeal);
		perso2.addGambit(gam);

		Personnage gobelin = new Personnage(Job.Fighter, "gobelin 1", 1,
				Type.enemy);
		Personnage gobelin2 = new Personnage(Job.Fighter, "gobelin 2", 1,
				Type.enemy);
		Personnage gobelin3 = new Personnage(Job.Fighter, "gobelin 3", 1,
				Type.enemy);
		Personnage gobelin4 = new Personnage(Job.Fighter, "gobelin 4", 1,
				Type.enemy);
		Personnage gobelin5 = new Personnage(Job.Fighter, "gobelin 5", 1,
				Type.enemy);
		Personnage gobelin6 = new Personnage(Job.Fighter, "gobelin 6", 1,
				Type.enemy);

		ArrayList<Personnage> fightListParticipant = new ArrayList<Personnage>();

		fightListParticipant.add(perso);
		fightListParticipant.add(perso2);
		fightListParticipant.add(gobelin);
		fightListParticipant.add(gobelin2);
		fightListParticipant.add(gobelin3);
		fightListParticipant.add(gobelin4);
		// fightListParticipant.add(gobelin5);
		// fightListParticipant.add(gobelin6);

		Fight fight1 = new Fight(fightListParticipant);

		System.out.println("---------------------");
		perso.printStatus();
		gobelin.printStatus();
		perso2.printStatus();
		gobelin2.printStatus();
		gobelin3.printStatus();
		gobelin4.printStatus();
		gobelin5.printStatus();
		gobelin6.printStatus();
		// perso.getSkillList().get(0).use(gobelin, perso);
		// perso.printStatus();

	}
}
