package budget.data;

import budget.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserJdbcRepository implements UserRepository{
    private final JdbcTemplate jdbcTemplate;

    public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<User> findAll() {
        final String sql = "select" +
                " c.customer_id," +
                " c.first_name," +
                " c.last_name," +
                " c.email," +
                " ua.user_password," +
                " c.address_line," +
                " c.city," +
                " c.state," +
                " c.zip_code," +
                " c.phone," +
                " c.user_role" +
                " from customer c" +
                " inner join user_account ua on c.customer_id = ua.customer_id;";

        List<User> users = jdbcTemplate.query(sql, new CustomerMapper());

        return users;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User add(User User) {
        return null;
    }

    @Override
    public boolean update(User User) {
        return false;
    }

    @Override
    public boolean deleteById(int UserId) {
        return false;
    }
}
