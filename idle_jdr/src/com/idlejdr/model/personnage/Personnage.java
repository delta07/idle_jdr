package com.idlejdr.model.personnage;

import java.util.ArrayList;
import java.util.Random;

import com.idlejdr.model.item.Item;
import com.idlejdr.model.skill.Skill;

public class Personnage  {
	public enum Job {
		Fighter,
		Caster;
	}

	private String name;
	private int hp,mp,attp,attm,defp,defm,exp,level,initiative;


	private Job job;
	private ArrayList<Item> itemList ;
	private ArrayList<Skill> skillList;

	public Personnage(Personnage.Job monjob, String name, int hp, int mp, int attp, int defp, int attm, int defm) {
		this.job = monjob;
		this.name=name;
		this.hp=hp;
		this.mp=mp;
		this.attp=attp;
		this.defp=defp;
		this.attm=attm;
		this.defm=defm;
		this.exp=0;
		this.level=1;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttp() {
		return attp;
	}

	public void setAttp(int attp) {
		this.attp = attp;
	}

	public int getAttm() {
		return attm;
	}

	public void setAttm(int attm) {
		this.attm = attm;
	}

	public int getDefp() {
		return defp;
	}

	public void setDefp(int defp) {
		this.defp = defp;
	}

	public int getDefm() {
		return defm;
	}

	public void setDefm(int defm) {
		this.defm = defm;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
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

	public void addItem(Item item){
		this.itemList.add(item);
	}

	public void addSkill(Skill skill){
		skillList.add(skill);
	}

	public int getInitiative() {
		return new Random().nextInt((6 - 1) + 1) + 1;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public ArrayList<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(ArrayList<Skill> skillList) {
		this.skillList = skillList;
	}
}
