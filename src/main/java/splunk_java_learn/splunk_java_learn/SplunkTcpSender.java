package splunk_java_learn.splunk_java_learn;

import java.io.PrintWriter;
import java.net.Socket;

public class SplunkTcpSender {

	public static void main(String[] args) {
		String splunkhost="localhost";
		int splunkport=9997;
		
		try(Socket socket=new Socket(splunkhost,splunkport);
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true)
				){
			String eventToSend = "this is an event from java application";
			out.println(eventToSend);
			
			System.out.println("data send to splunk via tcp");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
