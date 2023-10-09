package GDSC.backend.GDSC_4th_HW;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class D {
    private GDSC.backend.GDSC_4th_HW.C c;

    public GDSC.backend.GDSC_4th_HW.C getC() {
        return c;
    }
}