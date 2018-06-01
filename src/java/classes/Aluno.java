
package classes;

import java.util.ArrayList;

public class Aluno extends Usuario{
    private int codigo;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String dataCadastro;
    private String objetivo;
    private String sexo;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public static Mensagens msg = new Mensagens();
			
		ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();//Incluir, alterar, excluir
		
	public void cadastrarAluno(int codigo, String nome, String cpf, String dataNascimento, String dataCadastro, String objetivo, String sexo){
		Aluno adiciona = new Aluno();		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.dataNascimento=dataNascimento;
		adiciona.dataCadastro=dataCadastro;
                adiciona.objetivo=objetivo;
                adiciona.sexo=sexo;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayAlunos.size()==0){
			arrayAlunos.add(adiciona);
			msg.mensagemPopUp("Aluno "+adiciona.nome+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (Aluno arrayAlu : arrayAlunos) {
				if(arrayAlu.codigo==codigo){
					msg.mensagemPopUp("O Código já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayAlunos.add(adiciona);
				msg.mensagemPopUp("Aluno "+adiciona.nome+" cadastrado com sucesso!");	
			}
		}
	}
	

	public void editarAluno(int alunoEditar, int cAluno, String nomeAluno, String cpfAluno, String dataNascimentoAluno, String dataCadastroAluno, String objetivoAluno, String sexoAluno){	
		for (Aluno arrayAlu : arrayAlunos) {
			if(arrayAlu.codigo==alunoEditar){
				arrayAlu.codigo=cAluno;
				arrayAlu.nome=nomeAluno;
				arrayAlu.cpf=cpfAluno;
				arrayAlu.dataNascimento=dataNascimentoAluno;
                                arrayAlu.dataCadastro=dataCadastroAluno;
                                arrayAlu.objetivo=objetivoAluno;
                                arrayAlu.sexo=sexoAluno;
			}
		}
		
	}
	
        public void excluirAluno(int excluirAlu){
		for (Aluno arrayAlu : arrayAlunos) {
			if(arrayAlu.codigo==excluirAlu){
				arrayAlunos.remove(arrayAlu);
				msg.mensagemPopUp("Removido");
			return;
			}
		}
			msg.mensagemPopUp("O Código não existe!");
	}	
}
    
    

