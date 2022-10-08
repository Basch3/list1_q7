import java.util.Scanner;

public class list1_q7 
{
    public static void main(String[] args) throws Exception
    {
        double lado, area, dobro;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do lado: ");
        lado = teclado.nextDouble();


        area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é igual a: " +area);
        dobro = area*2;
        System.out.print("O dobro da área é: " +dobro);
        teclado.close();
    } 

}
