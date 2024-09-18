package et37.progredes.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;  

@WebService  
public interface CalculadoraInterface {

	@WebMethod public double Sumar(double op1, double op2); 
	@WebMethod public double Restar(double op1, double op2); 
	@WebMethod public double Multiplicar(double op1, double op2); 
	@WebMethod public double Dividir(double op1, double op2) throws ArithmeticException; 
}
