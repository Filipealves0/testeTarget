import java.util.Scanner;

public class Strings {

        public static void main(String[] args) {


            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite sua palavra / frase : ");
            String input = leitor.nextLine();

            int contagem = 0;

            for (int i = 0; i < input.length(); i++) {
                char caracter = input.charAt(i);

                if (caracter == 'a'||caracter == 'A') {
                    contagem++;
                }
            }

            if (contagem > 0) {
                System.out.println("A letra 'a' aparece " + contagem + " vezes na string.");
            } else {
                System.out.println("A letra 'a' não aparece na string.");
            }

        }
    }


