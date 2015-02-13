package com.idlejdr.controler.fight;

import java.util.ArrayList;
import java.util.Collections;

import com.idlejdr.model.personnage.Personnage;

public class Fight {

	public Fight(ArrayList<Personnage> heroes, ArrayList<Personnage> monsters) {
		// Definir algorythme de combat
		// Plusieurs perso plusieurs monstre
		// Definir Initative ?
		ArrayList<Personnage> fightingParticipant = new ArrayList<Personnage>();
		fightingParticipant.addAll(heroes);
		fightingParticipant.addAll(monsters);
		Collections.shuffle(fightingParticipant);

		for (Personnage combatant : fightingParticipant) {
			combatant.printPerso();
		}

	}

}
