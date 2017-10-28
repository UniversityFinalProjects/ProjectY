package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class HelloController {

    @RequestMapping("/")
    public String home() throws UnknownHostException {
        return "Hostname: "+InetAddress.getLocalHost().getHostName()+", Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

}