package com.idlejdr.model.personnage;

import java.util.ArrayList;

import com.idlejdr.model.skill.Skill;

public class Gambit {

	public enum GambitCaracCible {
		hp, mp;
	}

	public enum GambitCible {
		self, allie, enemie;
	}

	public enum GambitOpe {
		inf, sup, equal;
	}

	GambitCaracCible gambitCaracCible;
	GambitCible gambitCible;
	GambitOpe gambitOpe;
	int priority;
	Skill sk;

	public Gambit(GambitCaracCible gambitCaracCible, GambitCible gambitCible,
			GambitOpe gambitOpe, int priority, Skill sk) {
		this.gambitCaracCible = gambitCaracCible;
		this.gambitCible = gambitCible;
		this.gambitOpe = gambitOpe;
		this.priority = priority;
		this.sk = sk;
	}

	public ArrayList<Personnage> checkgambit(ArrayList<Personnage> listPerso) {

		return listPerso;

	}

	public Personnage checkgambit(Personnage perso) {
		long caracCible;
		if (this.gambitCaracCible == GambitCaracCible.hp)
			caracCible = perso.getHp();
		if (this.gambitCaracCible == GambitCaracCible.mp)
			caracCible = perso.getMp();

		// perso().choixGambit().skill().use()

		return perso;

	}

}
