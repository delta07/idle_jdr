package com.idlejdr.model.personnage;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage.Type;
import com.idlejdr.model.skill.Skill;

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

	public Gambit(GambitCaracCible gambitCaracCible, GambitCible gambitCible,
			GambitOpe gambitOpe, int priority, int value, Skill sk) {
		this.gambitCaracCible = gambitCaracCible;
		this.gambitCible = gambitCible;
		this.gambitOpe = gambitOpe;
		this.priority = priority;
		this.sk = sk;
		this.valueGambit = value;
	}

	public boolean checkgambit(ArrayList<Personnage> listPerso) {

		/*
		 * Forme du gambit A faire pour tous les gambit
		 */
		if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() <= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() <= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() <= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() <= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() <= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() >= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() >= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() >= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() >= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getHp() >= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() <= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() <= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() <= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() <= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() <= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() >= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() >= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() >= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() >= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.hp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getHp() >= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() <= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() <= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() <= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() <= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() <= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() >= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() >= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() >= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() >= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.ally
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.ally && perso.getMp() >= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() <= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() <= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() <= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() <= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.infEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() <= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 0) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() >= 0)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 25) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() >= 25)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 50) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() >= 50)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 75) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() >= 75)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		} else if (gambitCaracCible == GambitCaracCible.mp
				&& gambitCible == GambitCible.enemy
				&& gambitOpe == GambitOpe.supEqual && valueGambit == 100) {
			for (Personnage perso : listPerso) {
				if (perso.getType() == Type.enemy && perso.getMp() >= 100)
					listPerso.clear();
				listPerso.add(perso);
				return true;
			}
			return false;
		}

		// (gambitCaracCible==GambitCaracCible.hp &&
		// gambitCible==GambitCible.allie && gambitOpe==GambitOpe.equal &&
		// valueGambit==0)

		return false;

	}

	public GambitCaracCible getGambitCaracCible() {
		return gambitCaracCible;
	}

	public void setGambitCaracCible(GambitCaracCible gambitCaracCible) {
		this.gambitCaracCible = gambitCaracCible;
	}

	public GambitCible getGambitCible() {
		return gambitCible;
	}

	public void setGambitCible(GambitCible gambitCible) {
		this.gambitCible = gambitCible;
	}

	public GambitOpe getGambitOpe() {
		return gambitOpe;
	}

	public void setGambitOpe(GambitOpe gambitOpe) {
		this.gambitOpe = gambitOpe;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getValueGambit() {
		return valueGambit;
	}

	public void setValueGambit(int valueGambit) {
		this.valueGambit = valueGambit;
	}

	public Skill getSk() {
		return sk;
	}

	public void setSk(Skill sk) {
		this.sk = sk;
	}

	public Skill getSkillGambit(ArrayList<Personnage> persoList) {

		return sk;

	}

}
