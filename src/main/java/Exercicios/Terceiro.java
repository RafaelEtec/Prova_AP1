package Exercicios;
import java.util.Scanner;
/** 
    por Rafael Ferreira Goulart
   
    Implementar uma função que calcule o fatorial de um número informado.
    Exemplo: Fatorial de 5 5 * 4 * 3 * 2 * 1 120
**/
public class Terceiro {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero;
        
        System.out.println("Informe o número: ");
        numero = ent.nextInt();
        while (numero < 0) {
            System.out.println(
                "O número não pode ser negativo!"
              + "Insira novamente: ");
            numero = ent.nextInt();
        }
        
        int total = fatorial(numero);
        System.out.println("Fatorial de "+numero+": "+total);
    }
    
    public static int fatorial(int numero) {
        int total = numero, guarda = numero;
        
        for (int pos = 1; pos < numero; pos++) {
            guarda--;
            total = total * guarda;
        }
        
        return total;
    }
}