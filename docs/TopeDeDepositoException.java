/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;


public class TopeDeDepositoException extends Exception {
    
    public TopeDeDepositoException() {
        super("Error: No se puede depositar más de $20,000 en una sola transacción.");
    }
}