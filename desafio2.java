package PortifolioComitado;


import java.io.IOException;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args)  throws IOException {
        System.out.println("Digite o numero de linhas que deseja");
        Scanner sc = new Scanner(System.in);

        int n, aux=1;
        n = sc.nextInt();

        for(n = aux ; n <= n*n; n++){
            if(n % 4 == 0){
                System.out.println( "PuM");
            }else{
                System.out.println(n);
            }
        }
    }
}