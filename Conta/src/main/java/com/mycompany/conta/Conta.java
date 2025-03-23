/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Conta {

    public static void main(String[] args) {
        byte op = 0,op1 = 0;
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        do{
            op = Byte.parseByte(JOptionPane.showInputDialog(
                    "ATM" +
                    "\n1- Conta 1" +
                    "\n2- Conta 2" +
                    "\n3- Sair"
            ));
            switch(op){
                case 1:
                    do{
                        op1 = Byte.parseByte(JOptionPane.showInputDialog(
                                "ATM" +
                                "\n1- Sacar" +
                                "\n2- Depositar" +
                                "\n3- Tranferir" +
                                "\n4- Consultar saldo" +
                                "\n5- Voltar"
                        ));
                        switch(op1){
                            case 1:
                                conta1.sacar();
                                break;
                            case 2:
                                conta1.depositar();
                                break;
                            case 3:
                                conta1.transferir(conta2);
                                break;
                            case 4:
                                conta1.saldo();
                                break;
                            case 5:
                                
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"????");
                        }
                    }while(op1 != 5);
                break;
                case 2:
                    do{
                        op1 = Byte.parseByte(JOptionPane.showInputDialog(
                                "ATM" +
                                "\n1- Sacar" +
                                "\n2- Depositar" +
                                "\n3- Tranferir" +
                                "\n4- Consultar saldo" +
                                "\n5- Voltar"
                        ));
                        switch(op1){
                            case 1:
                                conta2.sacar();
                                break;
                            case 2:
                                conta2.depositar();
                                break;
                            case 3:
                                conta2.transferir(conta1);
                                break;
                            case 4:
                                conta2.saldo();
                                break;
                            case 5:
                                
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"????");
                        }
                    }while(op1 != 5);
                break;
                case 3:
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"????");
            } 
        }while(op != 3);
    }
}
