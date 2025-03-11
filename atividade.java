import java.util.*;

public class atividade {
    public static final Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        System.out.println('julinha');
        do {
            System.out.println("Escolha uma das opções: ");
            menu();
            opcao = read.nextInt();
            System.out.printf("Opção escolhida: %d\n", opcao);
            switch (opcao) {
                case 1:
                    gerarVetorAleatorio();
                    System.out.println("Vetor gerado!\n");
                    break;
                case 2:
                    int[] vetor = new int[10];
                    vetor = gerarVetorAleatorio();
                    imprimirVetor(vetor);
                    break;
                case 3:
                    vetor = gerarVetorAleatorio();
                    achaValor(vetor);
                    break;
                default:
                    System.out.println("Escolha um número válido!\n");
            }
        } while (opcao != 0);

        read.close();
    }

    public static void menu() {
        System.out.println("1. Inicializar o vetor com números aleatórios;");
        System.out.println("2. Imprimir o vetor;");
        System.out.println("3. Verificar se um determinado número está contido no vetor;");
        System.out.println("4. Buscar o maior número armazenado no vetor;");
        System.out.println("5. Calcular a média dos números pares armazenados no vetor;");
        System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor;");
        System.out.println("7. Calcula a média centralizada dos números armazenados no vetor;");
        System.out.println(
                "8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");

    }

    public static int[] gerarVetorAleatorio() {
        Random rand = new Random();
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.print("Impressão do vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d", vetor[i]);
            if (i != vetor.length - 1) {
                System.out.print(", ");
            } else if (i == vetor.length - 1) {
                System.out.print("]\n\n");
            }
        }
    }

    public static void achaValor(int[] vetor) {
        int valorAchado = 0;
        boolean verifica = false;

        System.out.print("Escolha um valor para ser encontrado no vetor: ");
        valorAchado = read.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (valorAchado == vetor[i]) {
                verifica = true;
            }
        }
        if (verifica) {
            System.out.println("O valor foi encontrado!\n");
        } else {
            System.out.println("O valor escolhido não foi encontrado no vetor!\n");
        }

    }

}