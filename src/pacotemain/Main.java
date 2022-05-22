package pacotemain;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> lista = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);


        double media = 0;
        double consumo;
        int maiorQmedia = 0;

        System.out.println("insira numero de condominios");
        int tamanho = teclado.nextInt();



        System.out.println("insira as leituras de relogio de consumo de agua");

        for(int i = 0; i<tamanho;i++){
            consumo = teclado.nextInt();
            lista.add(consumo);
        }

        for(Double uso: lista){
            media += uso/lista.size();
        }

        for(Double acimaMedia : lista){
            if(acimaMedia > media){
                maiorQmedia++;
            }
        }

        System.out.println("\nA media eh = " + (int) media);
        System.out.println("\nAcima da media = " + maiorQmedia);

         System.out.println("\n\nfim!");
        }

    }

