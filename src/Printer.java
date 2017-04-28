/**
 * Created by Piotr on 2017-04-28.
 */
public class Printer {

    private String name;
    private String model;
    private int levelOfBlackAtr;
    private int levelOfColorAtr;

    public Printer(String name, String model, int levelOfBlackAtr, int levelOfColorAtr) {
        this.name = name;
        this.model = model;
        this.levelOfBlackAtr = levelOfBlackAtr;
        this.levelOfColorAtr = levelOfColorAtr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLevelOfBlackAtr() {
        return levelOfBlackAtr;
    }

    public void setLevelOfBlackAtr(int levelOfBlackAtr) {
        this.levelOfBlackAtr = levelOfBlackAtr;
    }

    public int getLevelOfColorAtr() {
        return levelOfColorAtr;
    }

    public void setLevelOfColorAtr(int levelOfColorAtr) {
        this.levelOfColorAtr = levelOfColorAtr;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", levelOfBlackAtr=" + levelOfBlackAtr +
                ", levelOfColorAtr=" + levelOfColorAtr +
                '}';
    }

}
