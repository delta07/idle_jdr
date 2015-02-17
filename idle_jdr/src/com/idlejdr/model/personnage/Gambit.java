package com.idlejdr.model.personnage;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage.Type;
import com.idlejdr.model.skill.Skill;

/**
 * Class Gambit A gambit check a condition and have an associate skill If a
 * gambit is verified, skill is used
 * 
 * @author Grankoff Charly
 *
 */
public class Gambit {

	public enum GambitCaracCible {
		hp, mp;
	}

	public enum GambitCible {
		ally, enemy;
	}

	public enum GambitOpe {
		infEqual, supEqual;
	}

	/*
	 * Pas d enum pour les int 0,25,50,75,100 directement dans les if
	 */
	GambitCaracCible gambitCaracCible;
	GambitCible gambitCible;
	GambitOpe gambitOpe;
	int priority;
	int valueGambit;
	Skill sk;

	/**
	 * Cosntructor
	 * 
	 * @param gambitCaracCible
	 * @param gambitCible
	 * @param gambitOpe
	 * @param priority
	 * @param value
	 * @param sk
	 */
	public Gambit(GambitCaracCible gambitCaracCible, GambitCible gambitCible,
			GambitOpe gambitOpe, int priority, int value, Skill sk) {
		this.gambitCaracCible = gambitCaracCible;
		this.gambitCible = gambitCible;
		this.gambitOpe = gambitOpe;
		this.priority = priority;
		this.sk = sk;
		this.valueGambit = value;
	}

	/**
	 * Check if gambit matching (return true)
	 * 
	 * @param listPerso
	 * @return true
	 */
	public boolean checkgambit(ArrayList<Personnage> listPerso) {

		/*
		 * Forme du gambit A faire pour tous les gambit
		 */
		if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() <= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() <= perso.getHpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() <= perso.getHpMax() * 0.5)
					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() <= perso.getHpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() <= perso.getHpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() >= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() >= perso.getHpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() >= perso.getHpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() >= perso.getHpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getHp() >= perso.getHpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() <= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() <= perso.getHpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() <= perso.getHpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() <= perso.getHpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() <= perso.getHpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() >= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() >= perso.getHpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() >= perso.getHpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() >= perso.getHpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getHp() >= perso.getHpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() <= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() <= perso.getMpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() <= perso.getMpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() <= perso.getMpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() <= perso.getMpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() >= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() >= perso.getMpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() >= perso.getMpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() >= perso.getMpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally
						&& perso.getMp() >= perso.getMpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() <= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() <= perso.getMpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() <= perso.getMpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() <= perso.getMpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() <= perso.getMpMax() * 1)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() >= 0)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() >= perso.getMpMax() * 0.25)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() >= perso.getMpMax() * 0.50)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() >= perso.getMpMax() * 0.75)

					return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy
						&& perso.getMp() >= perso.getMpMax() * 1)

					return true;
			}
			return false;
		}

		return false;

	}

	/**
	 * 
	 * @return gambitCaracCible
	 */
	public GambitCaracCible getGambitCaracCible() {
		return gambitCaracCible;
	}

	/**
	 * 
	 * @param gambitCaracCible
	 */
	public void setGambitCaracCible(GambitCaracCible gambitCaracCible) {
		this.gambitCaracCible = gambitCaracCible;
	}

	/**
	 * 
	 * @return gambitCible
	 */
	public GambitCible getGambitCible() {
		return gambitCible;
	}

	/**
	 * 
	 * @param gambitCible
	 */
	public void setGambitCible(GambitCible gambitCible) {
		this.gambitCible = gambitCible;
	}

	/**
	 * 
	 * @return gambitOpe
	 */
	public GambitOpe getGambitOpe() {
		return gambitOpe;
	}

	/**
	 * 
	 * @param gambitOpe
	 */
	public void setGambitOpe(GambitOpe gambitOpe) {
		this.gambitOpe = gambitOpe;
	}

	/**
	 * 
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * 
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * 
	 * @return valueGambit
	 */
	public int getValueGambit() {
		return valueGambit;
	}

	/**
	 * 
	 * @param valueGambit
	 */
	public void setValueGambit(int valueGambit) {
		this.valueGambit = valueGambit;
	}

	/**
	 * 
	 * @return sk
	 */
	public Skill getSk() {
		return sk;
	}

	/**
	 * 
	 * @param sk
	 */
	public void setSk(Skill sk) {
		this.sk = sk;
	}

}
