package baraja;

import enumerados.PalosBarajaFrancesa;

/**
 * Baraja francesa
 * @author Disco Duro de Roer
 */
public class BarajaFrancesa extends Baraja {

    private boolean joker;
    
    public BarajaFrancesa(boolean joker) {
        super();
        this.joker = joker;
        
        if(joker){
            this.numCartas = 54;
        }else{
            this.numCartas = 52;
        }
        
        this.cartasPorPalo = 13;

        crearBaraja(); //Creamos la baraja
        super.barajar(); // barajamos la baraja
    }

    @Override
    public void crearBaraja() {

        this.cartas = (Carta<PalosBarajaFrancesa>[]) new Carta[numCartas];

        PalosBarajaFrancesa[] palos = PalosBarajaFrancesa.values();

        //Recorro los palos, menos el joker
        for (int i = 0; i < palos.length-1; i++) {

            //Recorro los numeros
            for (int j = 0; j < cartasPorPalo; j++) {
                cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
            }

        }
        
        //Creacion Joker
        this.cartas[numCartas-2] = new Carta(-1, PalosBarajaFrancesa.JOKER);
        this.cartas[numCartas-1] = new Carta(-1, PalosBarajaFrancesa.JOKER);

    }

    public boolean cartaRoja(Carta<PalosBarajaFrancesa> c) {
        return c.getPalo() == PalosBarajaFrancesa.CORAZONES || c.getPalo() == PalosBarajaFrancesa.DIAMANTES;
    }

    public boolean cartaNegra(Carta<PalosBarajaFrancesa> c) {
        return c.getPalo() == PalosBarajaFrancesa.TREBOLES || c.getPalo() == PalosBarajaFrancesa.PICAS;
    }
    
    public boolean isJoker(Carta<PalosBarajaFrancesa> c) {
        return c.getPalo() == PalosBarajaFrancesa.JOKER;
    }

}
