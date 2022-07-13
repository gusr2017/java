/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;


public class TarjetaDebito extends TarjetaBanco {
    private Cuenta cuenta;

    public TarjetaDebito(Cliente cliente) {
        super(cliente);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


}
