package budget.data;

import budget.models.Category;
import budget.models.MonthBudget;
import org.springframework.transaction.annotation.Transactional;

import java.time.Month;
import java.util.List;

public interface MonthBudgetRepository {
    List<MonthBudget> findAll();

    MonthBudget findById(int monthBudgetId);

    MonthBudget findByUserId(int userId);

    MonthBudget findByMonth(Month month);

    List<MonthBudget> findByCategory(Category category);

    @Transactional
    MonthBudget add(MonthBudget MonthBudget);

    @Transactional
    boolean update(MonthBudget MonthBudget);

    @Transactional
    boolean deleteById(int MonthBudgetId);
}
