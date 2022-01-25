package PortifolioComitado;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        System.out.println("Digite o valor de x e o valor de y: ");
        Scanner inp = new Scanner(System.in);


        int x = inp.nextInt();
        int y = inp.nextInt();
        int i;


        if (x > y) {
            for (i = y+1 ; i < x; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }else if(x < y){
            for (i = x+1 ; i < y; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
            System.out.println(i);
        }
        System.out.println("Finaliza programa");
    }
}