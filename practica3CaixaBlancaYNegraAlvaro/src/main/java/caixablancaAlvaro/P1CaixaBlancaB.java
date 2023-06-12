package caixablancaAlvaro;

public class P1CaixaBlancaB {
    public static double operaciones(double op1, double op2, String operation) {
        double result = 0;
        switch (operation) {
            case "+" -> {result = op1 + op2;}
            case "-" -> {result = op1 - op2;}
            case "*" -> {result = op1 * op2;}
            // en el cuart case, s'espera que es realitze una divisió, però jo ho he canviar
            // per una multiplicació, a les hores donarà fallo, ja que no rep el que espera rebre.
            case "/" -> {result = op1 * op2;}
            case "^" -> {result = Math.pow(op1, op2);}
            case "%" -> {result = op1 % op2;}
        }
        return result;
    }
}