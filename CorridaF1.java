import java.util.Arrays;
import java.util.Scanner;

public class CorridaF1 {

    public static void main(String[] args) {

        //Iniciando o scanner
        Scanner scanner;

        //Passando a quantidade de pilotos e atribuindo aos arrays para pegarem a quantidade desejada
        int quantidadePilotos = 20;
        String[] nomesPilotos = new String[quantidadePilotos];
        float[] tempoCorrida = new float[quantidadePilotos];

        // Iniciando o loop for para pegar os nomes e tempos dos pilotos
        for (int i = 0; i < quantidadePilotos; i++) {

            scanner = new Scanner(System.in);
            System.out.println("Insira o nome do piloto " + (i + 1) + ":");
            nomesPilotos[i] = scanner.nextLine();

            scanner = new Scanner(System.in);
            System.out.println("Insira o tempo do piloto " + (i + 1) + ":");
            tempoCorrida[i] = scanner.nextFloat();

        }

        // Passando os métodos dentro do main e passando os arrays de nomesPilotos e tempoCorrida 
        // nos parâmetros dos métodos com os valores dos mesmos, substituindo os parâmetros antigos.
        vencedor(nomesPilotos, tempoCorrida);

        ultimoColocado(nomesPilotos, tempoCorrida);

        tempoMedio(tempoCorrida);

    }

    // Iniciando método static e void 
    // Passando arrays no parâmetro do metodo
    public static void vencedor(String[] nomes, float[] tempos) {

        // Iniciando variável de menor tempo para pegar o menor tempo entre os pilotos para declarar o vencedor.
        // Iniciando variável de nome para pegar o nome do vencedor.
        float menor = tempos[0];
        String nome = nomes[0];

        // o Loop pega o tamanho do array que é 20 e depois passa uma condição de que se a posição do tempo no (loop for) for <= ao menor tempo
        // Ele atribui o menor tempo e o nome do piloto com menor tempo e imprime.
        for (int i = 1; i < nomes.length; i++) {

            if (tempos[i] <= menor) {
                menor = tempos[i];
                nome = nomes[i];
            }
        }
        System.out.println("Nome do piloto Vencedor: " + nome);
        System.out.println(String.format("Tempo do piloto Vencedor: %.2f", menor));

    }

    // Iniciando método static e void 
    public static void ultimoColocado(String[] nomes, float[] tempos) {

        // Iniciando variável de menor tempo na posição 0 para pegar o maior tempo entre os pilotos para declarar o último colocado.
        // Iniciando variável de nome na posição 0 para pegar o nome do último colocado.
        float maior = tempos[0];
        String nome = nomes[0];

        // o Loop pega o tamanho do array que é 20 e depois passa uma condição de que se a posição do tempo no (loop for) for >= ao maior tempo
        // Ele atribui o maior tempo e o nome do piloto com maior tempo e imprime.
        for (int i = 0; i < nomes.length; i++) {

            if (tempos[i] >= maior) {
                maior = tempos[i];
                nome = nomes[i];
            }
        }

        System.out.println("Nome do piloto em Ultimo colocado: " + nome);
        System.out.println(String.format("Tempo do piloto em Ultimo colocado: %.2f", maior));
    }

    // Iniciando método static e void 
    public static void tempoMedio(float[] tempos) {

        // Iniciando variável de somar para ser feito a soma de todos os tempos.
        // Iniciando variável para fazer a média com a soma e dividindo pelo tamanho do array de tempo que no caso é 20.
        float somar = 0;
        float media = somar / tempos.length;

        // O loop pega os tempos e soma eles mesmos na variável somar até atingir o tamanho do array.
        for (int i = 0; i < tempos.length; i++) {

            somar += tempos[i];
        }

        System.out.println("Tempo médio da corrida: " + media);
    }

}
