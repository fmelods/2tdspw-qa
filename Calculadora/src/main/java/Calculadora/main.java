package Calculadora;

import java.util.Scanner;

public class Main {
    
    static int valor1 = 10; // Valor inicial alterado
    static int valor2 = 5;  // Valor inicial alterado
    static int resultado;
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        int opcao;
        String menu = "Calculadora\n\n"+
                        "1 - Somar\n" +
                        "2 - Subtrair\n" +
                        "3 - Multiplicar\n" +
                        "4 - Dividir\n";
        
        System.out.println(menu);
        System.out.print("Selecione a operacao: ");
        opcao = ler.nextInt();
        System.out.print("Digite o primeiro valor: ");
        valor1 = ler.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = ler.nextInt();
        
        switch (opcao) {
            case 1:
                resultado = calc.somar(valor1, valor2);
                System.out.println("Resultado: " + valor1 + " + " + valor2 + " = " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(valor1, valor2);
                System.out.println("Resultado: " + valor1 + " - " + valor2 + " = " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(valor1, valor2);
                System.out.println("Resultado: " + valor1 + " * " + valor2 + " = " + resultado);
                break;
            case 4:
                if (valor2 != 0) {
                    resultado = calc.dividir(valor1, valor2);
                    System.out.println("Resultado: " + valor1 + " / " + valor2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Divisao por zero nao permitida!");
                }
                break;
            default:
                System.out.println("Opcao invalida!");
        }
        
        ler.close();
    }
}
