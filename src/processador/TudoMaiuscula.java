package processador;

public class TudoMaiuscula extends ProcessadorDeTexto {

    @Override
    protected char converterCaractere(char c) {
        // Character trata acentos (ç -> Ç, ã -> Ã), não só a-z.
        return Character.toUpperCase(c);
    }
}
