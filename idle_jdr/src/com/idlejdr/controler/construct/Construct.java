package com.idlejdr.controler.construct;

import com.idlejdr.model.skill.Heal;
import com.idlejdr.model.skill.Skill;

public class Construct {
	
	
	public static Skill createSkill(){
		Skill sk = new Heal("Soigne 30 pv");
		
		
		return sk;
		
	}

}
