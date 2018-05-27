package classes;

public class AvaliacaoFisica{
    private Aluno aluno;
    private Funcionario funcionario;
    private float peso;
    private float altura;
    private float imc;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
    public String calcularIMC(IAvaliacaoFisica pImc){
        float imc;
        String sexo = pImc.getSexo();
        String resultado = null;
        this.setImc(pImc.calcularIMC());
        
        if(sexo.equals("M")){ //1
            if(this.getImc() < 20.7f){ //2
            resultado = ("Abaixo do peso"); //3
            }
            else if(this.getImc() < 26.4f){ //4
                resultado = ("Peso normal"); //5
            }
            else if(this.getImc() < 27.8f){ //6
                resultado = ("Marginalmente acima do peso"); //7
            }
            else if(this.getImc() < 31.1f){ //8
                resultado = ("Acima do peso ideal"); //9
            }
            else { //10
                resultado = ("Obeso"); //11
            }
        }
        else{ //12
            if(this.getImc() < 19.1f){ //13
                resultado = ("Abaixo do peso"); //14
            }
            else if(this.getImc() < 25.8f){ //15
                resultado = ("Peso normal"); //16
            }
            else if(this.getImc() < 27.3f){ //17
                resultado = ("Marginalmente acima do peso"); //18
            }
            else if(this.getImc() < 32.3f){ //19
                resultado = ("Acima do peso ideal"); //20
            }
            else { //21
                resultado = ("Obeso"); //22
            }
        }
        return resultado;
    }
    
 
     
}
