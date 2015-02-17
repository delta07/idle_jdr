package com.idlejdr.model.personnage;

import java.util.ArrayList;

import com.idlejdr.model.item.Item;
import com.idlejdr.model.personnage.Gambit.GambitCaracCible;
import com.idlejdr.model.personnage.Gambit.GambitCible;
import com.idlejdr.model.personnage.Gambit.GambitOpe;
import com.idlejdr.model.skill.DefaultAttack;
import com.idlejdr.model.skill.Skill;

/**
 * 
 * @author Grankoff Charly
 *
 */
public class Personnage {

	/**
	 * 
	 * Enum Job (figterh or Caster)
	 *
	 */
	public enum Job {
		Fighter, Caster;
	}

	/**
	 * Enum type of character (enemy or ally)
	 * 
	 *
	 */
	public enum Type {
		ally, enemy, neutral;
	}

	protected String name;
	protected long hpMax, mpMax, hp, mp, attp, attm, defp, defm, exp;
	protected long level;
	protected Type type;
	protected int expValue = 0;
	protected Job job;
	protected ArrayList<Item> itemList = new ArrayList<>();
	protected ArrayList<Skill> skillList = new ArrayList<>();
	protected ArrayList<Gambit> gambitList = new ArrayList<>();

	/**
	 * void constructor
	 */
	public Personnage() {

	}

	/**
	 * 
	 * @param monjob
	 * @param name
	 * @param hp
	 * @param mp
	 * @param attp
	 * @param defp
	 * @param attm
	 * @param defm
	 * @param type
	 */
	public Personnage(Personnage.Job monjob, String name, long hp, long mp,
			long attp, long defp, long attm, long defm, Type type) {

		this.job = monjob;
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attp = attp;
		this.defp = defp;
		this.attm = attm;
		this.defm = defm;
		this.hpMax = this.defp * 13;
		this.mpMax = this.attm * 7;
		this.exp = 0;
		this.level = 1;
		this.type = type;
		createDefaultGambit();

	}

	/**
	 * Character creation. Stat auto calculate with level
	 * 
	 * @Param job
	 * @param name
	 * @Param type
	 */
	public Personnage(Personnage.Job job, String name, Type type) {
		this.job = job;
		this.name = name;
		this.type = type;
		this.level = 1;
		createDefaultGambit();
		updateStat();

	}

	/**
	 * Character creation. Stat auto calculate with parameter level
	 * 
	 * @param job
	 * @param name
	 * @param level
	 * @param type
	 */
	public Personnage(Personnage.Job job, String name, long level, Type type) {
		this.job = job;
		this.name = name;
		this.level = level;
		this.type = type;
		createDefaultGambit();
		updateStat();
	}

	/**
	 * Method fr create a default GAMBIT Actually the melee attack Priority 100
	 */
	public void createDefaultGambit() {
		DefaultAttack defaultAtta = new DefaultAttack("Attaque de base",
				"Attaque de base", getJob(), 1, 0);
		addSkill(defaultAtta);
		Gambit defaultAtt = new Gambit(GambitCaracCible.hp, GambitCible.enemy,
				GambitOpe.supEqual, 100, 0, defaultAtta);
		addGambit(defaultAtt);
	}

	/**
	 * 
	 * @return type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
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
	 * @return hp
	 */
	public long getHp() {
		return hp;
	}

	/**
	 * 
	 * @return mp
	 */
	public long getMp() {
		return mp;
	}

	/**
	 * setMp, if negative -> 0
	 * 
	 * @param mp
	 */
	public void setMp(long mp) {
		if (mp < 0)
			mp = 0;
		if (mp > this.mpMax)
			mp = this.mpMax;
		this.mp = mp;
	}

	/**
	 * 
	 * @return attp
	 */
	public long getAttp() {
		return attp;
	}

	/**
	 * 
	 * @param attp
	 */
	public void setAttp(long attp) {
		this.attp = attp;
	}

	/**
	 * 
	 * @return attm
	 */
	public long getAttm() {
		return attm;
	}

	/**
	 * 
	 * @param attm
	 */
	public void setAttm(long attm) {
		this.attm = attm;
	}

	/**
	 * 
	 * @return defp
	 */
	public long getDefp() {
		return defp;
	}

	/**
	 * 
	 * @param defp
	 */
	public void setDefp(long defp) {
		this.defp = defp;
	}

	/**
	 * 
	 * @return defm
	 */
	public long getDefm() {
		return defm;
	}

	/**
	 * 
	 * @param defm
	 */
	public void setDefm(long defm) {
		this.defm = defm;
	}

	/**
	 * 
	 * @return exp
	 */
	public long getExp() {
		return exp;
	}

	/**
	 * 
	 * @param exp
	 */
	public void setExp(long exp) {
		this.exp = exp;
	}

	/**
	 * 
	 * @return level
	 */
	public long getLevel() {
		return level;
	}

	/**
	 * 
	 * @param level
	 */
	public void setLevel(long level) {
		this.level = level;
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
	 * @return itemList
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}

