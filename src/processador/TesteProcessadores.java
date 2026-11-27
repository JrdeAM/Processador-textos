package processador;

/** Testes simples, sem JUnit, para rodar com: java -cp bin processador.TesteProcessadores */
public class TesteProcessadores {

    private static int falhas = 0;

    public static void main(String[] args) {
        ProcessadorDeTexto mai = new TudoMaiuscula();
        ProcessadorDeTexto min = new TudoMinuscula();

        verificar("maiúscula simples", "ABC", mai.processar("abc"));
        verificar("minúscula simples", "abc", min.processar("ABC"));
        verificar("acentos maiúscula", "AÇÃO É ÓTIMA", mai.processar("ação é ótima"));
        verificar("acentos minúscula", "ação é ótima", min.processar("AÇÃO É ÓTIMA"));
        verificar("números e símbolos", "123 !?", mai.processar("123 !?"));
        verificar("texto vazio", "", mai.processar(""));
        verificar("null vira vazio", "", min.processar(null));
        verificar("fachada estática", "OI", TudoMaiuscula.converterTextoEmMaiusculo("oi"));

        System.out.println(falhas == 0 ? "\nTodos os testes passaram." : "\n" + falhas + " teste(s) falharam.");
        if (falhas > 0) System.exit(1);
    }

    private static void verificar(String nome, String esperado, String obtido) {
        boolean ok = esperado.equals(obtido);
        if (!ok) falhas++;
        System.out.printf("[%s] %s%s%n", ok ? "OK" : "FALHOU", nome,
                ok ? "" : " (esperado \"" + esperado + "\", obtido \"" + obtido + "\")");
    }
}
