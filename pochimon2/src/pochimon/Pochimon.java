package pochimon;

import java.util.ArrayList;

public class Pochimon extends ElementAbs implements ICatchable {

	private int pochidexNumber;
	private PochimonSpecies specie;
	private String description;
	private boolean shiny;
	private boolean wild;
	private ArrayList<Move> moves;
	private PochimonSpecies evolution;
	private int maxHp;
	private int hp;
	private int attack;
	private int defense;
	private int specialAttack;
	private int specialDefense;
	private int speed;

	public Pochimon() {
		super("defaultName", 1, 0, 10);
	}
	public Pochimon(String _name, int _level, int _exp, int _expToNextLevel) {
		super(_name, _level, _exp, _expToNextLevel);

	}

	public Pochimon(String _name, int _level, int _exp, int _expToNextLevel, int _pochidexNumber, PochimonSpecies _specie, String _description, boolean _shiny,
			boolean _wild, ArrayList<Move> _moves, PochimonSpecies _evolution, int _maxHp,
			int _hp,
			int _attack, int _defense, int _specialAttack, int _specialDefense, int _speed) {
		super(_name, _level, _exp, _expToNextLevel);
		this.pochidexNumber = _pochidexNumber;
		this.name = _name;
		this.specie = _specie;
		this.description = _description;
		this.shiny = _shiny;
		this.wild = _wild;
		this.moves = _moves;
		this.evolution = _evolution;
		this.maxHp = _maxHp;
		this.hp = _hp;
		this.attack = _attack;
		this.defense = _defense;
		this.specialAttack = _specialAttack;
		this.specialDefense = _specialDefense;
		this.speed = _speed;

	}

	public int attackFoe(Pochimon _foe) {
		return 0; // TODO4
	}

	public int getDamaged(int _damage) {
		return 0; // TODO1
	}

	public void heal(int _hp) {
		// TODO2
	}

	public void levelUp() {
		// TODO3
	}

	public PochimonSpecies evolve() {
		return evolution;
	}

	public int getPochidexNumber() {
		return pochidexNumber;
	}

	public void setPochidexNumber(int _num) {
		this.pochidexNumber = _num;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public PochimonSpecies getSpecie() {
		return specie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String _description) {
		this.description = _description;
	}

	public boolean isShiny() {
		return shiny;
	}

	public boolean isWild() {
		return wild;
	}

	public ArrayList<Move> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<Move> moves) {
		this.moves = moves;
	}

	public void changeMove(Move _move, int _position) {
		if (_position >= 0 && _position < moves.size()) {
			moves.set(_position, _move);
		} else {
			System.out.println("Invalid position");
		}
	}

	public PochimonSpecies getEvolution() {
		return evolution;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getSpecialAttack() {
		return specialAttack;
	}

	public int getSpecialDefense() {
		return specialDefense;
	}

	public int getSpeed() {
		return speed;
	}

	public int getXp() {
		return exp;
	}

	public int addXp(int _xp) {
		this.exp += _xp;
		return this.exp;
	}

	public int getXpToNextLevel() {
		return expToNextLevel;
	}

	@Override
	public boolean tryToCatch() {
		
		return false;
	}

	@Override
	public double getCaptureRate() {
		return 0;
	}

}
