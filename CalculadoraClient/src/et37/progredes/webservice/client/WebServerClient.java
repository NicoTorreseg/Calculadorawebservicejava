package et37.progredes.webservice.client;
import java.util.Scanner;

import et37.progredes.webservice.*;

public class WebServerClient {

	public static void main(String[] args) {
		
		CalculadoraImplService calculadoraService = new CalculadoraImplService();  
        CalculadoraInterface calculadora = calculadoraService.getCalculadoraImplPort();  
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Operador 1: ");
        double op1= scanner.nextDouble();
        
        System.out.println("Operador 2: ");
        double op2= scanner.nextDouble();
        
        System.out.println("La suma entre "+op1+" y "+op2+" da "+calculadora.sumar(op1, op2));
        System.out.println("La resta entre "+op1+" y "+op2+" da "+calculadora.restar(op1, op2));
        System.out.println("La multiplicación entre "+op1+" y "+op2+" da "+calculadora.multiplicar(op1, op2));
        System.out.println("La división entre "+op1+" y "+op2+" da "+calculadora.dividir(op1, op2));
	}

}
