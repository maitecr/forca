package forca;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Forca forca = new Forca();

        do {
            System.out.print("Digite uma letra: ");
            forca.jogar(leitura.nextLine().charAt(0));
            forca.desenha();
        } while (forca.verificaFim() == 0);
    }

}
