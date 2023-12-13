import java.util.Scanner;

import Classes.Calcular;
import Classes.Cumprimentar;
import Classes.calculaEmprestimo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Cumprimentar.main();
        
        System.out.println("Escolha uma das opçoes abaixo em nosso banco: \n");

        System.out.println("1 - Solicitar empréstimo");
        System.out.println("2  - Calculadora");
        int option = scanner.nextInt();

        if (option == 1){
            System.out.println("\nDigite a quantia que deseja contratar: ");
            float emprestimoValor = scanner.nextFloat();

            System.out.println("Escolha no limite de 18 meses em quantas vezes deseja pagar: ");
            int emprestimoPagamento = scanner.nextInt();

            System.out.println("Com uma taxa de juros de apenas 5%, seu empréstimo, que será pago em " + emprestimoPagamento + " vezes, terá um custo final de R$ " + String.format("%.2f", calculaEmprestimo.calcularFinal(emprestimoValor, emprestimoPagamento)));
            

        } else if (option == 2){

            System.out.println("Qual operação deseja fazer?");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int operacao = scanner.nextInt();

            System.out.println("Insira o primeiro número:");
            float a = scanner.nextFloat();
            System.out.println("Insira o segundo número:");
            float b = scanner.nextFloat();
            
            switch (operacao) {
                case 1:
                    System.out.println("O resultado é: " + Calcular.adicionar(a, b));
                    break;
                case 2:
                    System.out.println("O resultado é: " + Calcular.subtrair(a, b));    
                    break;
                case 3:
                    System.out.println("O resultado é: " + Calcular.multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("O resultado é: " + Calcular.dividir(a, b));
                    break;

                default:
                    System.out.println("Desculpe, esta opção não é válida!");
                    break;
            }
            

        }



    }

    
}
