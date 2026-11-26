package processador;

/**
 * Template Method: define o esqueleto do algoritmo de processamento de texto.
 * A ordem dos passos (extrair -> converter -> juntar) fica fixa aqui;
 * as subclasses só dizem como converter UM caractere.
 */
public abstract class ProcessadorDeTexto {

    /**
     * Método-template. É final para que nenhuma subclasse altere a ordem
     * dos passos do algoritmo.
     */
    public final String processar(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] convertidos = converterCaracteres(caracteres);
        return juntarCaracteres(convertidos);
    }

    /** Passo comum: igual para qualquer processador. Null vira texto vazio. */
    private char[] extrairCaracteres(String texto) {
        if (texto == null) {
            return new char[0];
        }
        return texto.toCharArray();
    }

    /** Passo comum: percorre o vetor e delega cada caractere à subclasse. */
    private char[] converterCaracteres(char[] caracteres) {
        char[] convertidos = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            convertidos[i] = converterCaractere(caracteres[i]);
        }
        return convertidos;
    }

    /** Único ponto de variação (hook abstrato). */
    protected abstract char converterCaractere(char c);

    /** Passo comum: igual para qualquer processador. */
    private String juntarCaracteres(char[] caracteres) {
        return new String(caracteres);
    }
}
