package laptopdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import javax.sql.DataSource;
import java.util.List;

@Controller
public class MyController
{
    @Autowired
    private laptopdb.LaptopDAO laptopDAO;
    @Autowired
    private DataSource dataSource;

    @GetMapping("/laptop/{name}")
    public ResponseEntity<laptopdb.Laptop> getLaptopByName(@PathVariable("name") String name)
    {
        laptopdb.Laptop laptop = laptopDAO.getLaptopByName(name);
        return new ResponseEntity<laptopdb.Laptop>(laptop,HttpStatus.OK);
    }

    @GetMapping("/laptop")
    public ResponseEntity<List<laptopdb.Laptop>> getLaptops()
    {
        System.out.println("DATASOURCE IS: " + dataSource);
        List<laptopdb.Laptop> list = laptopDAO.getAllLaptops();
        return new ResponseEntity<List<laptopdb.Laptop>>(list,HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Void> insertData(@RequestBody laptopdb.Laptop laptop, UriComponentsBuilder builder)
    {
        laptopDAO.add(laptop);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/laptop/{name}").buildAndExpand(laptop.getName()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}