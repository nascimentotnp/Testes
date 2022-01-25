package PortifolioComitado;

import java.io.IOException;
import java.util.Scanner;

public class desafio1 {//

    public static void main(String[] args) throws IOException {

        System.out.println("Qual combustivel você abasteceu? "
                +"Digite 1 para Alcool "
                +"Digite 2 para Gasolina "
                +"Digite 3 para Diesel "
        +"Digite 4 para sair ");
        Scanner sc = new Scanner(System.in);

        int combustivel, stop=1;
        int soma1=0, soma2=0, soma3=0;


        while (stop!=2){
            if (stop == 1){
                combustivel = sc.nextInt();

                if (combustivel == 1){
                    ++soma1;
                    System.out.println("Alcool " + soma1);
                }
                else if (combustivel ==2){
                    ++soma2;
                    System.out.println("Gasolina " + soma2);

                }
                else if (combustivel ==3){
                    ++soma3;
                    System.out.println("Diesel" + soma3);

                }
                else if (combustivel==4){
                    stop=2;
                }
                else {
                    stop =1;
                    System.out.println("Digite um número Válido entre 1 e 4");
                }
            }
            if (stop == 2){
                System.out.println("MUITO OBRIGADO");
                System.out.printf("Alcool: %d\n",soma1);
                System.out.printf("Gasolina: %d\n",soma2);
                System.out.printf("Diesel: %d\n",soma3);
            }
        }
        sc.close();
    }
}