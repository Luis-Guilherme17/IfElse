//Olá, meu nome é Luís e estou fazendo a atividade do If e Else

package com.mycompany.ifelse;

import javax.swing.JOptionPane;

public class IfElse {

    public static void main(String[] args) {
    
        //Vou pedir para o usuário colocar dois números difierentes, e a máquina irá dizer a condição dos números.
        
        //Utilizando > 
        int N1 = 0;
        int N2 = 0;
        
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (N1 > N2) {
            JOptionPane.showMessageDialog(null,"O número "+ N1 +" é maior que o número "+ N2 +".");
                    }else {
            JOptionPane.showMessageDialog(null,"O número "+ N1 +" não é maior que o número "+ N2 +".");
        }
    
        //Utilizando <
        int Nu1 = 0;
        int Nu2 = 0;
        
        Nu1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Nu2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (Nu1 < Nu2) {
            JOptionPane.showMessageDialog(null,"O número "+ Nu1 +" é menor que o número "+ Nu2 +".");
                    }else {
            JOptionPane.showMessageDialog(null,"O número "+ Nu1 +" não é menor que o número "+ Nu2 +".");
        }
        
        //Utilizando <=
        int Num1 = 0;
        int Num2 = 0;
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (Num1 <= Num2) {
            JOptionPane.showMessageDialog(null,"O número "+ Num1 +" é menor ou igual que o número "+ Num2 +".");
                    }else {
            JOptionPane.showMessageDialog(null,"O número "+ Num1 +" não é menor ou igual que o número "+ Num2 +".");
        }
        
        //Utilizando >=
        int Nume1 = 0;
        int Nume2 = 0;
        
        Nume1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Nume2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (Nume1 >= Nume2) {
            JOptionPane.showMessageDialog(null,"O número "+ Nume1 +" é maior ou igual que o número "+ Nume2 +".");
                    }else {
            JOptionPane.showMessageDialog(null,"O número "+ Nume1 +" não é maior ou igual que o número "+ Nume2 +".");
        }
        
        //Utilizando !=
        int Numer1 = 0;
        int Numer2 = 0;
        
        Numer1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Numer2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (Numer1 != Numer2) {
            JOptionPane.showMessageDialog(null,"O número "+ Numer1 +" é diferente do número "+ Numer2 +".");
                    }else {
            JOptionPane.showMessageDialog(null,"O número "+ Numer1 +" não é diferente do número "+ Numer2 +".");
        }
        
        //Utilizando == 
        int Numero1 = 0;
        int Numero2 = 0;
        
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (Numero1 == Numero2) {
            JOptionPane.showMessageDialog(null,"O número "+ Numero1 +" é igual que o número "+ Numero2 +".");
                    }else {
            JOptionPane.showMessageDialog(null,"O número "+ Numero1 +" não é igual que o número "+ Numero2 +".");
        }
        JOptionPane.showMessageDialog(null,"Obrigado por ver o meu código!");
    
    }
}
