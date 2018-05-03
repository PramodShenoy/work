package shop;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;

@RestController
public class PaymentController {

    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;
    private shop.PaymentRequest re=null;
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public shop.PaymentResponse pay(@RequestParam(value = "key") String key, @RequestBody shop.PaymentRequest request) {

        shop.PaymentResponse response = new shop.PaymentResponse();
        if(sharedKey.equalsIgnoreCase(key))
        {
            int userId = request.getUserId();
            String itemId = request.getItemId();
            double discount = request.getDiscount();
            re = new shop.PaymentRequest();
            re.setUserId(userId);
            re.setDiscount(discount);
            re.setItemId(itemId);

            // Process the request
            // ....
            // Return success response to the client.
            System.out.println("+++++++++++++++++++++"+userId+"+++++++++++++++++");
            System.out.println("+++++++++++++++++++++"+itemId+"+++++++++++++++++");
            System.out.println("+++++++++++++++++++++"+discount+"+++++++++++++++++");

            response.setStatus(SUCCESS_STATUS);
            response.setCode(CODE_SUCCESS);
        }
        else
        {
            response.setStatus(ERROR_STATUS);
            response.setCode(AUTH_FAILURE);
        }
        return response;
    }
    @RequestMapping(value="/value",method = RequestMethod.GET)
    public double value()
    {
        if(re!=null) {
            System.out.println("----------------------" + re.getItemId() + "-----------------------");
            System.out.println("----------------------" + re.getUserId() + "-----------------------");
            System.out.println("----------------------" + re.getDiscount() + "-----------------------");
            double val = 1000 - re.getDiscount() * Double.parseDouble(re.getItemId());
            return val;
        }
        else
            return 0.0;
    }
}