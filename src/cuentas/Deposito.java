/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author eland
 */
public class Deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cantidad();
    }

    private static void cantidad() {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-123456789",1500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+saldoActual );
        
        try{
            cuenta1.retirar(2300);
        }catch (Exception e) {
            System.out.println("Fallo tecnico");
        }
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception r) {
            System.out.println("Fallo al ingresar");
        }
    }
    
}
