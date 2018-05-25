/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author luizs
 */
public class MockImc extends TestCase{
    public void testIMCMasculinoAbaixoPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(16f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoPesoNormalMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoMarginalmenteAcimaMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoAcimaPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCMasculinoObesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoAbaixoPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoPesoNormalMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoMarginalmenteAcimaMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoAcimaPesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
    
    public void testIMCFemininoObesoMock(){
        IAvaliacaoFisica mock = createMock(IAvaliacaoFisica.class);        
        expect(mock.calcularIMC()).andReturn(18.6f);
        expect(mock.getSexo()).andReturn("masculino");
        replay(mock);        
        AvaliacaoFisica af = new AvaliacaoFisica();
        assertEquals("Abaixo do peso", af.calcularIMC(mock));
    }
}
