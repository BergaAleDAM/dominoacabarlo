package domino.vista;

import domino.model.Fitxa;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class VistaText {

    domino.model.Fitxa fitxa;
    private int[] valors;
    Scanner lector = new Scanner(System.in);

    public VistaText() {
        this.fitxa = new domino.model.Fitxa(valors);
    }

    public void imprimirJugada(int turno, String jugador) {

        System.out.println("Turno: " + turno + "El jugador es :" + jugador);
    }

    
        public void mostrarTablero(ArrayDeque<Fitxa> tablero) {
      
        
        StringBuilder sb = new StringBuilder();
        for (Fitxa f : tablero) {
            sb.append(" - ");
            sb.append(f.getValors()[0]);
            sb.append("·");
            sb.append(f.getValors()[1]);
            sb.append(" - ");
        }
        System.out.println(sb);
    }

    public void mostrarManoJugador(List<Fitxa> fichitas) {

        StringBuilder sb = new StringBuilder();
        for (Fitxa f : fichitas) {
            sb.append(" - ");
            sb.append(f.getValors()[0]);
            sb.append("·");
            sb.append(f.getValors()[1]);
            sb.append(" - ");
        }
        System.out.println(sb);
    }

    public int escogerJugada() {

        do {

            System.out.println("Quina opcio:\n"
                    + "1. Col·locar fitxa.\n"
                    + "2. Col·locar dos dobles.\n"
                    + "3. Passar torn.");

        } while (validarOpcioMenu(lector.nextInt()));

        return lector.nextInt();
    }

    public int pedirFicha(List<Fitxa> fichitas) {
        int posicion = 0;

        do {
            System.out.println("Posa la posicio de la fitxa que vols col·locar.");
            
            posicion = lector.nextInt();

        } while (validarNumeroFicha(fichitas.size(), posicion));

        return posicion;
    }

    public void colocarDosDobles(List<Fitxa> fichitas) {
        
//    do{    
//        boolean doble1 = lector.hasNextInt();
//        boolean doble2 = lector.hasNextInt();
//    }while(doble1 && doble2);
//     
    }

    public void escogerExtremo(Fitxa fichita, ArrayDeque<Fitxa> tablero) {
       
        mostrarTablero(tablero);
        
        System.out.println("Escolleix a quin lloc va la fitxa :\n"
                + "1.Esquerra"
                + "2.Dreta");
        int opcion = lector.nextInt();
        
        switch(opcion){
            case 1: 
                
        }
        

        
    }

    private boolean validarNumeroFicha(int tamanio, int opcion) {

        if (opcion < 0 || opcion >= tamanio) {
            return false;
        } else {
            return true;
        }
    }

    private boolean validarOpcioMenu(int opcion) {
        if(opcion <0 || opcion > 3){
            return false;
        }else{
        return true;}
    }



    
}
