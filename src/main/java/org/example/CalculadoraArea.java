package org.example;

public class CalculadoraArea {

    public static String formula = "altura * largura";

    public static double calcularValorArea(double altura, double largura) {
        String expressao;
        expressao = formula.replace("altura", Double.toString(altura));
        expressao = expressao.replace("largura", Double.toString(largura));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}