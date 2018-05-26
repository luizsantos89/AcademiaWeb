
package classes;

import java.util.ArrayList;

public class Endereco {
    private Usuario usuario;
    public String rua;
    public int numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String uf;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public static Mensagens msg = new Mensagens();
			
		ArrayList<Endereco> arrayEndereco = new ArrayList<Endereco>();
		
	public void cadastrarEndereco(String rua, int numero, String complemento, String bairro, String cidade, String uf){	
		Usuario adiciona = new Usuario();		
		adiciona.rua=rua;
		adiciona.numero=numero;
		adiciona.complemento=complemento;
                adiciona.bairro=bairro;
                adiciona.cidade=cidade;
                adiciona.uf=uf;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayEndereco.size()==0){
			arrayEndereco.add(adiciona);
			msg.mensagemPopUp("Endereço "+adiciona.rua+" cadastrado com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
                    if(cont==1){
				arrayEndereco.add(adiciona);
				msg.mensagemPopUp("Endereço "+adiciona.rua+adiciona.numero+" cadastrado com sucesso!");	
			}
		}
	}
	
	public void editarEndereco(String endRua, int endNumero, String endComplemento, String endBairro, String endCidade, String endUf){	
		for (Endereco arrayEnd : arrayEndereco) {
                    arrayEnd.rua=endRua;
                    arrayEnd.numero=endNumero;
                    arrayEnd.complemento=endComplemento;
                    arrayEnd.bairro=endBairro;
                    arrayEnd.cidade=endCidade;
                    arrayEnd.uf=endUf;
                }
	}
	    
}
