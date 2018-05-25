package trial;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args)throws Exception
    {
        String url = "https://loanapiweb-dev.capitalfloat.com/LoanApiService/LoanApiService.svc/disbursemendetails?sanction_id=2fc94c87-1f0e-4685-84a0-f9be2d46d9f5";
        HttpGet httpget = new HttpGet(url);
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet method = new HttpGet(url);
        method.setHeader("x-forward-e","23438d57e27771522e09d71ed108b89bb1cb72f476e2efc44f09f548af58cfcbfd87435ada6df566eaed22007b7676f53f970acd3ca07def68e5d4fcc4aa7543");
        method.setHeader("x-host-s","7e286aea06eb579b6de1442ff56ab9132ca8df9de08df9a160833e8fdeeaf6baf00425bdaf05cc7aca5574f1071b92ce03f08ae7376f0bdcc6d24fd6a2eaa711");
        HttpResponse httpResponse = httpClient.execute(method);
        BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
        String content="", line;
        while ((line = br.readLine()) != null) {
            content = content + line;
        }
        System.out.print(content);
    }
}
