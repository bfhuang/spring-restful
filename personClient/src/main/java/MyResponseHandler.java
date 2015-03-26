import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * Created by twer on 3/25/15.
 */
public class MyResponseHandler implements ResponseErrorHandler {
    private DefaultResponseErrorHandler defaultResponseErrorHandler=new DefaultResponseErrorHandler();

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        System.out.println("--------"+response.getStatusCode().value());
        return defaultResponseErrorHandler.hasError(response);
//        return false;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException{
//        throw new RuntimeException();
        System.out.println(response.getStatusCode().value());
        System.out.println("some error happened");
    }
}
