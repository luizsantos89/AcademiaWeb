//Teste OK

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import classes.Aluno;
import classes.AvaliacaoFisica;

public class TestImc extends TestCase {

    Aluno aluno;
    AvaliacaoFisica af;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        aluno = new Aluno();
        af = new AvaliacaoFisica();
    }
     
    public void testMascAbaixoPeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        assertEquals("Abaixo do peso", af.calcularIMCJunit());
    }
     
    public void testMascPesoNormal() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(26.3f);
        af.setAltura(1f); 
        assertEquals("Peso normal", af.calcularIMCJunit());
    }
     
    public void testMascMargAcimaPeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(27.7f);
        af.setAltura(1f); 
        assertEquals("Marginalmente acima do peso", af.calcularIMCJunit());
    }
     
    public void testMascAcimaPeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(31f);
        af.setAltura(1f); 
        assertEquals("Acima do peso", af.calcularIMCJunit());
    }
     
    public void testMascObeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(31.1f);
        af.setAltura(1f); 
        assertEquals("Obeso", af.calcularIMCJunit());
    }
     
    public void testFemAbaixoPeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(19f);
        af.setAltura(1f); 
        assertEquals("Abaixo do peso", af.calcularIMCJunit());
    }
     
    public void testFemPesoNormal() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(25.7f);
        af.setAltura(1f); 
        assertEquals("Peso normal", af.calcularIMCJunit());
    }
     
    public void testFemMargAcimaPeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(27.2f);
        af.setAltura(1f); 
        assertEquals("Marginalmente acima do peso", af.calcularIMCJunit());
    }
     
    public void testFemAcimaPeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(32.2f);
        af.setAltura(1f); 
        assertEquals("Acima do peso", af.calcularIMCJunit());
    }
     
    public void testFemObeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(32.4f);
        af.setAltura(1f); 
        assertEquals("Obeso", af.calcularIMCJunit());
    }
}