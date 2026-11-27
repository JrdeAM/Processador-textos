package processador;

public class Main {

    public static void main(String[] args) {
        String texto = "Olá, Mundo! Programação em Java é Legal 123";

        // Polimorfismo: o mesmo método-template, comportamentos diferentes.
        ProcessadorDeTexto[] processadores = { new TudoMaiuscula(), new TudoMinuscula() };

        System.out.println("Original:      " + texto);
        for (ProcessadorDeTexto p : processadores) {
            System.out.printf("%-14s %s%n", p.getClass().getSimpleName() + ":", p.processar(texto));
        }

        System.out.println();
        System.out.println("Via métodos estáticos originais:");
        System.out.println(TudoMaiuscula.converterTextoEmMaiusculo(texto));
        System.out.println(TudoMinuscula.converterTextoEmMinusculo(texto));
    }
}
