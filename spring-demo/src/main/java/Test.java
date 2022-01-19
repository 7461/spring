import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Test
 * @Author: guf
 * @Date: 2022/1/19 11:34
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		String applicationName = applicationContext.getApplicationName();
		System.out.println(applicationName);
	}
}
