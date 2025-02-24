package pochimon;

import java.util.ArrayList;

public class Trainer extends ElementAbs {

	private static int idsCreated = 0;
	private int id;
	private ArrayList<Badge> badges;
	private ArrayList<Pochimon> team;

	public Trainer(String _name, int _level, int _exp, int _expToNextLevel) {
		super(_name, _level, _exp, _expToNextLevel);
		this.id = ++idsCreated;
		this.badges = new ArrayList<>();
		this.team = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public int getLevel() {
		return level;
	}

	public void levelUp() {
		this.level++;
	}

	public int getXpToLevelUp() {
		return expToNextLevel;
	}

	public void addXp(int _xp) {
		this.exp += _xp;
	}

	public int getXp() {
		return exp;
	}

	public ArrayList<Badge> getBadges() {
		return badges;
	}

	public ArrayList<Pochimon> getTeam() {
		return team;
	}

	public void addBadge(Badge _badge) {
		badges.add(_badge);
	}

	public void removeBadge(Badge _badge) {
		badges.remove(_badge);
	}

	public void addPochimon(Pochimon _pochimon) {
		team.add(_pochimon);
	}

	public void removePochimon(Pochimon _pochimon) {
		team.remove(_pochimon);
	}

}
