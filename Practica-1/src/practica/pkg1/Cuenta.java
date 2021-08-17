/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

/**
 *
 * @author ajosu
 */
public class Cuenta {
    
private String nonCliente;
private String numCuenta;
private double saldo;



public Cuenta(){
    
}
public Cuenta(String nonCliente, String numCuenta, double Saldo){
    this.nonCliente = nonCliente;
    this.numCuenta = numCuenta;
    this.saldo = Saldo;
}
public Cuenta(Cuenta objCuenta){
    this.nonCliente = objCuenta.nonCliente;
    this.numCuenta = objCuenta.numCuenta;
    this.saldo = objCuenta.saldo;
}
public boolean deposito(double cnt){
    boolean depositoDone = true;
    if(cnt < 0){
           depositoDone = false;
     }
    else{
        this.saldo = this.saldo + cnt;
        
    }
    return depositoDone;
}
}