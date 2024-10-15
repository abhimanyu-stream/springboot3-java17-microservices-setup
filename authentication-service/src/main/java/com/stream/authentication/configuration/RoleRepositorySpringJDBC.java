package com.stream.authentication.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositorySpringJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //private final String SQL_CHECK_EITHER_TABLE_IS_EMPTY_OR_NOT = "SELECT EXISTS(SELECT 1 FROM authentication.role)";
    private final String SQL_CHECK_EITHER_TABLE_IS_EMPTY_OR_NOT = "SELECT COUNT(*) FROM `authentication-service`.role";
    private final String SQL_DELETE_ALL_RECORDS = "DELETE FROM `authentication-service`.role";
    private final String SQL_INSERT_ROLE_ADMIN = "insert into `authentication-service`.role(id, rolename) values(?,?)";
    private final String SQL_INSERT_ROLE_USER = "insert into `authentication-service`.role(id, rolename) values(?,?)";
    private final String SQL_INSERT_ROLE_MODERATOR = "insert into `authentication-service`.role(id, rolename) values(?,?)";

    public int deleteAllRecords(){
        // If the output is 1, it means the table isn’t empty; otherwise, it’s empty
       Integer rowCount = jdbcTemplate.queryForObject(SQL_CHECK_EITHER_TABLE_IS_EMPTY_OR_NOT, Integer.class);
       if(rowCount != null && rowCount > 0 ){
            System.out.println("authentication-service.role was not empty, so delete all query executed...");
            return jdbcTemplate.update(SQL_DELETE_ALL_RECORDS);
       }
       return 0;
    }

    public boolean insertIntoRoleAdmin() {
        return jdbcTemplate.update(SQL_INSERT_ROLE_ADMIN, 1, "ROLE_ADMIN") > 0;
    }
    public boolean insertIntoRoleUser() {
        return jdbcTemplate.update(SQL_INSERT_ROLE_USER, 2, "ROLE_USER") > 0;
    }
    public boolean insertIntoRoleModerator() {
        return jdbcTemplate.update(SQL_INSERT_ROLE_MODERATOR, 3, "ROLE_MODERATOR") > 0;
    }



}
/**
 * @Component
 * public class DemoData implements CommandLineRunner {
 *
 *     @Autowired
 *     private final EntityRepository repo;
 *
 *     @Override
 *     public void run(String...args) throws Exception {
 *
 *         repo.save(new Entity(...));
 *     }
 * }
 *
 * @Component
 * public class DemoData implements ApplicationRunner {
 *
 *     @Autowired
 *     private final EntityRepository repo;
 *
 *     @Override
 *     public void run(ApplicationArguments args) throws Exception {
 *
 *         repo.save(new Entity(...));
 *     }
 * }
 * */