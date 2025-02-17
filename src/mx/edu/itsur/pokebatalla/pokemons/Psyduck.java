/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemons;

//import java.io.Serializable;
import moves.Movimiento;
import moves.PsycoRayo;

/**
 *
 * @author fatima gtz
 */
public class Psyduck extends Pokemon {

    public enum Movimientos {
        PSICORAYO
    }

    @Override
    public Enum[] getMovimientos() {
        return Psyduck.Movimientos.values();
    }    
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Psyduck esta agotado y no puede realizar mas movimientos.");
            return;
        }        

        //Obtener el movimiento de acuerdo a su numero ordinal
        Psyduck.Movimientos movimientoAUtilizar 
                = Psyduck.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case PSICORAYO:
                instanciaMovimiento = new PsycoRayo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar movimiento
        instanciaMovimiento.utilizar(this, oponente);
    }

}

