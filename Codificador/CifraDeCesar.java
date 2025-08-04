import java.time.LocalDate;

public class CifraDeCesar implements Codificador {

    private final int deslocamento = 3;

    @Override
    public String getNome() {
        return "Cifra de César";
    }

    @Override
    public LocalDate getDataCriacao() {
        return LocalDate.of(2023, 1, 1);
    }

    @Override
    public int getNivelSeguranca() {
        return 10; // Baixo
    }

    @Override
    public String codifica(String str) {
        StringBuilder resultado = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                resultado.append((char) ((c - base + deslocamento) % 26 + base));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    @Override
    public String decodifica(String str) {
        StringBuilder resultado = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                resultado.append((char) ((c - base - deslocamento + 26) % 26 + base));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}
