package practico5;

public class PruebaArreglo {

    public static void main(String[] args) {

        int[] array = new int[3];

        array[0] = 22;
        array[1] = 36;
        array[2] = 12;
        
        int[] listaNumeros = {1,4,7,8,9,2,7,15,4,6,9,8};
        

        Arreglo.sumarLista(array);
        Arreglo.busacarMayor(listaNumeros);
        
        Arreglo.cuentasVocales("En un lugar de la MANCHA habia un oso enorme");
        Arreglo.cuentaCaracter("QUE pasa con la giraFa", 'f');
    }

}
