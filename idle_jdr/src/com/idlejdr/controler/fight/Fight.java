package com.idlejdr.controler.fight;

import java.util.ArrayList;
import java.util.Collections;

import com.idlejdr.model.personnage.Personnage;

public class Fight {

	public Fight(ArrayList<Personnage> fightListParticipant) {
		// Definir algorythme de combat
		// Plusieurs perso plusieurs monstre

		// Definir Initative
		Collections.shuffle(fightListParticipant);

		// Boucle sur tous les gambits pour trouver le correspondant et lancer
		// le skill

		// while (true) {
		// for (Personnage listAlly : fightListParticipant) {
		// if(listAlly.getType()==Type.ally && listAlly.getHp() > 0)
		//
		// }
		// for (Personnage listEnemy : fightListParticipant) {
		//
		// }
		// }

	}
}
