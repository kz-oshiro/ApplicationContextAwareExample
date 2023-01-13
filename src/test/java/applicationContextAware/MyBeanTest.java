package applicationContextAware;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import config.TestConfig;

@SpringJUnitConfig(TestConfig.class)
public class MyBeanTest {

	@Autowired
	private MyBean myBean;

	@Test
	public void test() {
		assertNotNull(myBean);
		myBean.doSomething();
		assertThat(myBean.getSetting1()).isEqualTo("def");
		}
}
