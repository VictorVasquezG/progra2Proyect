/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pck_Vendedores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author WINDOWS
 */
public class Proyect1 {
    public static void main(String[] args) {
        //Empesamos creeando la lista 
        List<ClsVendedores> misEmp = new ArrayList();
        
        
        Random dato = new Random();
        int d = 0, d1 = 0,d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0;
        int d9 = 0, d10 = 0, d11 = 0, d12 = 0, d13 = 0, d14 = 0, d15 = 0, d16 = 0, d17 = 0;
        int d18 = 0, d19 = 0, d20 = 0, d21 = 0, d22 = 0, d23 = 0;
        
        for(int i =0; i<1; i++){
            d=dato.nextInt(750); d1=dato.nextInt(750); d2=dato.nextInt(750);
            d3=dato.nextInt(750); d4=dato.nextInt(750); d5=dato.nextInt(750);
            d6=dato.nextInt(750); d7=dato.nextInt(750); d8=dato.nextInt(750);
            d9=dato.nextInt(750); d10=dato.nextInt(750); d11=dato.nextInt(750);
            d12=dato.nextInt(750); d13=dato.nextInt(750); d14=dato.nextInt(750);
            d15=dato.nextInt(750); d16=dato.nextInt(750); d17=dato.nextInt(750);
            d18=dato.nextInt(750); d19=dato.nextInt(750); d20=dato.nextInt(750);
            d21=dato.nextInt(750); d22=dato.nextInt(750); d23=dato.nextInt(750);

            
        }
        
        ClsVendedores ven = new ClsVendedores("1-VICTOR");
        ven.setEnero(d);
        ven.setFebrero(d1);
        ven.setMarzo(d2);
        misEmp.add(ven);
            
        ven=new ClsVendedores("2-LUCIA");
        ven.setEnero(d3);
        ven.setFebrero(d4);
        ven.setMarzo(d5);
        misEmp.add(ven);
 
        ven = new ClsVendedores("3-KATHY");
        ven.setEnero(d6);
        ven.setFebrero(d7);
        ven.setMarzo(d8);
        misEmp.add(ven);
        
        ven = new ClsVendedores("4-HUGO");
        ven.setEnero(d9);
        ven.setFebrero(d10);
        ven.setMarzo(d11);
        misEmp.add(ven);
        
        ven = new ClsVendedores("5-BRITNEY");
        ven.setEnero(d12);
        ven.setFebrero(d13);
        ven.setMarzo(d14);
        misEmp.add(ven);
        
        ven = new ClsVendedores("6-SPEARS");
        ven.setEnero(d15);
        ven.setFebrero(d16);
        ven.setMarzo(d17);
        misEmp.add(ven);
        
        ven = new ClsVendedores("7-ARTURO");
        ven.setEnero(d18);
        ven.setFebrero(d19);
        ven.setMarzo(d20);
        misEmp.add(ven);
        
        ven = new ClsVendedores("8-CALLE ");
        ven.setEnero(d21);
        ven.setFebrero(d22);
        ven.setMarzo(d23);
        misEmp.add(ven);
 
        ven = new ClsVendedores("nuevo");
         
        double sumaEnero = 0;  
        double sumaFebrero = 0;
        double sumaMarzo = 0;   
        double SumasMesesTotal = 0;
        
        System.out.println("Vendedores");//Imprime Vendedores 
        System.out.println("-----------");
        misEmp.forEach((ob) -> System.out.println(ob.getNombre()));
        
        
        for (ClsVendedores v : misEmp){
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            
            SumasMesesTotal= sumaEnero+sumaFebrero+sumaMarzo;
        }
        //Impresion de la tabal y losdatos  vendedores 
        System.out.println("\n\t////////////////////////////////////////////////////////////////////");
        System.out.println("\n\tNOMBRE\t\t |    ENERO\t\t |  FEBRERO\t         |MARZO");
        System.out.println("\t1-VICTOR\t |   Q "+d+"\t\t |  Q "+d1+"\t\t |  Q "+d2);
        System.out.println("\t2-LUCIA\t\t |   Q "+d3+"\t\t |  Q "+d4+"\t\t |  Q "+d5);
        System.out.println("\t3-KATHY\t\t |   Q "+d6+"\t\t |  Q "+d7+"\t\t |  Q "+d8);
        System.out.println("\t4-HUGO\t\t |   Q "+d9+"\t\t |  Q "+d10+"\t\t |  Q "+d11);
        System.out.println("\t5-BRITNEY\t |   Q "+d12+"\t\t |  Q "+d13+"\t\t |  Q "+d14);
        System.out.println("\t6-SPEARS\t |   Q "+d15+"\t\t |  Q "+d16+"\t\t |  Q "+d17);
        System.out.println("\t7-ARTURO\t |   Q "+d18+"\t\t |  Q "+d19+"\t\t |  Q "+d20);
        System.out.println("\t8-CALLE\t\t |   Q "+d21+"\t\t |  Q "+d22+"\t\t |  Q "+d23);
        System.out.println("\tTOTAL MES\t |   Q "+sumaEnero+"\t\t |  Q "+sumaFebrero+"\t\t |  Q "+sumaMarzo);
        System.out.println("\n\t////////////////////////////////////////////////////////////////////");
        System.out.println("\n\tVentas Totales Por Todos os Meses = Q  "+SumasMesesTotal);
        System.out.println("\n\t\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("\n\tLa Suma Total De Enero=        Q "+sumaEnero);
        System.out.println("\tLa  Suma Total de febrero =    Q "+sumaFebrero);
                   
        System.out.println("\tLa Suma Total De Marzo =       Q "+sumaMarzo);          
System.out.println("\n\t\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
