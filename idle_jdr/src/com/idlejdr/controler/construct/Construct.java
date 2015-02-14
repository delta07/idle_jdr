package com.idlejdr.controler.construct;

import com.idlejdr.model.skill.Heal;
import com.idlejdr.model.skill.Skill;
import com.idlejdr.model.world.dungeons.Dungeons;

public class Construct {

	public static Skill createSkill() {
		Skill sk = new Heal(1, 0.2);
		return sk;

	}

	public static Dungeons CreateDungeons() {

		return null;
	}

}
