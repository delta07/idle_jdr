package com.idlejdr.model.skill;

import com.idlejdr.model.personnage.Personnage.Job;

/**
 * 
 * @author Grankoff Charly
 *
 */
public abstract class Skill implements SkillInterface {

	String name, description;
	Job job;
	int level, cost;

	/**
	 * 
	 * @param name
	 * @param description
	 * @param job
	 * @param level
	 * @param cost
	 */
	public Skill(String name, String description, Job job, int level, int cost) {
		this.name = name;
		this.description = description;
		this.job = job;
		this.level = level;
		this.cost = cost;

	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return job
	 */
	public Job getJob() {
		return job;
	}

	/**
	 * 
	 * @param job
	 */
	public void setJob(Job job) {
		this.job = job;
	}

	/**
	 * 
	 * @return level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * 
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * 
	 * @return cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * 
	 * @param cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

}
