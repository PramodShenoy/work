package backup;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

import static com.cf.public_.Tables.UNI;

@RestController
@Slf4j
public class Controller {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/get")
    public void get() {
        log.info("DATASOURCE IS " + dataSource);
        try {
            DSLContext dslContext = DSL.using(dataSource.getConnection());
            Result result = dslContext.select(UNI.NAME, UNI.CITY).from(UNI).fetch();
            System.out.println(result.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
