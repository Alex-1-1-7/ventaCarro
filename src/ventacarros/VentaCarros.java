/*
 Ejercicio 4: Una compañía de venta de carros
usados, paga a su personal de ventas un salario
de $1000 mensuales, mas una comisión de
$150 por cada carro vendido, más el 5% del
valor de la venta por carro. Cada mes el
capturista de la empresa ingresa en la
computadora los datos pertinentes. Hacer un
programa que calcule e imprima el salario
mensual de un vendedor dado.
 */
package ventacarros;

import java.util.Scanner;

public class VentaCarros {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int salario= 1000, comision = 150;
        float porcentaje = 0.05f, cantidadVendida, sumaVenta=0, totalVenta, salarioT;
        int cantidad;
        System.out.println("Ingrese la cantidad de autos vendidos en el mes: ");
        cantidad = teclado.nextInt();
        
        for (int i = 1; i<=cantidad; i++) {
            System.out.println("ingrese el valor del auto: "+i+" vendido");
            cantidadVendida = teclado.nextFloat();
            sumaVenta += cantidadVendida * porcentaje; //// Acumular la comisión de cada carro vendido
            // sumaVenta = sumaVenta + cantidadVendida * porcentaje;
        }
        totalVenta = comision * cantidad;
        
        salarioT = totalVenta + sumaVenta + salario;
        System.out.println("el salario total del empleado al mes es de: "+salarioT);
        
    }
    
}
