package budget.data;

import budget.models.Category;
import budget.models.YearBudget;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface YearBudgetRepository {
    List<YearBudget> findAll();

    YearBudget findById(int yearBudgetId);

    YearBudget findByUserId(int userId);

    YearBudget findByYearId(int userId);

    List<YearBudget> findByCategory(Category category);

    @Transactional
    YearBudget add(YearBudget YearBudget);

    @Transactional
    boolean update(YearBudget YearBudget);

    @Transactional
    boolean deleteById(int YearBudgetId);
}
