package springxml;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.crypto.dsig.XMLObject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    springxml.Customer cs=null;
    ArrayList<springxml.Customer> cs_list=new ArrayList<>();
    @GetMapping("/customer")
    public String getCustomer(){
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<customers>";
        if (cs_list.isEmpty())
            return null;
        else
        for (springxml.Customer item:cs_list) {
            JSONObject json = new JSONObject(item);
            xml = xml + "\n";
            xml = xml.concat(XML.toString(json,"customer"));
            //System.out.println(xml);
        }
        xml = xml.concat("\n</customers>");
        System.out.println(xml);
        /*Document doc=null;
        try
        {
           doc = loadXML(xml);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
       return doc;*/
        return xml;
    }

    @PostMapping("/customer")
    public String postCustomer(@RequestBody springxml.Customer customer){
        //System.out.println(customer);
        cs_list.add(customer);
        return "Done";
    }

    public static Document loadXML(String xml) throws Exception
    {
        DocumentBuilderFactory fctr = DocumentBuilderFactory.newInstance();
        DocumentBuilder bldr = fctr.newDocumentBuilder();
        InputSource insrc = new InputSource(new StringReader(xml));
        return bldr.parse(insrc);
    }

}