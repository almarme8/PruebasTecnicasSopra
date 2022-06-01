package Prueba3;
import java.util.*;
public class algoritmo3 {
    public static void main(String[] args) {
        double sueldo;
        double horasTrabajadas = leerHorasTrabajadas();
        double tarifa = leerTarifa();
        sueldo = calcularSueldo(horasTrabajadas,tarifa);
        System.out.println("Tu sueldo es de "+ sueldo);
    }
    public static double leerHorasTrabajadas(){
        System.out.println("Horas trabajadas:");
        double n = new Scanner(System.in).nextDouble();
        return n;
    }
    public static double leerTarifa(){
        System.out.println("Tarifa(Euros por hora):");
        double n = new Scanner(System.in).nextDouble();
        return n;
    }
    public static double calcularSueldo(double horas, double tarifa){
        double sueldo,tarifaExtra,horasExtra;
        if(horas>40){
            tarifaExtra = tarifa + tarifa/2;
            horasExtra = horas-40;
            sueldo = horasExtra*tarifaExtra+tarifa*40;
        }else{
            sueldo = horas*tarifa;
        }
        return sueldo;
    }
}
