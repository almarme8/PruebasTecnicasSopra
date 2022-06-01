package Prueba2;
import java.util.*;
public class algoritmo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Persona personas[] = new Persona[50];
        System.out.println("Introduce el sexo y la edad de cada persona");
            for(int i = 0;i<personas.length;i++){
                System.out.println("Edad de de la persona " + (i+1));
                double edad = teclado.nextDouble();
                System.out.println("Sexo de de la persona [0->HOMBRE 1->MUJER] " + (i+1));
                int sexo = teclado.nextInt();
                personas[i] = new Persona(sexo, edad);
            }
        System.out.println(personas[0].getEdad());
        clasificar(personas);
    }

    public static void clasificar(Persona[] personas){
        double mayorEdad = 0;
        double mayorEdadHombre = 0;
        double menorEdadMujer = 0;
        for(int i = 0;i<personas.length;i++){
            if(personas[i].getEdad()>=18){
                mayorEdad++;
                if(personas[i].getSexo() == 0){
                    mayorEdadHombre ++;
                }
            }else if(personas[i].getSexo() == 1){
                menorEdadMujer++;
            }
        }
        double menorEdad = personas.length-mayorEdad;
        double mayorEdadMujer = (mayorEdad-mayorEdadHombre);
        double totalMujeres = menorEdadMujer + mayorEdadMujer;

        System.out.println(mayorEdadHombre);

        System.out.println("Hay " + mayorEdad+ " personas mayores de edad");
        System.out.println("Hay " + menorEdad+ " personas menores de edad");
        System.out.println("Hay " + mayorEdadHombre+ " personas mayores de edad hombres");
        System.out.println("Hay " + mayorEdadMujer+ " personas mayores de edad mujeres");
        System.out.println("Hay un " + ((mayorEdad/personas.length)*100) + "% de personas mayores de edad");
        System.out.println("Hay un " + ((totalMujeres/personas.length)*100) + "% de mujeres");
}

}
class Persona{

    private int sexo;
    private double edad;

    public Persona(int sexo,double edad) {
        this.sexo = sexo;
        this.edad = edad;
    } 

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public double getEdad() {
        return edad;
    }
    public void setEdad(Double edad) {
        this.edad = edad;
    }

}
