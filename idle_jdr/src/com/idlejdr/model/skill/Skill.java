package com.idlejdr.model.skill;

import com.idlejdr.model.personnage.Personnage.Job;

public class Skill implements SkillInterface {
	
	
	String name,description;
	Job job;
	int level,cost;
	
	public Skill(String desc){
		this.description=desc;
	}
	
	
	@Override
	public int use() {
		// TODO Auto-generated method stub
		return 0;
	}

}
