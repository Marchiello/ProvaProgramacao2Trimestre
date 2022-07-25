
//        FUNCIONOU!!!


package Exercicio1_Fatorial;
// Calcule o fatorial de um número informado via teclado

import java.util.Scanner;
public class Fatorial {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("===============================================================\n");
        System.out.println("Insira um número para calcular seu fatorial:");
        int numero = entrada.nextInt();
        System.out.println("===============================================================\n");

            //=======================================================

        // fatorial = n * n-1

        int fatorial;

        if(numero > 0){

            fatorial = numero;

            while(numero != 1){
                fatorial = fatorial * (numero-1);
                numero = numero - 1;
            }
                
                
        }else{
                System.out.println("Não é possível calcular o fatorial de um número negativo ou igual a zero!");
                fatorial = 0;
                System.out.println("===============================================================\n");

        }
        
           
            //========================================================

        if(fatorial > 0){
            System.out.println("Fatorial = " + fatorial);
        }

        entrada.close();

    }
}
