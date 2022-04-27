package budget.data.mappers;

import budget.models.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserMap {
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User User = new User();
        User.setUserId(resultSet.getInt("user_id"));
        User.setFirstName(resultSet.getString("first_name"));
        User.setLastName(resultSet.getString("last_name"));
        User.setEmail(resultSet.getString("email"));
        User.setEmail(resultSet.getString("password"));
        return User;
    }
}
