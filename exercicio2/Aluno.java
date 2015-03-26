public class Aluno {
	
	String nome, numeroMatricula;
	 int idade;

	public void imprimirDadosCadastrais (){
		System.out.println ("Nome: " + this.nome);
		System.out.println ("Idade: " + this.idade);
		System.out.println ("Matrícula: " + this.numeroMatricula);
	}

	public static void main(String [] args){
	
		Aluno a1= new Aluno();	
		Aluno a2= new Aluno();
		Aluno a3= new Aluno();
		Aluno a4= new Aluno();

		a1.nome = "Bruna";
		a1.idade = 16;
		a1.numeroMatricula = "201318110068";

		a2.nome = "Layane";
		a2.idade = 17;
		a2.numeroMatricula = "201318110173";
	
		a3.nome = "Kelvin";
		a3.idade = 17;
		a3.numeroMatricula = "201318110257"; 

		a4.nome = "Luluzinha";
		a4.idade = 17;
		a4.numeroMatricula = "201318110039";

		a1.imprimirDadosCadastrais();
		a2.imprimirDadosCadastrais();
		a3.imprimirDadosCadastrais();
		a4.imprimirDadosCadastrais();
	}

}
