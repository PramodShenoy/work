package hibernatesb;
import java.util.List;
import hibernatesb.Person;
import hibernatesb.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(value = "/person")
public class MyController {
    @Autowired
    private PersonDAO personDao;
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(long id) {
        try {
            Person person = new Person();
            person.setId(id);
            personDao.delete(person);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Person succesfully deleted!";
    }
    @RequestMapping(value = "/save")
    @ResponseBody
    public String create(String name, String city) {
        try {
            Person person = new Person();
            person.setName(name);
            person.setCity(city);
            personDao.savePerson(person);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Person succesfully saved!";
    }
    @RequestMapping(value = "/allPersons")
    @ResponseBody
    public List<Person> getAllPersons() {
        try {
            return personDao.getAllPersons();
        } catch (Exception ex) {
            return null;
        }
    }
}