package com.idlejdr.model.personnage.monsters;

import com.idlejdr.model.personnage.Personnage;

public class Gobelin extends Personnage {

	public Gobelin(Job monjob, String name, long hp, long mp, long attp,
			long defp, long attm, long defm, Type type) {
		super(monjob, name, hp, mp, attp, defp, attm, defm, type);
		this.expValue = 50;

	}

}
