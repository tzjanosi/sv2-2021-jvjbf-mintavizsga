package aquarium;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;
    private boolean shortTermMemoryLoss;

    public String getStatus() {
        return name +", weight: " + weight +
                ", color: " + color +
                ", short-term memory loss: " + shortTermMemoryLoss;
    }

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        shortTermMemoryLoss=false;
    }

    public abstract void feed();

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setShortTermMemoryLoss(boolean shortTermMemoryLoss) {
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }

    public String getName() {
        return new String(name);
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return new String(color);
    }

    public boolean hasMemoryLoss() {
        return shortTermMemoryLoss;
    }
}
