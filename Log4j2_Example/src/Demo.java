import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Demo {
	static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args){
		while (true) {
			System.out.println("Please Enter Your text");
			Scanner scanner = new Scanner(System.in);
			String txt = scanner.nextLine();
			log.info("Info : info text is " + txt);
			log.warn("Warning : warning text is " + txt);
			log.debug("Debug : debug text is " + txt);
			log.error("Error : error text is " + txt);
			log.fatal("Fatal : fatal text is " + txt);
		}
	}

}
