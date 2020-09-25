package practico5;

public class Arreglo {

    public static void sumarLista(int arr[]) {
        int suma=0;
        int promedio;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        promedio=suma/arr.length;
        System.out.println("La suma es : "+suma);
        System.out.println("El promedio es : "+promedio);
    }
     public static void busacarMayor(int arr[]) {
        int mayor=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mayor) {
                mayor = arr[i];
            }
        }
         System.out.println("El numero mayor de la lista es : "+mayor);
    }
    public static void cuentasVocales(String palabra){
        int suma=0;
        int i;
        String pl=palabra.toLowerCase();
        char caracter[] =new char[pl.length()];
        for(i=0;i<caracter.length;i++){
            caracter[i]=pl.charAt(i);
           switch(caracter[i]){
               case 'a': suma++;break;
               case 'e': suma++;break;
               case 'i': suma++;break;
               case 'o': suma++;break;
               case 'u': suma++;break;
           }
      }
        System.out.println("Cantidad de vocales : "+suma);
    }
    public static void cuentaCaracter(String cadena,char car){
        int suma=0;
        int i;
        String pl=cadena.toLowerCase();
        Character.toLowerCase(car);
        char caracter[] =new char[pl.length()];
        for(i=0;i<caracter.length;i++){
            caracter[i]=pl.charAt(i);
            Character.toLowerCase(caracter[i]);
            if(caracter[i]== car){
                suma++;
            }
        }
        System.out.println("El caracter se repite : "+suma+" veces");
    }
}
