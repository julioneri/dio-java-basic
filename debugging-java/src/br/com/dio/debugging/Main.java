package br.com.dio.debugging;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main.");
    }


    static void  a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");

    }


    static void  b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");

    }


    static void  c() {
        System.out.println("Entrou no método c.");
        //Thread.dumbStack();
        System.out.println("Finalizou o método c.");
    }


}
