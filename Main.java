import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner leitorOpcao = new Scanner(System.in);
        System.out.println("1 – Pastel de carne \n");
        System.out.println("2 – Coxinha de frango \n");
        System.out.println("3 – Kibe com queijo \n");
        System.out.print("Escolha uma opção: ");
        opcao = leitorOpcao.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(" Pastel de carne escolhido.");
                break;
            case 2:
                System.out.println(" Coxinha de frango escolhida.");
                break;
            case 3:
                System.out.println(" Kibe com queijo .");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }
}