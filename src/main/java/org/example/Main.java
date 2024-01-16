package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nombreUsuario;
        int consumoCombustible;
        double precioCombustible;
        double distanciaTotal;
        double consumoTotal;
        int costoTotalCombustible;

        Scanner leerDatos = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        nombreUsuario=leerDatos.nextLine();

        System.out.println("ingrese el consumo de su vehiculo");
        consumoCombustible=leerDatos.nextInt();

        System.out.println("ingrese el precio del combustible");
        precioCombustible=leerDatos.nextInt();

        System.out.println("ingrese la distacia a recorrer");
        distanciaTotal=leerDatos.nextDouble();


        double consumoDelVijae= (precioCombustible/100)*distanciaTotal;
        System.out.println("Este es el consumo total de su vehiculo:"+ consumoDelVijae);

        double costoTotal=consumoDelVijae*precioCombustible;
        System.out.println("costo total del combustible:"+costoTotal);









    }

    }