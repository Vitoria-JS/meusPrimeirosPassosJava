// Exercicio 5A - simular o funcionamento de um caixa eletronico com a classe Scanner
// 1 - receber o valor de saque informado pelo usuario
// 2 - fazer o processamento para descobrir quantas notas de cada valor disponivel o usuario irá sacar (A prioridade é que o usuário saque a menor quantidade de notas possivel)
// 3 - exibir ao usuário quantas notas de cada valor ele irá receber.

import java.util.Scanner;

public class Exercicio5A {
    public static void main (String args []){

        //entrada
        Scanner entrada = new Scanner (System.in);

        System.out.print("Usuario, digite o valor de saque: ");
        int saque = entrada.nextInt();
    
        //processamento
        int notas50 = saque / 50;
        int resto = saque % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;

        int notas5 = resto / 5;
        resto = resto % 5;

        int notas2 = resto / 2;
        resto = resto % 2;

        int notas1 = resto % 1;

        //saida
        System.out.println("Usuario, voce ira retirar:\n" + notas50 + " notas de 50\n" + notas20 + " notas de 20\n" + notas10 + " notas de 10\n" + notas5 + 
        " notas de 5\n" + notas2 + " notas de 2\n" + notas1 + " notas de 1.");
        
        //liberar o espaço alocado em memória, necessário na classe Scanner quando se instancia um objeto que neste caso é a "entrada"
        entrada.close();
    }    
}
