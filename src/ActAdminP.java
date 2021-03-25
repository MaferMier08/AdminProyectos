import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class ActAdminP {
    @Test
    //AREA DE UN CUADRADO
    public void Area  (){
        float area = (float) Math.pow(2,2);
        Assert.assertEquals(4.0,area,0);
        Assert.assertEquals(3.0,area,1.0);
    }
    @Test
    // DIAMETRO DE UN CIRCULO
    public void Diameter (){
        float diameter = (float) (2* (Math.sqrt(15/Math.PI)));
        System.out.println("Diametro: "+diameter);
        System.out.println("Delta: "+Math.abs(5-diameter));
        Assert.assertEquals(4.37,diameter,1);
        // Assert.assertEquals(5,diameter,-1);
    }
    
    @Test
    // LETRAS MAYÚSCULAS
    public void letters (){
        String text="Hola";
        System.out.println(text);
        char letter = 'N';
        for (int i=0;i<text.length(); i++)
        {
            if(Character.isUpperCase(text.charAt(i))){
                letter = text.charAt(i);
                System.out.println(text.charAt(i));
                Assert.assertNotNull(text);
                Assert.assertEquals("Letra esperada: ",'H',letter);
                Assert.assertEquals("Letra incorrecta:",'A',letter);
            }
        }
    }
}
