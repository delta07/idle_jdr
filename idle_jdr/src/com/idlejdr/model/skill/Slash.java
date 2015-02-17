package com.idlejdr.model.skill;

import java.util.ArrayList;

import com.idlejdr.model.personnage.Personnage;
import com.idlejdr.model.personnage.Personnage.Job;

public class Slash extends Skill {
	/**
	 * Cosntructor
	 * 
	 * @param name
	 * @param description
	 * @param job
	 * @param level
	 * @param cost
	 */
	public Slash(String name, String description, Job job, int level, int cost) {
		super(name, description, job, level, cost);
		this.description = "Une grande attaque qui inflige 150% des dégats normaux";
	}

	/**
	 * 
	 * Method use() for using a skill, with caster of the skill and List of
	 * fighter into parameters. Have to decide here who is the target for using
	 * use with single target
	 * 
	 * @param caster
	 * @param persoList
	 * 
	 */
	public void use(Personnage caster, ArrayList<Personnage> persoList) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method use() caster + perso
	 * 
	 * @param caster
	 * @param perso
	 * 
	 */
	@Override
	public void use(Personnage caster, Personnage perso) {

	}

}
