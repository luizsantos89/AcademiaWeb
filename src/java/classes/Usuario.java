
package classes;

import java.util.ArrayList;

public class Usuario extends Endereco {
    private int codigo;
    private String nome;
    private String cpf;
    private String dataNascimento;
    
    public Usuario() {
        
    }

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
   
    public static Mensagens msg = new Mensagens();
			
		ArrayList<Usuario> arrayUsuarios = new ArrayList<Usuario>();
		
	public void cadastrarUsuario(int codigo, String nome, String cpf, String dataNascimento){	
		Usuario adiciona = new Usuario();		
		adiciona.codigo=codigo;
		adiciona.nome=nome;
		adiciona.cpf=cpf;
                adiciona.dataNascimento=dataNascimento;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayUsuarios.size()==0){
			arrayUsuarios.add(adiciona);
			msg.mensagemPopUp("Usuário "+adiciona.nome+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (Usuario arrayUsu : arrayUsuarios) {
				if(arrayUsu.codigo==codigo){
					msg.mensagemPopUp("O Código já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayUsuarios.add(adiciona);
				msg.mensagemPopUp("Usuário "+adiciona.nome+" cadastrado com sucesso!");	
			}
		}
	}
	
	public void editarUsuario(int editarUsuario, int cUsuario, String nomeUsuario, String cpfUsuario, String dataNacimentoUsuario){	
		for (Usuario arrayUsu : arrayUsuarios) {
			if(arrayUsu.codigo==editarUsuario){
				arrayUsu.codigo=cUsuario;
				arrayUsu.nome=nomeUsuario;
				arrayUsu.cpf=cpfUsuario;
                                arrayUsu.dataNascimento=dataNacimentoUsuario;
                        }
		}
		
	}
	
        public void excluirUsuario(int excluirUsu){
		for (Usuario arrayUsu : arrayUsuarios) {
			if(arrayUsu.codigo==excluirUsu){
				arrayUsuarios.remove(arrayUsu);
				msg.mensagemPopUp("Removido");
			return;
			}
		}
			msg.mensagemPopUp("O Código não existe!");
	}
}
