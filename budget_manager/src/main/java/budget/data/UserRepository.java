package budget.data;

import budget.models.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findByEmail(String email);

    @Transactional
    User add(User User);

    @Transactional
    boolean update(User User);

    @Transactional
    boolean deleteById(int UserId);
}
