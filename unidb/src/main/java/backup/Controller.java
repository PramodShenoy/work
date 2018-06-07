package backup;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.sql.DataSource;
import java.sql.Date;
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

    @RequestMapping(value = "/post",method = RequestMethod.POST)
   public ResponseEntity<Void> postData(@RequestBody UniPOJO uniPOJO, UriComponentsBuilder uriComponentsBuilder)
    {
        DSLContext dsl=null;
        log.info(uniPOJO.toString());
        try
        {
            dsl = DSL.using(dataSource.getConnection());
        }catch (SQLException s)
        {
            log.error("ERROR IN CONNECTION");
            s.printStackTrace();
        }
        dsl.insertInto(UNI,UNI.ID,UNI.NAME,UNI.CITY,UNI.COUNTRY)
                .values(uniPOJO.getId(), uniPOJO.getName(),uniPOJO.getCity(),uniPOJO.getCountry()).execute();
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
