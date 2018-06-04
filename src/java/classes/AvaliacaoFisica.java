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
        
        if(sexo.equals("masculino")){ //1
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
    
    public String calcularIMCJunit(){
        String resultado;
        imc = peso/(altura*altura);
        
        if (this.getAluno().getSexo().equals("feminino")){ //1
            if(imc < 19.1) //2
                resultado = "Abaixo do peso"; //3  
            else if(imc < 25.8) //4
                resultado = "Peso normal"; //5
            else if(imc < 27.3) //6
                resultado = "Marginalmente acima do peso";//7
            else if(imc < 32.3) //8
                resultado = "Acima do peso";//9
            else 
                resultado = "Obeso";//10
        } else {       
            if(imc < 20.7)//11
                resultado = "Abaixo do peso";//12
            else if(imc < 26.4)//13
                resultado = "Peso normal";//14
            else if(imc < 27.8)//15
                resultado = "Marginalmente acima do peso";//16
            else if(imc < 31.1)//17
                resultado = "Acima do peso";//18
            else 
                resultado = "Obeso";//19
        } 

        return resultado;
    }
    
    public void cadastrarAvaliacaoFisica(Aluno aluno, Funcionario funcionario, float peso, float altura) {
        this.setAluno(aluno);
        this.setFuncionario(funcionario);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setImc(peso/(altura*altura));
    }
    
    public void editarAvaliacaoFisica(Aluno aluno, Funcionario funcionario, float peso, float altura) {
        this.setAluno(aluno);
        this.setFuncionario(funcionario);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setImc(peso/(altura*altura));
    }
    
    public void excluirAvaliacaoFisica() {
        
    }
}
