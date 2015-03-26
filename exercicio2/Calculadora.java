public class Calculadora{

	int variavel1, variavel2;

	public void soma(){
		System.out.println("A soma dos dois numeros é:  " + (this.variavel1 + this.variavel2));
	}

	public void subtracao(){
		System.out.println("A subtração dos dois numeros é:  " + (this.variavel1 - this.variavel2));
	}

	public void multiplicacao(){
		System.out.println("A multiplicação dos dois numeros é:  " + (this.variavel1 * this.variavel2));
	}

	public void divisao(){
		System.out.println("A divisão dos dois numeros é:  " + (this.variavel1 / this.variavel2));
	}

	public static void main (String [] args){

		Calculadora c1= new Calculadora(); 
		Calculadora c2= new Calculadora();
		Calculadora c3= new Calculadora();

		c1.variavel1 = 5;
		c1.variavel2 = 3;	

		c2.variavel1 = 6;
		c2.variavel2 = 4;

		c3.variavel1 = 2;
		c3.variavel2 = 7;

		c1.soma();
		c1.subtracao();
		c1.multiplicacao();
		c1.divisao();

		c2.soma();
		c2.subtracao();
		c2.multiplicacao();
		c2.divisao();

		c3.soma();
		c3.subtracao();
		c3.multiplicacao();
		c3.divisao();

	}
}

	
