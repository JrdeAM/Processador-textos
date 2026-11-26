package processador;

public class TudoMinuscula extends ProcessadorDeTexto {

    @Override
    protected char converterCaractere(char c) {
        return Character.toLowerCase(c);
    }
}
