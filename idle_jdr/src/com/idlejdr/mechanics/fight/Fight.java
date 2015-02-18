package com.idlejdr.mechanics.fight;

import java.util.ArrayList;
import java.util.Collections;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Type;

public class Fight {

	int expTot = 0;

	public Fight(ArrayList<Personnage> fightListParticipant) {
		// Boucle sur tous les gambits pour trouver le correspondant et lancer
		// le skill
		System.out.println("********NEW FIGHT*******");
		while (checkAllyAlive(fightListParticipant)
				&& checkEnemyAlive(fightListParticipant)) {
			Collections.shuffle(fightListParticipant);
			System.out.println("-----NOUVEAU ROUND----");
			fightRound(fightListParticipant);
			// try {
			// Thread.sleep(3000);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

		}

		for (Personnage perso : fightListParticipant) {
			perso.addExp(expTot / fightListParticipant.size());
		}

	}

	public void fightRound(ArrayList<Personnage> fightListParticipant) {

		for (Personnage perso : fightListParticipant) {
			if (perso.getHp() <= 0)
				continue;
			perso.chooseGambit(fightListParticipant).getSk()
					.use(perso, fightListParticipant);

			// Check pour stopper le round en cours si perso mort
			if (!checkEnemyAlive(fightListParticipant))
				break;
			if (!checkAllyAlive(fightListParticipant))
				break;

		}
		removeDead(fightListParticipant);
	}

	// Renvoie false si tous les enemies sont morts
	public boolean checkEnemyAlive(ArrayList<Personnage> fightListParticipant) {
		for (Personnage perso : fightListParticipant) {

			if (perso.getType() == Type.enemy && perso.getHp() > 0)
				return true;

		}
		return false;

	}

	// Renvoie false si tous les allies sont morts
	public boolean checkAllyAlive(ArrayList<Personnage> fightListParticipant) {
		for (Personnage perso : fightListParticipant) {
			if (perso.getType() == Type.ally && perso.getHp() > 0)
				return true;
		}
		return false;

	}

	public void removeDead(ArrayList<Personnage> fightListParticipant) {
		try {
			for (Personnage perso : fightListParticipant) {
				if (perso.getHp() <= 0) {
					fightListParticipant.remove(perso);
					this.expTot += perso.getExpValue();
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
