/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Miguel
 */
public class Prueba extends Baraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        probar();
    }

    public static void probar() {
        //inicio
        //con jocker
        int numCartas = 54;
        //sin jocker
        //in numCartas = 52;

        int cartasPorPalo = 13;

        //fin
        //int numCartas = 48;
        Carta<PalosBarajaFrancesa> cartas[];

        cartas = (Carta<PalosBarajaFrancesa>[]) new Carta[numCartas];

        PalosBarajaFrancesa[] palos = PalosBarajaFrancesa.values();

        // System.out.println("numCartas: " + numCartas);
        System.out.println("cartasPorPalo: " + cartasPorPalo);
        System.out.println("cantidad de cartas: " + cartas.length);
        System.out.println("cantidad de valortes de PalosBarajaFrancesa " + palos.length);

        for (int i = 0; i < palos.length - 1; i++) {

            System.out.println("######### " + palos[i] + " #########"
                    + "");

            for (int j = 0; j < cartasPorPalo; j++) {
                // int indiceCartaPorPaloTotalj = j;
                cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);

                int indice = (i * cartasPorPalo) + j;
                System.out.println("carta: " + "[" + (indice + 1) + "] = " + cartas[((i * cartasPorPalo) + j)]);

            }

        }
        cartas[numCartas - 2] = new Carta(-1, PalosBarajaFrancesa.JOKER);
        cartas[numCartas - 1] = new Carta(-1, PalosBarajaFrancesa.JOKER);
        System.out.println("###### JOCKER ######");
        System.out.println("carta jocker: " + "[" + (numCartas) + "] " + cartas[numCartas - 1] + " carta jocker : " + "[" + (numCartas - 1) + "] " + cartas[numCartas - 2]);
    }

    @Override
    public void crearBaraja() {
    }
}
