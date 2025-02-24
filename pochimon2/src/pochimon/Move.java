package pochimon;

public class Move extends ElementAbs {
    private int id;
    private int powerPoints;
    private int maxPowerPoints;
    private Type type;

    public Move() {
        super("defaultName", 1, 0, 10);
    }

    public Move(String name, int powerPoints, int maxPowerPoints, Type type) {
        super(name, 1, 0, 10);

    }

    public Move(int id, String name, int powerPoints, int maxPowerPoints, Type type) {
        super(name, 1, 0, 10);
        this.id = id;
        this.powerPoints = powerPoints;
        this.maxPowerPoints = maxPowerPoints;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public int getMaxPowerPoints() {
        return maxPowerPoints;
    }

    public void setMaxPowerPoints(int maxPowerPoints) {
        this.maxPowerPoints = maxPowerPoints;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void useMove() {
        if (powerPoints > 0) {
            powerPoints--;
        } else {
            System.out.println("No power points left!");
        }
    }
}
