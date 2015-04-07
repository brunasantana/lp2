import java.util.Scanner;

public class NumeroMuitoGrande {
    
    int k = 0;
    int n1[] = new int[30];
    int n2[] = new int[30];
    int soma[] = new int[30];


    public void FazerSoma() {
        int   = 0;
        for (int i = 29; i >= 0; i--) {
            if (i == 0) {
                if ((soma[i] + n1[i] + n2[i]) > 10) {
                    System.out.println("Opção inváida.");
                    k = 1;
                    break;
                }
            }
            if (soma[i] + n1[i] + n2[i] >= 10) {
                soma[i] = (soma[i] + n1[i] + n2[i]) - 10;
                aux = 1;
            } else {
                soma[i] = soma[i] + n1[i] + n2[i];
            }
            if( == 1) {
                aux = 0;
                soma[i - 1] = 1;
            }
        }
    }


  public void Escrever() {
        int aux = 0;
        System.out.println(" SOMA: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i] == 0 && aux == 0) {
                if (soma[i + 1] != 0) {
                    aux = 1;
                }
            } else {
                System.out.print(soma[i]);
            }
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        int contador1, contador2;
        Scanner input = new Scanner(System.in);
        NumeroMuitoGrande numgrande = new NumeroMuitoGrande();
        String num1, num2;
        for (int x = 0; x <= 29; x++) {
            numgrande.soma[x] = 0;
        }
        System.out.println(" 1º NÚEMRO: ");
        num1 = input.next();
        System.out.println(" 2º NÚMERO: ");
        num2 = input.next();
        contador1 = num1.length();
        contador2 = num2.length();
        int i, j;
        for (i = contador1, j = 0; i > 0; i--, j++) {
            char caracter = num1.charAt(j);
            numgrande.num1[30 - i] = Character.getNumericValue(caracter);
        }
        for (i = contador2, j = 0; i > 0; i--, j++) {
            char caracter2 = num2.charAt(j);
            numgrande.num2[30 - i] = Character.getNumericValue(caracter2);
        }
        numgrande.FazerSoma();

        if (numgrande.k != 1) {
            numgrande();
        }
        }
    }
}

}
