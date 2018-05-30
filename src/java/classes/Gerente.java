
package classes;

import java.util.ArrayList;

public class Gerente extends Usuario {
    private int codigo;
    private String nome;
    private String cpf;
    private String sexo;
    private String dataPromocao;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }
    
    public static Mensagens msg = new Mensagens();
			
		ArrayList<Gerente> arrayGerentes = new ArrayList<Gerente>();

    public void cadastrarGerente(int codigo, String nome, String cpf, String sexo, String dataPromocao){	
		Gerente adiciona = new Gerente();		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
		adiciona.sexo=sexo;
		adiciona.dataPromocao=dataPromocao;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayGerentes.isEmpty()){
			arrayGerentes.add(adiciona);
			msg.mensagemPopUp("Funcionário "+adiciona.nome+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (Gerente arrayGer : arrayGerentes) {
				if(arrayGer.codigo==codigo){
					msg.mensagemPopUp("O Código já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayGerentes.add(adiciona);
				msg.mensagemPopUp("Gerente "+adiciona.nome+" cadastrado com sucesso!");	
			}
		}
	}
	
	public void editarGerente(int gerenteEditar, int cGerente, String nomeGerente, String cpfGerente, String sexoGerente, String dataPromocaoGerente){	
		for (Gerente arrayGer : arrayGerentes) {
			if(arrayGer.codigo==gerenteEditar){
				arrayGer.codigo=cGerente;
				arrayGer.nome=nomeGerente;
				arrayGer.cpf=cpfGerente;
                                arrayGer.sexo=sexoGerente;
				arrayGer.dataPromocao=dataPromocaoGerente;
                              
			}
		}
		
	}
	
        public void excluirGerente(int excluirGer){
		for (Gerente arrayGer : arrayGerentes) {
			if(arrayGer.codigo==excluirGer){
				arrayGerentes.remove(arrayGer);
				msg.mensagemPopUp("Removido");
			return;
			}
		}
			msg.mensagemPopUp("O Código não existe!");
	}
    
    
}
