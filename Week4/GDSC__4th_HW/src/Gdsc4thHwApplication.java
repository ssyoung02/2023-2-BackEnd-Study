package GDSC.backend.GDSC_4th_HW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Gdsc4thHwApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Gdsc4thHwApplication.class, args);
        GDSC.backend.GDSC_4th_HW.A a = applicationContext.getBean("a", GDSC.backend.GDSC_4th_HW.A.class);
        GDSC.backend.GDSC_4th_HW.D d = applicationContext.getBean("d", GDSC.backend.GDSC_4th_HW.D.class);

        a.getB().funcB();
        a.getC().funcC();

        d.getC().funcC();
    }

}