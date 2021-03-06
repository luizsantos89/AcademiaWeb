
package classes;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

public class Pagamento {
    private Funcionario funcionario;
    private Aluno aluno;
    private Date data;
    private Double valor;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public void registraPagamento(Funcionario funcionario, Aluno aluno, Double valor) {
        this.setAluno(aluno);
        this.setFuncionario(funcionario);
        this.setData((Date) date());
        this.setValor(valor);
    }
}
