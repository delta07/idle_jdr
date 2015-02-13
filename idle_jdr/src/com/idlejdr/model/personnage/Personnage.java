package com.idlejdr.model.personnage;

import java.util.ArrayList;
import java.util.Random;

import com.idlejdr.model.item.Item;
import com.idlejdr.model.skill.Skill;

public class Personnage {
	public enum Job {
		Fighter, Caster;
	}

	private String name;
	private long hp, mp, attp, attm, defp, defm, exp, initiative;
	private long level;

	private Job job;
	private ArrayList<Item> itemList;
	private ArrayList<Skill> skillList;

	public Personnage(Personnage.Job monjob, String name, long hp, long mp,
			long attp, long defp, long attm, long defm) {
		this.job = monjob;
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attp = attp;
		this.defp = defp;
		this.attm = attm;
		this.defm = defm;
		this.exp = 0;
		this.level = 1;

	}

	/*
	 * Creation de perso auto selon la classe de personnage
	 * 
	 * @Param Personnage.Job job,String name
	 * 
	 * @Author Delta
	 */
	public Personnage(Personnage.Job job, String name) {
		this.job = job;
		this.name = name;
		this.level = 1;
		calculStat();
	}

	public Personnage(Personnage.Job job, String name, long level) {
		this.job = job;
		this.name = name;
		this.level = level;
		calculStat();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getHp() {
		return hp;
	}

	public void setHp(double d) {
		this.hp = (long) d;
	}

	public long getMp() {
		return mp;
	}

	public void setMp(long mp) {
		this.mp = mp;
	}

	public long getAttp() {
		return attp;
	}

	public void setAttp(long attp) {
		this.attp = attp;
	}

	public long getAttm() {
		return attm;
	}

	public void setAttm(long attm) {
		this.attm = attm;
	}

	public long getDefp() {
		return defp;
	}

	public void setDefp(long defp) {
		this.defp = defp;
	}

	public long getDefm() {
		return defm;
	}

	public void setDefm(long defm) {
		this.defm = defm;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) {
		this.exp = exp;
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		this.level = level;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	public void addItem(Item item) {
		this.itemList.add(item);
	}

	public void addSkill(Skill skill) {
		skillList.add(skill);
	}

	public long getInitiative() {
		return new Random().nextInt((6 - 1) + 1) + 1;
	}

	public void setInitiative(long initiative) {
		this.initiative = initiative;
	}

	public ArrayList<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(ArrayList<Skill> skillList) {
		this.skillList = skillList;
	}

	public long attackPhysDamage(Personnage perso) {
		return (long) Math.round(Math.pow((double) this.attp, 1.3)
				- Math.pow((double) perso.defp, 0.7));
	}

	public void printPerso() {
		System.out.println("Nom : " + this.name);
		System.out.println("Niveau : " + this.level);
		System.out.println("Experience : " + this.exp);
		System.out.println("HP : " + this.hp);
		System.out.println("MP : " + this.mp);
		System.out.println("Att Phys : " + this.attp);
		System.out.println("Def Phys : " + this.defp);
		System.out.println("Att Mag : " + this.attm);
		System.out.println("Def mag : " + this.defm);

	}

	public void addExp(long l) {
		this.exp += l;
		while (this.exp >= ((Math.pow((double) this.level, 2) * 100) - (100 * this.level))) {
			this.level++;
			calculStat();
		}
	}

	/*
	 * Calcul stat en fonction du level
	 */
	public void calculStat() {
		if (this.job == Job.Fighter) {

			this.mp = (long) this.level * 10;
			this.attp = (long) Math
					.round(Math.pow((double) this.level, 1.4) + 10);
			this.defp = (long) Math
					.round(Math.pow((double) this.level, 1.3) + 10);
			this.attm = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.defm = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.hp = defp * 13;

		} else {

			this.mp = this.level * 15;
			this.attp = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.defp = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.attm = (long) Math
					.round((Math.pow((double) this.level, 1.4) + 10) * 1.3);
			this.defm = (long) Math
					.round((Math.pow((double) this.level, 1.4) + 10) * 1.1);
			this.hp = defp * 13;
		}
	}
}
