package pochimon;

abstract public class ElementAbs {
    protected String name;
    protected int exp;
    protected int level;
    protected int expToNextLevel;

    
    public ElementAbs(String name, int level, int exp, int expToNextLevel) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.expToNextLevel = expToNextLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getExpToNextLevel() {
        return expToNextLevel;
    }

    public void setExpToNextLevel(int expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }
}
