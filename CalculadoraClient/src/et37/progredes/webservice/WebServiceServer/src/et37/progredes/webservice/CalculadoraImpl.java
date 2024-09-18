package et37.progredes.webservice;

import javax.jws.WebService;
import javax.xml.ws.WebFault;

//En endpointInterface poner el package y nombre de la interfaz que contiene la firma de los metodos
@WebService(endpointInterface="et37.progredes.webservice.CalculadoraInterface")  
public class CalculadoraImpl implements CalculadoraInterface {

	public double Sumar(double op1, double op2){
		return op1+op2;
	}
	
	public double Restar(double op1, double op2){
		return op1-op2;
	}
	
	public double Multiplicar(double op1, double op2){
		return op1*op2;
	}
	
	public double Dividir(double op1, double op2) throws ArithmeticException{
		if (op2==0)
			throw new ArithmeticException("El divisor debe ser distinto de 0!");
		else
			return op1/op2;
	}
}
