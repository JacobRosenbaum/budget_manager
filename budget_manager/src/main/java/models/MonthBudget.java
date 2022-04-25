package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Month;
import java.time.Year;

@AllArgsConstructor
public class MonthBudget {
    @Getter
    @Setter
    private int monthBudgetId;

    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private Month month;

    @Getter
    @Setter
    private Year year;

    @Getter
    @Setter
    private Category category;

    @Getter
    @Setter
    private BigDecimal amount;

    @Getter
    @Setter
    private BigDecimal total;
}
