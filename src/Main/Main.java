package Main;

import Clases.Sedan;
import Clases.Truck;
import Clases.UtilityVehicle;
import Clases2.Movie;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import ClasesInterface.IntArrayList;
import ClasesInterface.IntVector;


public class Main {

    public static void main(String[]args){
        //Ejercicio 1
        double numero = rounded(BigDecimal.valueOf(4.2545));
        System.out.println("El resultado del ejercicio 1 es: " + numero + "\n");

        //Ejercicio 2
        BigDecimal numero2 = new BigDecimal(1.2345);
        BigDecimal numero3= new BigDecimal(-45.67);
        BigDecimal result2 = reverses(numero2);
        BigDecimal result3 = reverses(numero3);

        System.out.println("El resultado del ejercicio 2 es: " + result2 + " y " + result3 + "\n");

        //Ejercicio 3 comprobacion:

        UtilityVehicle car = new UtilityVehicle(4697, "opel", "corsa", 20000, true);
        System.out.println("Comprobacion ejercicio 3: " + car.getModel() + "\n");


        //Ejercicio 4 comprobacion:

        Movie movie = new Movie("Harry Potter", 1234, 152);
        System.out.println("Comprobacion ejercicio 4: " + movie.getTitle() + "\n");

        //Ejercicio 5:

        System.out.println("Ejercicio 5:\n");

        System.out.println("---Prueba IntArrayList---");

        long startTime = System.nanoTime();
        IntArrayList listaPrueba = new IntArrayList(new ArrayList<Integer>(Arrays.asList(14, 8, 5, 17, 0, 40, 36, 11)));
        System.out.println("Imprimimos una lista de menos de 10 de capacidad: " + listaPrueba);
        listaPrueba.add(120);
        System.out.println("Añadimos un primer elemento que va rellenando la lista: " + listaPrueba);
        listaPrueba.add(2);
        listaPrueba.add(5);
        listaPrueba.add(9);
        listaPrueba.add(11);
        listaPrueba.add(37);
        listaPrueba.add(89);
        listaPrueba.add(84);
        listaPrueba.add(7);
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
        System.out.println("Añadimos más elementos hasta que sobrepasa la capacidad inicial de la lista: " + listaPrueba);
        System.out.println("Comprobación del funcionamiento del get, obtenemos elemento en índice 1: " + listaPrueba.get(1));


        System.out.println("---Prueba IntVector---");

        startTime = System.nanoTime();
        IntVector listaPrueba2 = new IntVector(new ArrayList<Integer>(Arrays.asList(14, 8, 5, 17, 0, 40, 36, 11)));
        System.out.println("Imprimimos una lista de menos de 20 de capacidad: " + listaPrueba2);
        listaPrueba2.add(120);
        System.out.println("Añadimos un primer elemento que va rellenando la lista: " + listaPrueba2);
        listaPrueba2.add(2);
        listaPrueba2.add(5);
        listaPrueba2.add(0);
        listaPrueba2.add(12);
        listaPrueba2.add(26);
        listaPrueba2.add(5);
        listaPrueba2.add(9);
        listaPrueba2.add(11);
        listaPrueba2.add(37);
        listaPrueba2.add(89);
        listaPrueba2.add(84);
        listaPrueba2.add(7);
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
        System.out.println("Añadimos más elementos hasta que sobrepasa la capacidad inicial de la lista: " + listaPrueba2);
        System.out.println("Comprobación del funcionamiento del get, obtenemos elemento en índice 1: " + listaPrueba2.get(1));


    }
    // EJERCICIO 1:
    public static double rounded(BigDecimal num){
        return num.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    // EJERCICIO 2:
    public static BigDecimal reverses(BigDecimal num2){
        return num2.setScale(1,RoundingMode.HALF_EVEN).negate();
    }


}

