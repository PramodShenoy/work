package springxml;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    springxml.Customer cs=null;
    ArrayList<springxml.Customer> cs_list=new ArrayList<>();
    @GetMapping("/customer")
    public String getCustomer(){
        String xml="";
        for (springxml.Customer item:cs_list) {
            JSONObject json = new JSONObject(item);
            xml = xml.concat(XML.toString(json,"customer"));
            System.out.println(xml);
        }
        //XML.toJSONObject(java.lang.String string) for converting XML to JSON
       return xml;
    }

    @PostMapping("/customer")
    public String postCustomer(@RequestBody springxml.Customer customer){
        System.out.println(customer);
        cs_list.add(customer);
        return "Done";
    }

}