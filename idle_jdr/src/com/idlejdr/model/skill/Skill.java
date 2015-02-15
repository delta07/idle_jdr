package com.idlejdr.model.skill;

import com.idlejdr.model.personnage.Personnage.Job;

public abstract class Skill implements SkillInterface {

	String name, description;
	Job job;
	int level, cost;

	public Skill(String name, String description, Job job, int level, int cost) {
		this.name = name;
		this.description = description;
		this.job = job;
		this.level = level;
		this.cost = cost;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