	/**
	 * 
	 * @param itemList
	 */
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	/**
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		this.itemList.add(item);
	}

	/**
	 * 
	 * @param skill
	 */
	public void addSkill(Skill skill) {
		skillList.add(skill);
	}

	/**
	 * 
	 * @return skillList
	 */
	public ArrayList<Skill> getSkillList() {
		return skillList;
	}

	/**
	 * 
	 * @param skillList
	 */
	public void setSkillList(ArrayList<Skill> skillList) {
		this.skillList = skillList;
	}

	/**
	 * Calcul damage for physical Attack
	 * 
	 * @param perso
	 * @return long
	 */
	public long attackPhysDamage(Personnage perso) {
		return (long) Math.round(Math.pow((double) this.attp, 1.3)
				- Math.pow((double) perso.defp, 0.7));
	}

	/**
	 * Print carac cahracter
	 */
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

	/**
	 * Add exp and calcul level if necessary, update stat
	 * 
	 * @param l
	 */
	public void addExp(long l) {
		this.exp += l;
		while (this.exp >= ((Math.pow((double) this.level, 2) * 100) - (100 * this.level))) {
			this.level++;
			updateStat();
		}
	}

	/**
	 * Update values of statistics according to job
	 */
	public void updateStat() {
		if (this.job == Job.Fighter) {

			this.mp = (long) this.level * 10;
			this.mpMax = (long) this.level * 10;
			this.attp = (long) Math
					.round(Math.pow((double) this.level, 1.4) + 10);
			this.defp = (long) Math
					.round(Math.pow((double) this.level, 1.3) + 10);
			this.attm = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.defm = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.hp = defp * 13;
			this.hpMax = defp * 13;

		} else {

			this.mp = this.level * 15;
			this.mpMax = this.level * 15;
			this.attp = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.defp = (long) Math
					.round(Math.pow((double) this.level, 1.1) + 10);
			this.attm = (long) Math
					.round((Math.pow((double) this.level, 1.4) + 10) * 1.3);
			this.defm = (long) Math
					.round((Math.pow((double) this.level, 1.4) + 10) * 1.1);
			this.hp = defp * 13;
			this.hpMax = defp * 13;
		}
	}

	/**
	 * 
	 * @return hpMax
	 */
	public long getHpMax() {
		return hpMax;
	}

	/**
	 * 
	 * @param hpMax
	 */
	public void setHpMax(long hpMax) {
		this.hpMax = hpMax;
	}

	/**
	 * 
	 * @return mpMax
	 */
	public long getMpMax() {
		return mpMax;
	}

	/**
	 * 
	 * @param mpMax
	 */
	public void setMpMax(long mpMax) {
		this.mpMax = mpMax;
	}

	/**
	 * 
	 * @param gambit
	 */
	public void addGambit(Gambit gambit) {
		this.gambitList.add(gambit);

	}

	/**
	 * Sort Gambit by priority
	 */
	public void sortGambitByPriority() {
		ArrayList<Gambit> newList = new ArrayList<Gambit>();
		for (int i = 1; i <= 100; i++) {
			for (Gambit gb : gambitList) {
				if (gb.getPriority() == i)
					newList.add(gb);
			}
		}
		gambitList = newList;

	}

	/**
	 * Sort gambit by priority, then loop for finding first gambit matching
	 * 
	 * @param persoList
	 * @return gambits
	 */
	public Gambit chooseGambit(ArrayList<Personnage> persoList) {
		sortGambitByPriority();

		for (Gambit gambits : gambitList) {
			if (gambits.checkgambit(persoList)
					&& checkGambitSkillUsable(gambits)) {
				return gambits;
			}
		}
		return null;

	}

	/**
	 * Verify if gambit can be used with mp
	 * 
	 * @param gambit
	 * @return false
	 */
	public boolean checkGambitSkillUsable(Gambit gambit) {
		if (gambit.getSk().getCost() <= this.getMp())
			return true;
		return false;
	}

	/**
	 * Print hp + mp
	 */
	public void printStatus() {
		System.out.print(getName() + "    HP : " + getHp() + "     MP : "
				+ getMp());
		System.out.println();
	}

	/**
	 * 
	 * @return expValue
	 */
	public int getExpValue() {
		return expValue;
	}

	/**
	 * 
	 * @param expValue
	 */
	public void setExpValue(int expValue) {
		this.expValue = expValue;
	}

	/**
	 * 
	 * @return gambitList
	 */
	public ArrayList<Gambit> getGambitList() {
		return gambitList;
	}

	/**
	 * 
	 * @param gambitList
	 */
	public void setGambitList(ArrayList<Gambit> gambitList) {
		this.gambitList = gambitList;
	}

	/**
	 * Set hp, if negative -> 0
	 * 
	 * @param hp
	 */
	public void setHp(long hp) {
		if (hp < 0)
			hp = 0;
		if (hp > hpMax)
			hp = hpMax;
		this.hp = hp;
	}

}
