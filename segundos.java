import java.util.Scanner;

public class segundos {
    public static void main(String[] args) {

        int sec;
        double resto, min, segundosSobra;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor em segundos: ");
        sec = ler.nextInt();
        System.out.println("O valor em horas: "+ sec/3600);
        System.out.println("O valor em minutos: "+ sec/60);

        resto = sec%3600;
        min = resto/60;
        segundosSobra= resto%60;
        System.out.println(sec/3600+ " : " + min + " : " + segundosSobra);
