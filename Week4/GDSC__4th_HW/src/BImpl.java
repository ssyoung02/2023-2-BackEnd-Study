package GDSC.backend.GDSC_4th_HW;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BImpl implements GDSC.backend.GDSC_4th_HW.B {
    @Override
    public void funcB() {
        log.info("function B");
    }
}