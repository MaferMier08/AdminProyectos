import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class ActAdminP {
    @Test
    //AREA DE UN CUADRADO
    public void Area  (){
        // Formula de área
        float area = (float) Math.pow(2,2);
        //Prueba positiva
        Assert.assertEquals(4.0,area,0);
        //Prueba negativa
        Assert.assertEquals(3.0,area,1.0);
    }
    @Test
    // DIAMETRO DE UN CIRCULO
    public void Diameter (){
        //Formula para calcular el diametro de un circulo teniendo el área
        float diameter = (float) (2* (Math.sqrt(15/Math.PI)));
        System.out.println("Diametro: "+diameter);
        //Imprimir delta
        System.out.println("Delta: "+Math.abs(5-diameter));
        //Prueba positiva
        Assert.assertEquals(4.37,diameter,1);
        //prueba negativa 
        // Assert.assertEquals(5,diameter,-1);
    }
    
    @Test
    // LETRAS MAYÚSCULAS
    public void letters (){
        //String a revisar
        String text="Hola";
        System.out.println(text);
        char letter = 'N';
        //For que revisa todas las letras del string en busca de una mayúscula
        for (int i=0;i<text.length(); i++)
        {
            if(Character.isUpperCase(text.charAt(i))){
                letter = text.charAt(i);
                System.out.println(text.charAt(i));
                Assert.assertNotNull(text);
                //prueba positiva
                Assert.assertEquals("Letra esperada: ",'H',letter);
                //prueba negativa
                Assert.assertEquals("Letra incorrecta:",'A',letter);
            }
        }
    }
    
    // Variable prima PETICIÓN DE INT
    public static void VarPrimos(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la variable: ");  
            int num = sc.nextInt();  
                nPrim(num);
    }
    
    public static boolean nPrim(int num) 
    {
            //For para revisar si es primo o no 
            boolean Variable = false;
            for (int i = 2; i <= num / 2; ++i) {
             
              if (num % i == 0) {
                Variable = true;
                break;
              }
            }
        
            if (!Variable)
              System.out.println(num + " es un numero primo.");
            else
              System.out.println(num+ " no es un numero primo.");
            return Variable;
          }   

        //Prueba positiva
        @Test
        public void TestsPass() {
            boolean res = ActAdminP.nPrim(5);
            assertFalse(res);

        }
        //Prueba negativa
        @Test
        public void TestFailed(){
            boolean res = ActAdminP.nPrim(9);
            assertFalse(res);
        }

    
        // Numero - String 
        public void NumStr(String[] args) 
        {
            // PETICIÓN DE STRING
            boolean entradaNumerica = true;
            String entradaTeclado = "Ropa";
            System.out.println("Favor de introducir tu frase: ");
            Scanner entradaScanner = new Scanner(System.in);
            entradaTeclado = entradaScanner.nextLine();
            System.out.println(entradaTeclado);
            
            // For que revisa si hay algún numero en el string
            for (int i=0;i< entradaTeclado.length(); i++) {
                System.out.print ("Analizando si caracteres son dígitos..." + entradaTeclado.charAt(i));
    
                
                if (Character.isDigit(entradaTeclado.charAt(i)) == false) {
                    System.out.println (" ... no es un número, entrada no válida");
                    entradaNumerica = false;
                    break;
    
                } else {System.out.println(" ...ok"); }
    
            }
            if (entradaNumerica == true) {System.out.println ("Todos los caracteres son números"); }
            else {System.out.println ("Hay caracteres no numéricos"); }
    
            System.out.println ("Proceso de análisis terminó");

           

            }
            public static boolean nPrim2 (int num) 
            {
                boolean Variable = false;
                
                String entradaTeclado = "";
                boolean entradaNumerica = false;
                for (int i=0;i< entradaTeclado.length(); i++) {
                    System.out.print ("Analizando si caracteres son dígitos..." + entradaTeclado.charAt(i));
        
                    
                    if (Character.isDigit(entradaTeclado.charAt(i)) == false) {
                        System.out.println (" ... no es un número, entrada no válida");
                        entradaNumerica = false;
                        
                        break;
        
                    } else {System.out.println(" ...ok"); }
        
                }
                if (entradaNumerica == true) {System.out.println ("Todos los caracteres son números"); Variable = false; }
                else {System.out.println ("Hay caracteres no numéricos"); Variable = true; }
        
                System.out.println ("Proceso de análisis terminó");
                return entradaNumerica;
            }
        
        
        //Prueba positiva
        @Test
        public void NumStrV(){
            boolean res = ActAdminP.nPrim2(4);
            assertFalse(res);
        }

        //Prueba negativa
        @Test
        public void NumStrF(){
            boolean res = ActAdminP.nPrim2(4);
            assertTrue(res);
        }
    
}
