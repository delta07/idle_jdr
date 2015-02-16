package com.idlejdr.model.personnage;

import java.util.ArrayList;

import com.idlejdr.model.item.Item;
import com.idlejdr.model.personnage.Gambit.GambitCaracCible;
import com.idlejdr.model.personnage.Gambit.GambitCible;
import com.idlejdr.model.personnage.Gambit.GambitOpe;
import com.idlejdr.model.skill.DefaultAttack;
import com.idlejdr.model.skill.Skill;

public class Personnage {
	public enum Job {
		Fighter, Caster;
	}

	public enum Type {
		ally, enemy, neutral;
	}

	private String name;
	private long hpMax, mpMax, hp, mp, attp, attm, defp, defm, exp;
	private long level;
	private Type type;
	protected int expValue = 0;

	public int getExpValue() {
		return expValue;
	}

	public void setExpValue(int expValue) {
		this.expValue = expValue;
	}

	private Job job;
	private ArrayList<Item> itemList;
	private ArrayList<Skill> skillList;
	private ArrayList<Gambit> gambitList;

	public ArrayList<Gambit> getGambitList() {
		return gambitList;
	}

	public void setGambitList(ArrayList<Gambit> gambitList) {
		this.gambitList = gambitList;
	}

	public void setHp(long hp) {
		if (hp < 0)
			hp = 0;
		if (hp > hpMax)
			hp = hpMax;
		this.hp = hp;
	}

	public Personnage(Personnage.Job monjob, String name, long hp, long mp,
			long attp, long defp, long attm, long defm, Type type) {

		skillList = new ArrayList<Skill>();
		gambitList = new ArrayList<Gambit>();

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

	/*
	 * Creation de perso auto selon la classe de personnage
	 * 
	 * @Param Personnage.Job job,String name
	 * 
	 * @Author Delta
	 */
	public Personnage(Personnage.Job job, String name, Type type) {
		// job = new Job;
		itemList = new ArrayList<Item>();
		skillList = new ArrayList<Skill>();
		gambitList = new ArrayList<Gambit>();
		this.name = new String();

		this.job = job;
		this.name = name;
		this.type = type;
		this.level = 1;

		createDefaultGambit();
		calculStat();

	}

	public void createDefaultGambit() {
		DefaultAttack defaultAtta = new DefaultAttack("Attaque de base",
				"Attaque de base", getJob(), 1, 0);
		addSkill(defaultAtta);
		Gambit defaultAtt = new Gambit(GambitCaracCible.hp, GambitCible.enemy,
				GambitOpe.supEqual, 100, 0, defaultAtta);
		addGambit(defaultAtt);
	}

	public Personnage(Personnage.Job job, String name, long level, Type type) {
		skillList = new ArrayList<Skill>();
		gambitList = new ArrayList<Gambit>();

		this.job = job;
		this.name = name;
		this.level = level;
		this.type = type;
		Gambit defaultAtt = new Gambit(GambitCaracCible.hp, GambitCible.enemy,
				GambitOpe.supEqual, 100, 0, new DefaultAttack(
						"Attaque de base", "Attaque de base", getJob(), 1, 0));
		addGambit(defaultAtt);
		calculStat();
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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

	public long getMp() {
		return mp;
	}

	public void setMp(long mp) {
		if (mp < 0)
			mp = 0;
		if (mp > this.mpMax)
			mp = this.mpMax;
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

	public long getHpMax() {
		return hpMax;
	}

	public void setHpMax(long hpMax) {
		this.hpMax = hpMax;
	}

	public long getMpMax() {
		return mpMax;
	}

	public void setMpMax(long mpMax) {
		this.mpMax = mpMax;
	}

	public void addGambit(Gambit gambit) {
		// System.out.println(gambit.getSk().getName());
		this.gambitList.add(gambit);
		// System.out.println(gambitList.get(0).getSk().getName());

	}

	public void sortGambitByPriority() {
		// for (Gambit gb : gambitList) {
		// System.out.println(gb.getSk().getName());
		// }

		ArrayList<Gambit> newList = new ArrayList<Gambit>();
		for (int i = 1; i <= 100; i++) {
			for (Gambit gb : gambitList) {
				if (gb.getPriority() == i)
					newList.add(gb);
			}
		}
		gambitList = newList;

	}

	/*
	 * Tri les gambit par ordre de priorite Boucle ensuite pour trouver le
	 * premier gambit dont les conditions sont respectees
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

	public boolean checkGambitSkillUsable(Gambit gambit) {
		if (gambit.getSk().getCost() <= this.getMp())
			return true;
		return false;
	}

	public void printStatus() {
		System.out.print(getName() + "    HP : " + getHp() + "     MP : "
				+ getMp());
		System.out.println();
	}
}
