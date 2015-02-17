package com.idlejdr.model.personnage.monsters;

import com.idlejdr.model.personnage.Personnage;

public class Gobelin extends Personnage {

	public static final long LEVEL = 1;

	public Gobelin(Job monjob, String name, long hp, long mp, long attp,
			long defp, long attm, long defm, Type type) {
		super(monjob, name, hp, mp, attp, defp, attm, defm, type);
		this.expValue = 50;

	}

	public Gobelin() {
		super(Job.Fighter, "Gobelin", 10, 0, 5, 5, 5, 5, Type.enemy);
		this.expValue = 50;

	}
}
