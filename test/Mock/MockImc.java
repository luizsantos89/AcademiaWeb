
package Mock;

import classes.AvaliacaoFisica;
import classes.IAvaliacaoFisica;
import classes.IAvaliacaoFisica;
import classes.AvaliacaoFisica;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MockImc extends TestCase{
    public void testIMCMasculinoAbaixoPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(20.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoPesoNormalMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(26.3f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Peso normal", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoMarginalmenteAcimaMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(27.7f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Marginalmente acima do peso", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoAcimaPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(31f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Acima do peso ideal", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoObesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(31.1f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Obeso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoAbaixoPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(19f);
        expect(mock.getSexo()).andReturn("feminino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoPesoNormalMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(25.7f);
        expect(mock.getSexo()).andReturn("feminino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Peso normal", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoMarginalmenteAcimaMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(27.2f);
        expect(mock.getSexo()).andReturn("feminino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Marginalmente acima do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoAcimaPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(32.2f);
        expect(mock.getSexo()).andReturn("feminino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Acima do peso ideal", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoObesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(32.3f);
        expect(mock.getSexo()).andReturn("feminino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Obeso", af.calcularIMC(mock));
    }
}
