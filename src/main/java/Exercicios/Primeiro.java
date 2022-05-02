package Exercicios;
import java.util.Scanner;
/** 
    por Rafael Ferreira Goulart
   
    Implementar uma função para calcular o total de uma venda de açaí a partir das 
    quantidades compradas para cada tamanho: pequeno, médio e grande, sabendo 
    que o valor do açaí é R$ 13,50, R$ 15,00 e R$ 17,50 respectivamente.
**/
public class Primeiro {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int qtdPequeno, qtdMedio, qtdGrande;
        String strNumNegativo = 
                "O número não pode ser negativo! \n"
              + "Insira novamente: ";
        
        System.out.println("Quantos Açaís pequenos?: ");
        qtdPequeno = ent.nextInt();
        while (qtdPequeno < 0) {
            System.out.println(strNumNegativo);
            qtdPequeno = ent.nextInt();
        }
        System.out.println("Quantos Açaís médios?: ");
        qtdMedio = ent.nextInt();
        while (qtdMedio < 0) {
            System.out.println(strNumNegativo);
            qtdMedio = ent.nextInt();
        }
        System.out.println("Quantos Açaís grandes?: ");
        qtdGrande = ent.nextInt();
        while (qtdGrande < 0) {
            System.out.println(strNumNegativo);
            qtdGrande = ent.nextInt();
        }
        
        double precoTotal = calcularTotal(qtdPequeno, qtdMedio, qtdGrande);
        System.out.println(
                "Você comprou: \n"
              + qtdPequeno+" - Pequeno \n"
              + qtdMedio+" - Médio \n"
              + qtdGrande+" - Grande \n"
              + "Preço a pagar: R$"+precoTotal);
    }
    
    public static double calcularTotal(int qtdPequeno, int qtdMedio, int qtdGrande) {
        double precoTotal, totalPequeno, totalMedio, totalGrande;
        
        totalPequeno = qtdPequeno * 13.50;
        totalMedio = qtdMedio * 15.00;
        totalGrande = qtdGrande * 17.50;
        
        precoTotal = totalPequeno + totalMedio + totalGrande;
        
        return precoTotal;
    }
}