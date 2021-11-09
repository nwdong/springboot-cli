package nwdong.springbootcli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CliComponent1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        
        for(int i = 0; i < 10; i++){

            System.out.println("====== CliComponent1 running with argument ======");

            for(String arg : args)
                System.out.println("arg=" + arg);
            
            Thread.sleep(1000);

        }
        
    }

}
