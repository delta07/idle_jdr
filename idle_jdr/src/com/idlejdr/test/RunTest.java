package com.idlejdr.test;

import java.util.ArrayList;

import com.idlejdr.controler.construct.Construct;
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

		Personnage perso = new Personnage(Job.Fighter, "Charly", Type.ally);

		Personnage perso2 = new Personnage(Job.Caster, "Alex", Type.ally);
		Skill skHeal = new Heal("Heal 50",
				"Soigne a hateur de 50% de la vie de la cible", Job.Caster, 1,
				0);
		Gambit gam = new Gambit(GambitCaracCible.hp, GambitCible.ally,
				GambitOpe.infEqual, 1, 50, skHeal);
		perso2.addSkill(skHeal);
		perso2.addGambit(gam);

		ArrayList<Personnage> fightListParticipant = new ArrayList<Personnage>();

		for (int i = 0; i < 2; i++) {

			fightListParticipant.add(perso);
			fightListParticipant.add(perso2);
			fightListParticipant.addAll(Construct.createGobelin(20));

			Fight fight1 = new Fight(fightListParticipant);
			System.out.println("*************");
			perso.printPerso();
			perso2.printPerso();
			fightListParticipant.clear();
		}

	}
}
