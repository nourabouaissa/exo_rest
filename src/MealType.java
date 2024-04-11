import java.util.Objects;

public class MealType {
    private final String value;

    public MealType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MealType mealType = (MealType) o;
        return Objects.equals(value, mealType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
