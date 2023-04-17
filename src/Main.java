import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       //Exercicio Casting
        double valor = 5.25;

        int resultado = (int)(valor);
        System.out.println(resultado);

        int valor1 = 10;
        double valor2 = 5.25;
        int valor3 = (int)(valor2);
        System.out.println(valor3);

        double capital = 1000.0;
        double taxa = 0.05;
        int tempo = 3;
        double tempo1 = (double)(tempo);

        double juros = capital * taxa *tempo1;
        int juros1 = (int)(juros);
        double valor_final = capital + juros1;

        System.out.println("O valor final é: " + valor_final);

        Scanner num = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        String numeroTexto = num.nextLine();

        int numeroInt = Integer.parseInt(numeroTexto);
        System.out.println("Numero em formato de inteiro: "+numeroInt);

        num.close();

        double preco = 19.99;
        int quantidade = 3;
        int preco1 = (int)(preco);

        int total = preco1*quantidade;

        System.out.println("O preço total é: " + total);

        double preco2 = 21.99;
        int quantidade1 = 4;

        int total1 = (int) preco2*quantidade1;
        System.out.println("O preço é: " + total1);

    }



}


