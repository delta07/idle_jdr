package com.idlejdr.model.personnage.monsters;

import com.idlejdr.model.personnage.Personnage;

public class Orc extends Personnage {
	public static final long LEVEL = 2;

	public Orc(Job monjob, String name, long hp, long mp, long attp, long defp,
			long attm, long defm, Type type) {
		super(monjob, name, hp, mp, attp, defp, attm, defm, type);
		this.expValue = 150;

	}

	public Orc() {
		super(Job.Fighter, "Orc", 20, 0, 18, 10, 10, 10, Type.enemy);
		this.expValue = 150;

	}

}
