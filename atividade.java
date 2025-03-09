import java.util.*;

public class atividade {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Escolha uma das opções: ");
            menu();
            opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    int[] vetor = new int[10];
                    vetor = gerarVetorAleatorios();
                    System.out.println(Arrays.toString(vetor));
                    break;
                case 2:
                    System.out.println("Clicou no dois\n");
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
        System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");

    }

    public static int[] gerarVetorAleatorios() {
        Random rand = new Random();
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }
        return vetor;
    }
    
}