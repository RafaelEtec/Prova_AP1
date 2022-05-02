package Exercicios;
import java.util.Scanner;
/** 
    por Rafael Ferreira Goulart
   
    Implementar uma função que calcule o total a se pagar em uma compra na sorveteria, 
    a partir do total de gramas comprado. O preço de 100g é R$ 3,50 mas se o total de 
    gramas for maior que 1kg, o preço de 100g diminui 50 centavos.
**/
public class Segundo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double gramas;
        
        System.out.println("Quantas gramas de sorvete?: ");
        gramas = ent.nextDouble();
        while (gramas < 0) {
            System.out.println(
                "O número não pode ser negativo! \n"
              + "Insira novamente: ");
            gramas = ent.nextDouble();
        }
        
        double precoTotal = calcularTotal(gramas);
        System.out.println(
                "Você Comprou: \n"
              + gramas+"g de sorvete \n"
              + "Preço a pagar: R$"+precoTotal);
    }
    
    public static double calcularTotal(double gramas) {
        double precoTotal;
        
        if (gramas >= 1000) {
            precoTotal = gramas * 0.03;
        } else {
            precoTotal = gramas * 0.035;
        }
        
        return precoTotal;
    }
}