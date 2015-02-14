package com.idlejdr.test;

import java.util.ArrayList;

import com.idlejdr.controler.fight.Fight;
import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;

public class RunTest {

	public static void main(String[] args) {

		Personnage perso = new Personnage(Job.Fighter, "Delta", Type.ally);
		Personnage gobelin = new Personnage(Job.Fighter, "gobelin 1", 1,
				Type.enemy);
		Personnage gobelin2 = new Personnage(Job.Fighter, "gobelin 2", 1,
				Type.enemy);

		ArrayList<Personnage> heroes = new ArrayList<Personnage>();
		ArrayList<Personnage> monster = new ArrayList<Personnage>();

		heroes.add(perso);
		monster.add(gobelin);
		monster.add(gobelin2);

		Fight fight1 = new Fight(heroes, monster);

	}
}
