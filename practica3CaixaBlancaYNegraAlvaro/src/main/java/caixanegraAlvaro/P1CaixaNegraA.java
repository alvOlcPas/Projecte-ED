package caixanegraAlvaro;

public class P1CaixaNegraA {
    public float recarrec(String dni, String dia) {
        int valorDia = Integer.parseInt(dia);
        int convertedDni = Integer.parseInt(dni);

        if (convertedDni == 1 && valorDia == 1) {
            return 0;
        } else if (convertedDni >= 1 && valorDia >= 2) {
            if (valorDia >= 1 && valorDia <= 10) {
                return 1;
            } else if (valorDia <= 20) {
                return 2;
            }
        } else if (convertedDni >=1 && convertedDni<= 999999999) {
            if (valorDia >= 20) {
                return 4;
            }
        }
        throw new IllegalArgumentException("DNI erróneo");
    }
}
