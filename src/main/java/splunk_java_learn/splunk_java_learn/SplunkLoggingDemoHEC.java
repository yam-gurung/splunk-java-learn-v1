package splunk_java_learn.splunk_java_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.splunk.logging.SplunkCimLogEvent;

public class SplunkLoggingDemoHEC {

	
	static Logger logger = LoggerFactory.getLogger("splunk.logger");
	
	public static void main(String[] args) {
		System.out.println("called main class");
		logger.info("this is test again");
		SplunkCimLogEvent event = new SplunkCimLogEvent("logging event","info");
		event.setAuthApp("newapp");
		
		event.addField("job_name","emp_loader");
		event.addField("extract_name","employee.xml");
		event.addField("status", "success");
		
		logger.info(event.toString());
		System.out.println("send successfully log to splunk");
	}

}
