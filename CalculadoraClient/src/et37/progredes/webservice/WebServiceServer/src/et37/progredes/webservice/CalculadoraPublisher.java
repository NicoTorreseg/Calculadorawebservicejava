package et37.progredes.webservice;
import javax.xml.ws.Endpoint;


public class CalculadoraPublisher {

	public static void main(String[] args) {
		String url="http://localhost:8080/WS/Calculadora";
		
		System.out.println("Publicando web service...");
		System.out.println("URL -> "+url);
		System.out.println("WSDL -> "+url+"?wsdl");
		
		Endpoint.publish(url, new CalculadoraImpl());  
			
	}

}
