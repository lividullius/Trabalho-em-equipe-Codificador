import java.time.LocalDate;

public class CodificadorMedio implements Codificador {
@Override
    public String getNome() {
        return "Codificador Medio";
    }
@Override
    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }
@Override
    public int getNivelSeguranca(){
        return 2;
    }
@Override
    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 2));
        }

        return encoded.toString();
    }
@Override 
    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 2));
        }
        
        return encoded.toString();
    }
}