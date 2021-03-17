/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apenasumteste;

import java.util.Scanner;

/**
 *
 * @author Felipe Nascimento
 */
public class ApenasUmTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean inteira;
        String sabor[] = {"Queijo", "Portuguesa", "Calabresa"};
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o tipo? : Inteira(1) Meio a meio(2)");
        int entrada = teclado.nextInt();
        
        if (entrada == 1){
            inteira = true;
            if (inteira == true){
                System.out.println("Escolha o sabor.");
                System.out.println("Queijo (0), Portuguesa(1), Calabresa(2)");
                int escsabor = teclado.nextInt();
                System.out.println(sabor[escsabor]);
            }
        }else if(entrada == 2){
            inteira = false;
            if (inteira == false){
                String s1, s2 = "";
                
                System.out.println("Escolha a 1ª parte.");
                System.out.println("Queijo (0), Portuguesa(1), Calabresa(2)");
                int escsabor = teclado.nextInt();
                s1 = sabor[escsabor];
                
                
                System.out.println("Escolha a 2ª parte.");
                System.out.println("Queijo (0), Portuguesa(1), Calabresa(2)");
                int escsabor2 = teclado.nextInt();
                s2 = sabor[escsabor2];
                System.out.println("Meia " + s1 + " meia " + s2);
            }
        }
        
    }
    
}
