package src;


import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {





        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idadeNadador = entrada.nextInt();

        if ((idadeNadador >= 5) && (idadeNadador <=7)) { //Infantil A = 5 a 7 anos
            System.out.println("CATEGORIA INFANTIL A");
        }
        else if ((idadeNadador >= 8) && (idadeNadador <= 11)) { //Infantil B = 8 a 11 anos
            System.out.println("CATEGORIA INFANTIL B");
        }
        else if ((idadeNadador >= 12) && (idadeNadador <= 13)) { //Juvenil A = 12 a 13 anos
            System.out.println("CATEGORIA JUVENIL A");
        }
        else if ((idadeNadador >= 14) && idadeNadador <= 17) { //Juvenil B = 14 a 17 anos
            System.out.println("CATEGORIA JUVENIL B");
        }
        else if (idadeNadador >= 18) { //Adultos = Maiores de 18 anos
            System.out.println("CATEGORIA ADULTOS");
        }
    }
}
