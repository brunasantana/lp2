import java.util.Scanner;

public class VerificadorCpf{
	int x, y, soma,div, rest, j=10, i;
	String dig;
	int [] cpf =  new int[11];
	int [] peso = new int[11];
	int [] totalmult = new int [11]; 
	
	public void atribuirvalor1(){

		for(int i=9; i<0; i--){
			peso[i] = j;
			j++;
		}
	}

	public void lerCpf(){
	
		Scanner input = new Scanner (System.in);
		System.out.println( "Digite os nove primeiros dígitos do seu CPF: ");
		String dig = input.next();
		
		for(i=0; i<9; i++){
			char caracter = dig.charAt(i);
			cpf[i] = Character.getNumericValue(caracter); 
		}
		
	}

	public void multipvetores1(){
		
		for (i=0; i<9; i++){
			totalmult[i]= cpf[i]*peso[i];
		}	
	}

	public void digitox(){
	
		for (i=0; i<9; i++){
			soma= soma + totalmult[i];
		}
		div= soma/11;
		resto = soma%11;
		
		if (resto<2){
			x=0;
		}else{
			x= (11 - resto);		
		}

		System.out.println("O primeiro dígito é: " + this.x);
	}
	
	public void adicionarvalor1(){	 

			cpf[9] = x;
	}

	public void atribuirvalor2(){
			j=11;	
			for(int i=10; i<0; i--){
			peso[i] = j;
			j++;
	}


	public void multipvetores2(){
		
		for (i=0; i<10; i++){		
			totalmult[i]= cpf[i]*peso[i];
		}
	}

	
	public void digitoy(){
	
		for (i=0; i<10; i++){
			soma= soma + totalmult[i];
		}
		div= soma/11;
		resto = soma%11;
		
		if (resto<2){
			y=0;
		}else{
			y= (11 - resto);		
		}

		System.out.println("O primeiro dígito é: " + this.x);
	}

	public void adicionarvalor2(){	 

		cpf[10] = y;
	}

	public void imprimirCpf(){
		
		System.out.println("O valor inteiro do CPF é: " );

		for (i=0; i<11; i++){
			System.out.print(cpf[i]);
		}
	}

	public static void main (String [] args){
	
		VerificadorCpf vc1 = new VerificadorCpf();

		vc1.lerCpf();
		vc1.atribuirvalor1();
		vc1.multipvetores1();
		vc1.digitox();		
		vc1.adicionarvalor1();
		vc1.atribuirvalor2();
		vc1.multipvetores2();
		vc1.digitoy();
		vc1.adicionarvalor2();
		vc1.imprimirCpf();
		
	}	
}
