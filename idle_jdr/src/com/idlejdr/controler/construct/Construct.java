package com.idlejdr.controler.construct;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;
import com.idlejdr.model.personnage.Personnage.Type;
import com.idlejdr.model.personnage.monsters.Gobelin;
import com.idlejdr.model.skill.Skill;
import com.idlejdr.model.world.dungeons.Dungeons;

public class Construct {

	public static Skill createSkill() {
		// Skill sk = new Heal(1, 0.2);

		return null;

	}

	public static Dungeons CreateDungeons() {

		return null;
	}

	public static ArrayList<Personnage> createGobelin(int nombre) {
		ArrayList<Personnage> listMonstre = new ArrayList<>();

		for (int i = 0; i < nombre; i++) {
			Personnage gobelin = new Gobelin(Job.Fighter, "Gobelin " + i, 15,
					0, 5, 5, 5, 5, Type.enemy);
			listMonstre.add(gobelin);
		}
		return listMonstre;

	}

}
