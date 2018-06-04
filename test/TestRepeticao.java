
import classes.Aluno;
import classes.AvaliacaoFisica;
import classes.Ficha;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;


public class TestRepeticao extends TestCase {

    Aluno aluno;
    AvaliacaoFisica af;
    Ficha ficha;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        aluno = new Aluno();
        af = new AvaliacaoFisica();
        ficha = new Ficha();
    }
    
    public void testMascAbaixoPeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(20, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testMascNormal() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(20, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testMascMarginAcima() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(20, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testMascAcimaPeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(20, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testMascObeso() {
        aluno.setSexo("masculino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(20, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testFemAbaixoPeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(0, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testFemNormal() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(0, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testFemMarginAcima() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(0, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testFemAcimaPeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(0, ficha.calcularRepeticao(aluno,af));
    }
    
    public void testFemObeso() {
        aluno.setSexo("feminino");
        af.setAluno(aluno);
        af.setPeso(20.6f);
        af.setAltura(1f); 
        af.calcularIMCJunit();
        assertEquals(0, ficha.calcularRepeticao(aluno,af));
    }
}