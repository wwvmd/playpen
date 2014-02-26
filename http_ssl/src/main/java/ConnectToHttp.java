import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ash
 * Date: 26/02/14
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
public class ConnectToHttp {

    public static void main(String args[]) throws IOException {


        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://raspberrypi");
        CloseableHttpResponse response1 = httpclient.execute(httpGet);
        InputStream inputStream = response1.getEntity().getContent();
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();


    }


}
