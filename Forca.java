import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Forca implements Desenhavel, Jogavel{
    private List<String> palavras = Arrays.asList("banana");
    private List<Character> tentativas;
    private char[] palavraSorteada = palavras.get(new Random().nextInt(palavras.size())).toCharArray();;
    private char[] palavraDigitada;
    private int erros;

    public Forca() {
    }

    @Override
    public void desenha() {
        for(int i = 0; i <= erros; i++) {

        }
    }

    @Override
    public void jogar(char letra) {
        if(Arrays.toString(palavraSorteada).contains(letra + "")) {
            for(int i = 0; i <= palavraDigitada.length; i++) {
                palavraDigitada[i] = letra;
            }
        }

        if(Arrays.toString(palavraDigitada).contains(letra + "")) {
            System.out.println("Letra já utilizada");
        }

        if(!(Arrays.toString(palavraSorteada).contains(letra + ""))) {
            erros++;
        }
    }

    @Override
    public int verificaFim() {
        if(Arrays.toString(palavraDigitada).equals(Arrays.toString(palavraSorteada)) {
            return 1;
        }
    }
}
