import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    String color ;
    double lado;

    Scanner   x=new Scanner(System.in);
      System.out.println("Ingrese el color del cuadrado");
      color=x.next();
      System.out.println("Ingrese el lado del cuadrado");
      lado=x.nextDouble();


      cuadrado c1=new cuadrado(color,lado);
      System.out.println("El area del cuadrado 1 es: "+c1.calcularArea());
      System.out.println("el color del cuadrado 1 es: "+c1.getColor());


      cuadrado c2=new cuadrado ("Azul", 2.3);
      System.out.println("El Area del cuadrado 2 es: "+c2.calcularArea());
      System.out.println("El color del cuadrado 2 es: "+c2.getColor());


      triangulo tr=new triangulo("verde",3,4);
        System.out.println("el area triangulo 1 es:"+tr.calcularArea() );
        System.out.println("el color del area 1 es :"+tr.getColor() );

   }



}
