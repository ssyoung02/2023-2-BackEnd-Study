@Component
public class ClassA {
    @Bean
    public BeanA beanA(){
        return new BeanA();
    }
}