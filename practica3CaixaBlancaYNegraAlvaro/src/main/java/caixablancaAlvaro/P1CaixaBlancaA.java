package caixablancaAlvaro;

public class P1CaixaBlancaA {
    public static int majorDeTres(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            // Esta línea espera que c siga major que b per lo tent, tornaría el valor més alt, "c"
            // però li he marcar que torne el valor mes baixet "b"
            return b;
        } else return b;
    }
}