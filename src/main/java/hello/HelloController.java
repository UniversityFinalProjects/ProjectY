package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;


@SpringBootApplication
@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(){

        return getMachineInfo() + ", Docker Hub && Github && TravisCI";
    }

    private static String getMachineInfo(){
        Map<String, String> env = System.getenv();
        if (env.containsKey("COMPUTERNAME"))
            return env.get("COMPUTERNAME");
        else if (env.containsKey("HOSTNAME"))
            return env.get("HOSTNAME");
        else
            return "Unknown Computer";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

}