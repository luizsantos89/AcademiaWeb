/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import classes.CalcularIMC;
import classes.IIMC;
import classes.IMC;
import controler.ServletControllerWeb;
import javax.servlet.http.HttpServletRequest;
import junit.framework.TestCase;
import static org.easymock.EasyMock.*;

/**
 *
 * @author Guilherme
 */
public class TestesIMC extends TestCase{
    public void testIMCAbaixoMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(20.6f);
        expect(mock.getSexo()).andReturn("M");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Abaixo do peso", imc.calcularIMC(mock));
    }
    
    public void testIMCMPNMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(26.3f);
        expect(mock.getSexo()).andReturn("M");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Peso normal", imc.calcularIMC(mock));
    }

    public void testCalcularIMCMMAPMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(27.7f);
        expect(mock.getSexo()).andReturn("M");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Marginalmente acima do peso", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCMAPMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(31.0f);
        expect(mock.getSexo()).andReturn("M");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Acima do peso ideal", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCMOBMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(31.1f);
        expect(mock.getSexo()).andReturn("M");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Obeso", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCFAbaixoMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(19.0f);
        expect(mock.getSexo()).andReturn("F");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Abaixo do peso", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCFPNMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(25.7f);
        expect(mock.getSexo()).andReturn("F");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Peso normal", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCFMAPMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(27.2f);
        expect(mock.getSexo()).andReturn("F");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Marginalmente acima do peso", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCFAPMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(32.2f);
        expect(mock.getSexo()).andReturn("F");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Acima do peso ideal", imc.calcularIMC(mock));
    }
    
    public void testCalcularIMCFOBMock(){
        IIMC mock = createMock(IIMC.class);
        
        expect(mock.calcularIMC()).andReturn(32.3f);
        expect(mock.getSexo()).andReturn("F");
        replay(mock);
        
        IMC imc = new IMC();
        assertEquals("Obeso", imc.calcularIMC(mock));
    }
}
