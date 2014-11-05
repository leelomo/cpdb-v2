package hk.ed.cpdb.util;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class DatabaseDDLGenerator {
	public static void main(String[] args) {
		System.out.println("re-create tables?(Y/N)");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		boolean create = false;
		if(answer.equalsIgnoreCase("Y")){
			create = true;
		}
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		LocalSessionFactoryBean sessionFactory = context.getBean("&sessionFactory", LocalSessionFactoryBean.class);
		Configuration config = sessionFactory.getConfiguration();
		SchemaExport schemaExport = new SchemaExport(config);
		schemaExport.setFormat(true);
		schemaExport.setDelimiter(";");
		schemaExport.create(true, create);
		/*if(create){
			TestUserService userService = context.getBean(TestUserService.class);
			TestUser testUser = userService.add(1, "admin", "administrator", "psw", 10);
			
			AddressService addressService = context.getBean(AddressService.class);
			addressService.add(1, 5, "Somewhere building", "Nowhere street", testUser);
		}*/
		context.close();
		scanner.close();
		System.out.println("Done");
	}
}
