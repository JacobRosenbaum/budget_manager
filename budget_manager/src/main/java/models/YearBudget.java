package models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class YearBudget {
    @Getter
    @Setter
    private int yearBudgetId;

    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private List<MonthBudget> monthBudget;

    @Getter
    @Setter
    private BigDecimal total;
}
