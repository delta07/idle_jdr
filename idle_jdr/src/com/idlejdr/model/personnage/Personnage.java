package com.idlejdr.model.personnage;

import java.util.ArrayList;

import com.idlejdr.model.item.Item;

public class Personnage  {
	public enum JobName {
		Fighter,
		Caster;
	}

	private String name;
	private int hp,mp,attp,attm,defp,defm,exp,level;
	private JobName job;
	private ArrayList<Item> itemList ;

	public Personnage(Personnage.JobName monjob, String name, int hp, int mp, int attp, int defp, int attm, int defm) {
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

	public JobName getJob() {
		return job;
	}

	public void setJob(JobName job) {
		this.job = job;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	

}
