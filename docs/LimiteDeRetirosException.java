/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;


public class LimiteDeRetirosException extends Exception {
    
    public LimiteDeRetirosException() {
        super("Error: Solo se pueden realizar un máximo de 3 retiros.");
    }
}