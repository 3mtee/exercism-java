import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        final String nameToUse = Objects.requireNonNullElse(name, "you");
        return "One for " + nameToUse + ", one for me.";
    }
}
