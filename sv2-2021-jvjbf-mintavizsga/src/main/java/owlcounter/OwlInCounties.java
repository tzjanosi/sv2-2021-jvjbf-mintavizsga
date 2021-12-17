package owlcounter;

public class OwlInCounties {
    private final String name;
    private final int countOfOwls;

    public OwlInCounties(String name, int countOfOwls) {
        this.name = name;
        this.countOfOwls = countOfOwls;
    }

    public String getName() {
        return new String(name);
    }

    public int getCountOfOwls() {
        return countOfOwls;
    }
}
