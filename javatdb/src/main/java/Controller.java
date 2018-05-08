package javatdb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    JdbcTemplate jdbc;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String index() {
        jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");
        return "data inserted Successfully";
    }
}