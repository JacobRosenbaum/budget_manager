package budget.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Category {
    AUTO(1, "Auto"),
    HOME(2, "Home"),
    TRAVEL(3, "Travel"),
    ENTERTAINMENT(4, "Entertainment"),
    MEDICAL(5, "Medical"),
    UTILITIES(6, "Utilities"),
    FOOD(7, "Food"),
    PERSONAL_ITEMS(8, "Personal Items"),
    OTHER(9, "Other");

    @Getter
    private final int value;
    @Getter
    private final String name;

    public static Category findByValue(int value) {
        for (Category Category : Category.values()) {
            if (Category.getValue() == value) {
                return Category;
            }
        }
        String message = String.format("No Category with value: %s.", value);
        throw new RuntimeException(message);
    }

    public static Category findByName(String name) {
        for (Category Category : Category.values()) {
            if (Category.getName().equalsIgnoreCase(name)) {
                return Category;
            }
        }
        String message = String.format("No Category with name: %s.", name);
        throw new RuntimeException(message);
    }

}
