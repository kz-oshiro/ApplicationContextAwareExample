package applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements ApplicationContextAware {
    private ApplicationContext context;
    private String userPopertyValue;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        userPopertyValue = this.context.getEnvironment().getProperty("userPopertyValue");
    }

    public void doSomething() {
        System.out.println("Your property value is : " + userPopertyValue);
    }
}
