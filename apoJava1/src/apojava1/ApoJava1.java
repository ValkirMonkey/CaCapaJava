/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apojava1;
import java.util.Scanner;

/**
 *
 * @author Valkir
 */
public class ApoJava1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Ingrese sus datos");
        Scanner sc=new Scanner (System.in);
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String ide;
        String os;
        
        System.out.println("Ingrese Nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese Apellido: ");
        apellido=sc.nextLine();
        System.out.println("Ingrese Hobbie: ");
        hobbie=sc.nextLine();
        System.out.println("Ingrese Editor de codigo preferido: ");
        ide=sc.nextLine();
        System.out.println("Ingrese Sistema Operativo que utiliza: ");
        os=sc.nextLine();
        System.out.println("Ingrese Edad: ");
        edad=sc.nextInt();
        
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Hobbie: "+hobbie);
        System.out.println("IDE Preferido: "+ide);
        System.out.println("Sistema Operativo: "+os);  
        
    }
    
}
