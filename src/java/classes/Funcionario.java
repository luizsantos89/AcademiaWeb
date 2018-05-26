
package classes;

import java.util.ArrayList;

public class Funcionario extends Usuario{
    private int codigo;
    private String nome;
    private String cpf;
    private String sexo;
    private String dataAdmissao;
    private Double salario;
    private String funcao;    

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public static Mensagens msg = new Mensagens();
			
		ArrayList<Funcionario> arrayFuncionarios = new ArrayList<Funcionario>();
		
	public void cadastrarAluno(int codigo, String nome, String cpf, String sexo, String dataAdmissao, double salario, String funcao){	//nome, cpf, telefone, email
		Funcionario adiciona = new Funcionario();		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.sexo=sexo;
		adiciona.dataAdmissao=dataAdmissao;
                adiciona.salario=salario;
                adiciona.funcao=funcao;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayFuncionarios.size()==0){
			arrayFuncionarios.add(adiciona);
			msg.mensagemPopUp("Funcionário "+adiciona.nome+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (Funcionario arrayAlu : arrayFuncionarios) {
				if(arrayAlu.codigo==codigo){
					msg.mensagemPopUp("O Código já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayFuncionarios.add(adiciona);
				msg.mensagemPopUp("Funcionário "+adiciona.nome+" cadastrado com sucesso!");	
			}
		}
	}
	
	public void editarFuncionario(int funcionarioEditar, int cFuncionario, String nomeFuncionario, String cpfFuncionario, String sexoFuncionario, String dataAdmissaoFuncionario, Double salarioFuncionario, String funcaoFuncionario){	
		for (Funcionario arrayFunc : arrayFuncionarios) {
			if(arrayFunc.codigo==funcionarioEditar){
				arrayFunc.codigo=cFuncionario;
				arrayFunc.nome=nomeFuncionario;
				arrayFunc.cpf=cpfFuncionario;
                                arrayFunc.sexo=sexoFuncionario;
				arrayFunc.dataAdmissao=dataAdmissaoFuncionario;
                                arrayFunc.salario=salarioFuncionario;
                                arrayFunc.funcao=funcaoFuncionario;
                              
			}
		}
		
	}
	
        public void excluirfuncionario(int excluirFunc){
		for (Funcionario arrayFunc : arrayFuncionarios) {
			if(arrayFunc.codigo==excluirFunc){
				arrayFuncionarios.remove(arrayFunc);
				msg.mensagemPopUp("Removido");
			return;
			}
		}
			msg.mensagemPopUp("O Código não existe!");
	}
    
}
