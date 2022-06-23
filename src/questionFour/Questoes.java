package questionFour;

import java.util.Scanner;

public class Questoes extends Carro {
    Scanner scan = new Scanner(System.in);
    String resposta;
    int retorno=0;

    int num=1;
    int gas =0;
    int die=0;

    public void perguntas(){


        while (retorno<5){
            System.out.println("digite a marca do "+num+" carro");
            String Marca = scan.nextLine();
            System.out.println("digite a modelo do "+num+" carro");
            String Modelo = scan.nextLine();
            System.out.println("caso seja a diesel digite 1, se a gasolina digite 2");
            double Combustivel = Double.parseDouble(scan.nextLine());
            if (Combustivel==1){
                die++;
            }if (Combustivel==2){
                gas++;
            }
            num++;
            retorno++;
        }



    }

    public void imprimir(){
        System.out.println("Foram digitados "+gas+" carros a gasolina");
        System.out.println("Foram digitados "+die+" carros a diesel");
    }






}
