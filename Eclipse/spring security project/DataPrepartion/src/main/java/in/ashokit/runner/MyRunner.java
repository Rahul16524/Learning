package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String users_query = "INSERT INTO USERS(USERNAME,PASSWORD,ENABLED) VALUES(?,?,?)";
        String authorities_query = "INSERT INTO AUTHORITIES(USERNAME,AUTHORITY) VALUES(?,?)";

        BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();

        jdbcTemplate.update(users_query, "Allen", bCrypt.encode("allen@123"), true);
        jdbcTemplate.update(users_query, "John", bCrypt.encode("john@123"), false);
        jdbcTemplate.update(users_query, "Mike", bCrypt.encode("mike@123"), true);
        jdbcTemplate.update(users_query, "Sara", bCrypt.encode("sara@123"), false);

        jdbcTemplate.update(authorities_query, "Allen", "ROLE_ADMIN");
        jdbcTemplate.update(authorities_query, "John", "ROLE_ADMIN");
        jdbcTemplate.update(authorities_query, "Mike", "ROLE_USER");
        jdbcTemplate.update(authorities_query, "Sara", "ROLE_USER");



    }
}