
package boletin4_4;

public class Boletin4_4 {

    public static void main(String[] args) {
        // 
    Restaurante mesa1 = new Restaurante(2,1);
    //mostramos la cantidad de pulpo y patatas en el almacén y el nº de clientes que se pueden atender.
    mesa1.mostrarPulpo();
    mesa1.mostrarPatatas();
    mesa1.mostrarClientes();
    //añadimos pulpo y patatas al almacén y volvemos a mostrar el nº de clientes que se pueden atender.
    mesa1.añadirPulpo(4);
    mesa1.añadirPatatas(2);
    mesa1.mostrarClientes();
    }
    
    
    
}
    
    

