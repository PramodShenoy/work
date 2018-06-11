package backup;

import com.cf.public_.tables.records.UniRecord;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.util.encoders.Hex;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.sql.DataSource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

import static com.cf.public_.Tables.UNI;

@RestController
@Slf4j
public class Controller {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/get")
    public String get() {
        log.info("DATASOURCE IS " + dataSource);
        /*try {
            DSLContext dslContext = DSL.using(dataSource.getConnection());
            List<UniPOJO> list = dslContext.select(UNI.NAME,UNI.COUNTRY).from(UNI).fetchInto(UniPOJO.class);
            for (UniPOJO unipojo:list)
               log.info(unipojo.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            DSLContext dslContext = DSL.using(dataSource.getConnection());
            List<UniRecord> uniRecordList = dslContext.selectFrom(UNI).where(UNI.COUNTRY.eq("USA")).fetch();
            for (UniRecord uniRecord : uniRecordList) {
                String originalString = uniRecord.getId() + uniRecord.getCity() + uniRecord.getCountry() + uniRecord.getName();
                byte[] hash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
                String sha256hex = new String(Hex.encode(hash));
                log.info(uniRecord.toString());
                log.info(sha256hex);
                UniPOJO uniPOJO = new UniPOJO(uniRecord.getId(), uniRecord.getName(), uniRecord.getCity(), uniRecord.getCountry());
                return uniPOJO.toString();
            }
        } catch (Exception e) {
            log.error("eertyui");
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity<Void> postData(@RequestBody UniPOJO uniPOJO, UriComponentsBuilder uriComponentsBuilder) {
        DSLContext dsl;
        log.info(uniPOJO.toString());
        /*try {
            dsl = DSL.using(dataSource.getConnection());
            Result result = dsl.select(UNI.ID)
                    .from(UNI)
                    .where(UNI.ID.eq(uniPOJO.getId()))
                    .fetch();
            if (result.isEmpty())
                dsl.insertInto(UNI, UNI.ID, UNI.NAME, UNI.CITY, UNI.COUNTRY)
                        .values(uniPOJO.getId(), uniPOJO.getName(), uniPOJO.getCity(), uniPOJO.getCountry()).execute();
            else
                log.info("zsedcfghjkl");
        } catch (Exception s) {
            log.error("ERROR IN INSERTING");
            s.printStackTrace();
        }*/

        try {
            dsl = DSL.using(dataSource.getConnection());
            UniRecord uniRecord;
            uniRecord = dsl.newRecord(UNI);
            uniRecord.setId(uniPOJO.getId());
            uniRecord.setName(uniPOJO.getName());
            uniRecord.setCity(uniPOJO.getCity());
            uniRecord.setCountry(uniPOJO.getCountry());
            uniRecord.store();
        } catch (Exception s) {
            log.error("ERROR IN INSERTING");
            s.printStackTrace();
        }
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
