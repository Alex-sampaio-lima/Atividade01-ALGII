import java.util.*;

public class atividade {
    public static final Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        Boolean verificaVetor = false;
        int vetor[] = {};

        do {
            System.out.println("Escolha uma das opções: ");
            menu();
            opcao = read.nextInt();
            System.out.printf("Opção escolhida: %d\n", opcao);

            if (!verificaVetor) {
                while (opcao != 1) {
                    System.out.println(
                            "Selecione a opção 1 para inicializar o vetor antes de usar o restante das funções !");
                    opcao = read.nextInt();
                }
                verificaVetor = true;
            }

            switch (opcao) {
                case 1:
                    vetor = gerarVetorAleatorio();
                    System.out.println("Vetor gerado!\n");
                    break;
                case 2:
                    imprimirVetor(vetor);
                    break;
                case 3:
                    int valorAchado = 0;
                    int retornoAchaValor = 0;
                    System.out.print("Escolha um valor para ser encontrado no vetor: ");
                    valorAchado = read.nextInt();
                    retornoAchaValor = achaValor(vetor, valorAchado);
                    if (retornoAchaValor != -1) {
                        System.out.printf("Índice aonde foi encontrado o valor: %d\n", retornoAchaValor);
                        System.out.println("O valor foi encontrado!\n");
                    } else {
                        System.out.println("O valor escolhido não foi encontrado no vetor!\n");
                    }
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
                "8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado;");
    }

    public static int[] gerarVetorAleatorio() {
        Random rand = new Random();
        int n = 0;
        int m = 0;
        System.out.println("Insira o tamanho do vetor: ");
        n = read.nextInt();
        System.out.println("Insira o valor máximo para ser gerado o vetor");
        m = read.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(m);
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

    public static int achaValor(int[] vetor, int valorAchado) {
        boolean verifica = false;
        int indiceAchado = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (valorAchado == vetor[i]) {
                indiceAchado = i;
                verifica = true;
                break;
            }
        }

        if (verifica) {
            return indiceAchado;
        } else {
            return -1;
        }
    }
}