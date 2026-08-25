package Programa;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private int opc;
    private Scanner scn = new Scanner(System.in);
    private int d=0;
    private int c=0;
    private int f=0;
    private RedSocial twitter;
    private RedSocial youtube;
    private RedSocial facebook;
    private Scanner inputUsuario;
    private Logica operacion = new Logica();
    public Menu() {
    }
    public void Iniciar(){
       do {
           System.out.println("Operaciones de la Base de Datos");
           System.out.println("1. Diferencia de Seguidores en Twitter entre Enero y Junio ");
           System.out.println("2. Diferencia entre visualizaciones en Youtube dos meses elegidos por el usuario");
           System.out.println("3. Promedio de Twitter y Facebook de Enero a Junio");
           System.out.println("4. Promedio de Me Gusta de las 3 redes");
           System.out.println("5. Salir del Programa");
           opc = scn.nextInt();
           scn.nextLine();

           switch (opc){
               case 1:
                   RedSocial Red1 = new RedSocial("SEGUIDORES", "TWITTER");
                   int a=Integer.parseInt(Red1.getMes().get(0));
                   int b=Integer.parseInt(Red1.getMes().get(5));
                   System.out.println("El resultado de la diferencía es de:"+operacion.resta(a,b));
                   break;
               case 2:
                   RedSocial Redrapidames = new RedSocial();
                   for (int n=1 ; n < 3; n++){
                       System.out.println("Escoja el mes "+n);
                       String mes = scn.nextLine();
                       mes= mes.toUpperCase();
                       int cuenta = 0;
                       int i=-1;
                       boolean check = true;
                       int totalMeses = Redrapidames.getMes().size();
                       do {
                            i++;
                           if (i < totalMeses && Objects.equals(mes, Redrapidames.getMes().get(i))) {
                               cuenta = i;
                               check = false;
                           } else if (i >= totalMeses) {
                               System.out.println("Mes no encontrado. Intente nuevamente:");
                               mes = scn.nextLine().toUpperCase();
                               i = -1;
                           }
                       } while (check == true);
                       youtube = new RedSocial("VISUALIZACIONES","YOUTUBE");
                       if (n==1){
                           this.d = Integer.parseInt(youtube.getMes().get(cuenta));
                       }
                       else{
                        this.c=Integer.parseInt(youtube.getMes().get(cuenta));
                       }

                   }
                   System.out.println(operacion.resta(c,d));
                   break;
               case 3:
                   RedSocial Red2 = new RedSocial("CRECIMIENTO", "TWITTER");
                   RedSocial Red3 = new RedSocial("CRECIMIENTO", "FACEBOOK");
                   for (int n=1 ; n < 3; n++){
                       if (n==1) {
                           for (int count = 0; count < 11; count++)
                               this.c += Integer.parseInt(Red2.getMes().get(count));
                       }
                       else{
                           for (int count = 0; count < 11; count++)
                               this.d += Integer.parseInt(Red3.getMes().get(count));
                       }
                   }
                   System.out.println(operacion.promedio(c,d,f));
                   System.out.println();
                   break;
               case 4:
                   RedSocial Red4 = new RedSocial("ME GUSTA", "TWITTER");
                   RedSocial Red5 = new RedSocial("ME GUSTA", "FACEBOOK");
                   RedSocial Red6 = new RedSocial("ME GUSTA", "YOUTUBE");
                   for (int n=1 ; n < 4; n++){
                       if (n==1) {
                           for (int count = 0; count < 11; count++)
                               this.c += Integer.parseInt(Red4.getMes().get(count));
                       } else if (n==2) {
                           for (int count = 0; count < 11; count++)
                               this.d += Integer.parseInt(Red5.getMes().get(count));
                       }
                       else {
                           for (int count = 0; count < 11; count++)
                               this.f += Integer.parseInt(Red6.getMes().get(count));
                       }
                   }
                   System.out.println(operacion.promedio(c,d));
                   System.out.println();
               case 5:
                   this.opc = opc;
                   break;
               default:
                   System.out.println("Ingrese uno de los valores de las opciones");
           }

       }
       while (opc != 5);
    }
}
