package com.example;

public class Main {
    public static void main(String[] args) {
        Torneo t1 = new Torneo();

        Corredor c1 = new Corredor("Paula");
        Nadador n1 = new Nadador("Carlos");
        Saltador s1 = new Saltador("Marcos");


        t1.organizarCompetencia(c1);
        System.out.println();
        t1.organizarCompetencia(n1);
        System.out.println();
        t1.organizarCompetencia(s1);

    }
}