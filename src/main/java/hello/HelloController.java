package hello;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.InetAddress;

@RestController
public class HelloController {

    @RequestMapping("/")
    @SneakyThrows
    public String index() {
        String hostname = InetAddress.getLocalHost().getHostName();
        return "Hostname: "+hostname+ "! Greetings from Spring Boot!";
    }

}