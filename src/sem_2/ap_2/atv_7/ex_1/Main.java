package sem_2.ap_2.atv_7.ex_1;

// Criar uma fila de Strings com capacidade definida no construtor utilizando ArrayList.
// Implementar o menu abaixo:

import java.util.NoSuchElementException;
import java.util.Scanner;

// --- MENU ---
// 1. Adicionar paciente
// 2. Atender paciente
// 3. Mostrar fila
// 4. Consultar próximo paciente
// 5. Consultar tamanho da fila
// 6. Redefinir tamanho da fila
// 7. Sair
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a capacidade da fila: ");
        int capacity = sc.nextInt();

        MyQueue queue = new MyQueue(capacity);
        int option;

        do {
            System.out.println();
            printMenu();
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Digite o nome do paciente: ");
                    String patient = sc.nextLine();
                    try {
                        queue.enqueue(patient);
                        System.out.println("Paciente adicionado à fila.");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        String patient = queue.dequeue();
                        System.out.println("Paciente atendido: " + patient);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> System.out.println("Fila: " + queue);
                case 4 -> {
                    try {
                        String patient = queue.front();
                        System.out.println("Próximo paciente: " + patient);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> System.out.println("Tamanho da fila: " + queue.size());
                case 6 -> {
                    System.out.print("Digite o novo tamanho da fila: ");
                    int newCapacity = sc.nextInt();
                    try {
                        queue.setCapacity(newCapacity);
                        System.out.println("Tamanho da fila redefinido.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 7 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 7);

        sc.close();
    }

    private static void printMenu() {
        System.out.println("""
                --- MENU ---
                1. Adicionar paciente
                2. Atender paciente
                3. Mostrar fila
                4. Consultar próximo paciente
                5. Consultar tamanho da fila
                6. Redefinir tamanho da fila
                7. Sair
                """);
    }
}
