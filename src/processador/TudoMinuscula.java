package processador;

public class TudoMinuscula extends ProcessadorDeTexto {

    /** Mantém a assinatura original do enunciado para quem já a usava. */
    public static String converterTextoEmMinusculo(String entrada) {
        return new TudoMinuscula().processar(entrada);
    }

    @Override
    protected char converterCaractere(char c) {
        return Character.toLowerCase(c);
    }
}
