/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;
public class Cuenta {
    private double saldo;
    private int numRetiros;

    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.numRetiros = 0;
    }

    public Cuenta() {
        this.saldo = 0;
        this.numRetiros = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo actual: $" + getSaldo());
    }

    public void depositarSaldo(double monto) throws TopeDeDepositoException {
        if (monto > 20000) {
            throw new TopeDeDepositoException();
        } else {
            saldo = saldo + monto;
            System.out.println("Depósito de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        }
    }

    public void retirarSaldo(double monto) 
            throws SaldoInsuficienteException, LimiteDeRetirosException {
        if (numRetiros >= 3) {
            throw new LimiteDeRetirosException();
        } 
        if (saldo < monto) {
            throw new SaldoInsuficienteException();
        } else {
            saldo = saldo - monto;
            numRetiros++; 
            System.out.println("Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo + 
                               " (Retiros: " + numRetiros + ")");
        }
    }
}