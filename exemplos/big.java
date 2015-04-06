import java.util.Scanner;

public class NumeroMuitoGrande {

    int op = 0, op1 = 0;
    int num1[] = new int[30];
    int num2[] = new int[30];
    int soma[] = new int[30];
    int mult[] = new int[30];
    int fica[] = new int[30];

    public void somar() {
        int cont = 0;
        for (int i = 29; i >= 0; i--) {
            if (i == 0) {
                if ((soma[i] + num1[i] + num2[i]) > 10) {
                    System.out.println("Os numeros adentrados sao maiores dos que os suportados!");
                    op = 1;
                    break;
                }
            }
            if (soma[i] + num1[i] + num2[i] >= 10) {
                soma[i] = (soma[i] + num1[i] + num2[i]) - 10;
                cont = 1;
            } else {
                soma[i] = soma[i] + num1[i] + num2[i];
            }
            if (cont == 1) {
                cont = 0;
                soma[i - 1] = 1;
            }
        }
    }

    public void multiplicar(int n1, int n2) {
        int cont, flag = 0, i,dect=0,nn1=29-n1,nn2=29-n2;
        for (int x = 29; x > nn2; x--) {
            i = 29;
            cont=0;
            if (x != 29) {
                cont=cont+1;
            }
            for (int k = 29; k > nn1; k--) {
                if ((num1[k] * num2[x] + fica[i]) >= 10) {
                    fica[i - cont] = (num1[k] * num2[x] + fica[i - cont]) % 10;
                    flag = 1;
                } else {
                    fica[i - cont] = num1[k] * num2[x] + fica[i - cont];
                }
                if (flag == 1) {
                    flag = 0;
                    fica[i - 1 - cont] = (num1[k] * num2[x] + fica[i-cont]) / 10;
                }
                i--;
            }
            for (int g = 29; g >= 0; g--) {
                if (mult[g] + fica[g] >= 10) {
                    mult[g] = (fica[g] + mult[g]) - 10;
                    dect = 1;
                } else {
                    mult[i] = fica[i] + mult[i];
                }
                if (dect == 1) {
                    dect = 0;
                    mult[i - 1] = 1;
                }
            }
            for (int r = 29; r >= 0; r--) {
                fica[r]=0;
            }
        }
    }

    public void EscreverSoma() {
        int cont = 0;
        System.out.println("A soma eh igual a: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i] == 0 && cont == 0) {
                if (soma[i + 1] != 0) {
                    cont = 1;
                }
            } else {
                System.out.print(soma[i]);
            }
        }
        System.out.println("");
    }

    public void EscreverMult() {
        int cont = 0;
        System.out.println("A multiplicacao eh igual a: ");
        for (int i = 0; i <= 29; i++) {
           /* if (mult[i] == 0 && cont == 0) {
                if (mult[i + 1] != 0) {
                    cont = 1;
              } */ 
           // } else {
                System.out.print(mult[i]);
            }
        //}
        System.out.println("");
    }

    public static void main(String[] args) {
        int contarNum1, contarNum2;
        Scanner input = new Scanner(System.in);
        NumeroMuitoGrande NM = new NumeroMuitoGrande();
        String nume1, nume2;
        for (int k = 0; k <= 29; k++) {
            NM.soma[k] = 0;
        }
        System.out.println("Entre com o 1o numero muito grande: ");
        nume1 = input.next();
        System.out.println("Entre com o 2o numero muito grande: ");
        nume2 = input.next();
        contarNum1 = nume1.length();
        contarNum2 = nume2.length();
        int i, j;
        for (i = contarNum1, j = 0; i > 0; i--, j++) {
            char caracter = nume1.charAt(j);
            NM.num1[30 - i] = Character.getNumericValue(caracter);
        }
        for (i = contarNum2, j = 0; i > 0; i--, j++) {
            char caracter2 = nume2.charAt(j);
            NM.num2[30 - i] = Character.getNumericValue(caracter2);
        }
        NM.somar();
        NM.multiplicar(contarNum1, contarNum2);
        if (NM.op != 1) {
            NM.EscreverSoma();
        }
        if (NM.op1 != 1) {
            NM.EscreverMult();
        }
    }
}
