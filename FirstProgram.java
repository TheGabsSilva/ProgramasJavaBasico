/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;
    import java.util.Scanner;

public class FirstProgram {
 
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        double n1, n2, media;

        Scanner entrada=new Scanner(System.in);
        
        System.out.printf("Digite o nome: ");
        nome=entrada.nextLine();
        System.out.printf("Digite a primeira nota: ");
        n1=entrada.nextDouble();
        System.out.printf("Digite a segunda nota: ");
        n2=entrada.nextDouble();
        media=(n1+n2)/2;
        if (media>=7){
            System.out.printf("Aprovado");
        }
        else{
            System.out.printf("Recuperação");
        }
        System.out.printf("\t\nSua média é: %.2f\n",media);
        System.out.printf("Nome: "+nome+" tirou "+media);
    }  
}
