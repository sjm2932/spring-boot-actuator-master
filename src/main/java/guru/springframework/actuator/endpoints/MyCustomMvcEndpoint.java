package guru.springframework.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
import org.springframework.stereotype.Component;

@Component
public class MyCustomMvcEndpoint extends EndpointMvcAdapter {

    public MyCustomMvcEndpoint(MyCustomEndpoint delegate) {
        super(delegate);
    }
}
