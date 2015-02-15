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
import com.idlejdr.model.skill.DefaultAttack;
import com.idlejdr.model.skill.Skill;

public class RunTest {

	public static void main(String[] args) {

		// Skill skAttack = new DefaultAttack("Attack de base",
		// "Attacke de base",
		// Job.Caster, 1, 0);
		Skill skHeal = new DefaultAttack("Heal 50",
				"Soigne a hateur de 50% de la vie de la cible", Job.Caster, 1,
				0);
		Gambit gam = new Gambit(GambitCaracCible.hp, GambitCible.ally,
				GambitOpe.infEqual, 1, 50, skHeal);
		// Gambit gam2 = new Gambit(GambitCaracCible., gambitCible, gambitOpe,
		// priority, value, sk)

		Personnage perso = new Personnage(Job.Fighter, "Delta", Type.ally);
		perso.addSkill(skHeal);
		perso.addGambit(gam);
		Personnage gobelin = new Personnage(Job.Fighter, "gobelin 1", 1,
				Type.enemy);
		Personnage gobelin2 = new Personnage(Job.Fighter, "gobelin 2", 1,
				Type.enemy);

		ArrayList<Personnage> fightListParticipant = new ArrayList<Personnage>();

		fightListParticipant.add(perso);
		fightListParticipant.add(gobelin);
		fightListParticipant.add(gobelin2);

		Fight fight1 = new Fight(fightListParticipant);

	}
}
