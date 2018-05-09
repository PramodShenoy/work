package unidb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import unidb.UniDAO;
import unidb.Uni;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private UniDAO uniDAO;
    /*@GetMapping("uni/{name}")
    public ResponseEntity<Uni> getUniByName(@PathVariable("name") String name)
    {
        Uni res = uniDAO.getUnibyName(name);
        System.out.println("+++++++++++++++++++++"+res+"+++++++++++++++++++");
        return new ResponseEntity<Uni>(res,HttpStatus.OK);
    }
    //loclahost:8080/?country=USA
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Uni>> getUniByCntry(@RequestParam(value = "country") String country)
    {
       List<Uni> list = uniDAO.getUnibyCountry(country);
       return new ResponseEntity<List<Uni>>(list,HttpStatus.OK);
    }*/

    @RequestMapping(value = "/uni", params = "name")
    public ResponseEntity<List<Uni>> getUniByName(@RequestParam String name)
    {
        List<Uni> list = uniDAO.getUnibyName(name);
        return new ResponseEntity<List<Uni>>(list,HttpStatus.OK);
    }

    @RequestMapping(value = "/uni", params = "country")
    public ResponseEntity<List<Uni>> getUniByCntry(@RequestParam String country)
    {
        List<Uni> list = uniDAO.getUnibyCountry(country);
        return new ResponseEntity<List<Uni>>(list,HttpStatus.OK);
    }
    @GetMapping("uni/all")
    public ResponseEntity<List<Uni>> getAllUni()
    {
        List<Uni> list = uniDAO.getAllUni();
        return new ResponseEntity<List<Uni>>(list,HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Void> addUni(@RequestBody Uni uni, UriComponentsBuilder builder) {
        uniDAO.addUni(uni);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/uni/{name}").buildAndExpand(uni.getName()).toUri());
        headers.setLocation(builder.path("/{country}").buildAndExpand(uni.getCountry()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping("uni/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
        uniDAO.removeUni(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
