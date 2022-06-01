package Prueba1;
import java.util.*;;
public class algoritmo1 {
    public static void main(String[] args) {
        int numero = leerNumero();
        boolean par = isPar(numero);
        algoritmo(numero,par);
    }
    public static int leerNumero(){
        System.out.println("Introduce un número");
        int n = new Scanner(System.in).nextInt();
        return n;
    }
    public static boolean isPar(int n){
        boolean par = false;
        if(n%2==0){
            return true;
        }
        return par;
    }
    public static void algoritmo(int n,boolean par){
        double x = n;
        if(par){
            for(int i =0;i<x/2;i++){
                n = n-2;
                System.out.println(n);
            }
        }else{
            for(int i =0;i<Math.floor(x/2);i++){
                n = n-2;
                System.out.println(n);
            }
        }
    }
}
