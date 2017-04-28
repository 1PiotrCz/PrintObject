import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Printer)) return false;
        Printer printer = (Printer) o;
        return levelOfBlackAtr == printer.levelOfBlackAtr &&
                levelOfColorAtr == printer.levelOfColorAtr &&
                Objects.equals(name, printer.name) &&
                Objects.equals(model, printer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, levelOfBlackAtr, levelOfColorAtr);
    }
}
