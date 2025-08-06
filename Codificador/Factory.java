public class Factory {
    public static Codificador getCodificador(int nivelSegurancaDesejado) {
        Codificador[] codificadores = {
            new CodificadorSimples(),
            new CodificadorMedio(),
            new CifraDeCesar()
        };

        Codificador maisProximo = codificadores[0];
        int menorDiferenca = Math.abs(nivelSegurancaDesejado - maisProximo.getNivelSeguranca());

        for (Codificador c : codificadores) {
            int diferenca = Math.abs(nivelSegurancaDesejado - c.getNivelSeguranca());
            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                maisProximo = c;
            }
        }
        return maisProximo;
    }
}