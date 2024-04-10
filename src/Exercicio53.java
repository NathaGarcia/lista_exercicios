package src;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio53 {

    public static void main(String[] args) {

        int quantidadeDeVoltas;
        ArrayList<LocalTime> tempos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        System.out.println("Digite a quantidade de voltas: ");
        quantidadeDeVoltas = entrada.nextInt();
        LocalTime menorTempoVolta = LocalTime.parse("00:59:59.999", DateTimeFormatter.ofPattern("HH:mm:ss.nnn"));
        LocalTime maiorTempoVolta = LocalTime.parse("00:00:00.000", DateTimeFormatter.ofPattern("HH:mm:ss.nnn"));
        LocalTime tempoCadaVolta;
        Calendar tempoMedio = Calendar.getInstance();
        SimpleDateFormat formato =  new SimpleDateFormat("HH:mm:ss.SSS");
        int numeroDaVolta = 1;

        while (tempos.size() < quantidadeDeVoltas) {
            System.out.println("Digite um tempo no seguinte formato HH:MM:SS.MMM ");//horas:minutos:segundos.milésimos
            tempoCadaVolta = LocalTime.parse(entradaString.nextLine(), DateTimeFormatter.ofPattern("HH:mm:ss.nnn")); //Faz a conversão da entrada para o formato escolhido.
            tempos.add(tempoCadaVolta);

            for (LocalTime tempo : tempos) {
                tempoMedio.add(Calendar.MILLISECOND, tempo.getNano());

            }
        }

        //melhor tempo
        for (int i = 0; i < tempos.size(); i++) {
            if (menorTempoVolta.isAfter(tempos.get(i))) {
                menorTempoVolta = tempos.get(i);
            }
        }

        //Pior tempo
        for (int i = 0; i < tempos.size(); i++) {
            if (maiorTempoVolta.isBefore(tempos.get(i))) {
                maiorTempoVolta = tempos.get(i);
            }
        }

        //posição da melhor volta
        if (tempos.contains(menorTempoVolta)) {
            numeroDaVolta = tempos.indexOf(menorTempoVolta);
        }

        //tempo medio das voltas





        System.out.println("Tempos: " + tempos);
        System.out.println("Melhor tempo: " + menorTempoVolta);
        System.out.println("Pior tempo: " + maiorTempoVolta);
        System.out.println("Soma tempo: " + tempoMedio);
        System.out.println("*******: " + formato.format(tempoMedio.getTime()));
        System.out.printf("Melhor volta ocorreu na %dª volta ", numeroDaVolta);


    }
}