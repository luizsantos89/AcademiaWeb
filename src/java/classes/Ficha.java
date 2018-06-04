
package classes;

public class Ficha {
    private Aluno aluno;
    private Funcionario funcionario;
    private Atividade atividade;
    private int serie;
    private int repeticao;

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }
    
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

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    public int calcularSerie(Aluno aluno, AvaliacaoFisica af) {        
        af.setAluno(aluno);
        this.aluno = aluno;
        
        if(aluno.getSexo().equals("masculino")){
            if(af.calcularIMCJunit().equals("Abaixo do peso")) {
                this.setSerie(4);
            } else if (af.calcularIMCJunit().equals("Normal")) {
                this.setSerie(5);
            } else if (af.calcularIMCJunit().equals("Marginalmente acima do peso")) {
                this.setSerie(4);
            } else if (af.calcularIMCJunit().equals("Acima do peso")) {
                this.setSerie(3);
            } else if (af.calcularIMCJunit().equals("Obeso")) {
                this.setSerie(2);
            }
        } else if(aluno.getSexo().equals("feminino")) {
            if(af.calcularIMCJunit().equals("Abaixo do peso")) {
                this.setSerie(3);
            } else if (af.calcularIMCJunit().equals("Normal")) {
                this.setSerie(4);
            } else if (af.calcularIMCJunit().equals("Marginalmente acima do peso")) {
                this.setSerie(3);
            } else if (af.calcularIMCJunit().equals("Acima do peso")) {
                this.setSerie(2);
            } else if (af.calcularIMCJunit().equals("Obeso")) {
                this.setSerie(2);
            }
        }
        return serie;
    }
    
    public int calcularRepeticao(Aluno aluno, AvaliacaoFisica af) {        
        af.setAluno(aluno);
        this.aluno = aluno;
        
        if(aluno.getSexo().equals("masculino")) {
            if(af.calcularIMCJunit().equals("Abaixo do peso")) {
                this.setRepeticao(20);
            } else if (af.calcularIMCJunit().equals("Normal")) {
                this.setRepeticao(20);
            } else if (af.calcularIMCJunit().equals("Marginalmente acima do peso")) {
                this.setRepeticao(15);
            } else if (af.calcularIMCJunit().equals("Acima do peso")) {
                this.setRepeticao(20);
            } else if (af.calcularIMCJunit().equals("Obeso")) {
                this.setRepeticao(15);
            }
        } else {
            if(af.calcularIMCJunit().equals("Abaixo do peso")) {
                this.setRepeticao(15);
            } else if (af.calcularIMCJunit().equals("Normal")) {
                this.setRepeticao(15);
            } else if (af.calcularIMCJunit().equals("Marginalmente acima do peso")) {
                this.setRepeticao(10);
            } else if (af.calcularIMCJunit().equals("Acima do peso")) {
                this.setRepeticao(15);
            } else if (af.calcularIMCJunit().equals("Obeso")) {
                this.setRepeticao(10);
            }
        }
        return repeticao;
    }
    
    public void cadastrarFicha(Aluno aluno, Funcionario funcionario, Atividade atividade, int serie, int repeticao) {
        this.setAluno(aluno);
        this.setFuncionario(funcionario);
        this.setAluno(aluno);
        this.setSerie(this.calcularSerie());
        this.setRepeticao(this.calcularRepeticao());
    }
    
    public void editarFicha(Aluno aluno, Funcionario funcionario, Atividade atividade, int serie, int repeticao) {
        this.setAluno(aluno);
        this.setFuncionario(funcionario);
        this.setAluno(aluno);
        this.setSerie(this.calcularSerie());
        this.setRepeticao(this.calcularRepeticao());
    }
    
    public void excluirFicha() {
        
    }
}
