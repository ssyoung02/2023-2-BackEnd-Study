package GDSC.backend.GDSC_4th_HW;

import org.springframework.stereotype.Component;

@Component
public class A {
    private GDSC.backend.GDSC_4th_HW.B b;
    private GDSC.backend.GDSC_4th_HW.C c;

    public GDSC.backend.GDSC_4th_HW.B getB() {
        return b;
    }

    public GDSC.backend.GDSC_4th_HW.C getC() {
        return c;
    }
    @Autowired
    public A(GDSC.backend.GDSC_4th_HW.B b, GDSC.backend.GDSC_4th_HW.C c){
        this.b=b;
        this.c=c;
    }
}