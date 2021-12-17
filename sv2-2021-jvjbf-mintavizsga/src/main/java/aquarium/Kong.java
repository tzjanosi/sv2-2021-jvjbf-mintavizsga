package aquarium;

public class Kong extends Fish{
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        setShortTermMemoryLoss(false);
    }

    @Override
    public void feed() {
        setWeight(getWeight()+2);
    }
}
