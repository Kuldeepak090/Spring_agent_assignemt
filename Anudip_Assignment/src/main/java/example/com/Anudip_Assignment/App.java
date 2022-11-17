package example.com.Anudip_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "update agent set name='kuldeepak' where id=108";
		String SQL = "select * from agent";
		AgentDao a1 = (AgentDao) context.getBean("a2");
		int st = a1.saveAgent(new Agent(10, "deepak", "25%"));
		int st1= a1.updateAgent(new Agent(10,"kuldeepak","27%"));
		int st2=a1.deleteAgent(new Agent(10,"kuldeepak","27%"));
		System.out.println(st);
    }
}
