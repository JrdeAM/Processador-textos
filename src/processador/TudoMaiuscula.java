package processador;

public class TudoMaiuscula extends ProcessadorDeTexto {

    /** Mantém a assinatura original do enunciado para quem já a usava. */
    public static String converterTextoEmMaiusculo(String entrada) {
        return new TudoMaiuscula().processar(entrada);
    }

    @Override
    protected char converterCaractere(char c) {
        // Character trata acentos (ç -> Ç, ã -> Ã), não só a-z.
        return Character.toUpperCase(c);
    }
}
