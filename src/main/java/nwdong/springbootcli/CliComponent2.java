package nwdong.springbootcli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
// CommandLineRunner is a simple Spring Boot interface with a run method. Spring
// Boot will automatically call the run method of all beans implementing this
// interface after the application context has been loaded.
public class CliComponent2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        
        for(int i = 0; i < 10; i++){

            System.out.println("====== CliComponent2 running ======");

            Thread.sleep(500);

        }

    }

}
