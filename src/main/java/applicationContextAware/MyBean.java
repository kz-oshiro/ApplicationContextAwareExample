package applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.Data;

@Data
public class MyBean implements ApplicationContextAware {
    private ApplicationContext context;
    private String userPopertyValue;
    @Value("${setting1}")
    private String setting1;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        userPopertyValue = this.context.getEnvironment().getProperty("userPopertyValue");
    }

    public void doSomething() {
        System.out.println("Your property value is : " + userPopertyValue);
    }

	public String getSetting1() {
		return setting1;
	}
}
