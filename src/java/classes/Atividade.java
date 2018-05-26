
package classes;

import java.util.ArrayList;

public class Atividade {
    private int codigo;
    private String nome;
    private String descricao;
    private Equipamento equipamento;
    
    public static Mensagens msg = new Mensagens();
			
		ArrayList<Atividade> arrayAtividades = new ArrayList<Atividade>();
		
	public void cadastrarAtividade(int codigo, String nome, String descricao){	
		Atividade adiciona = new Atividade();		
		adiciona.codigo=codigo;
                adiciona.nome=nome;
		adiciona.descricao=descricao;
		
		int cont=0;
		//verifica se é a primeira inclusão no array, se for, inclui direto.
		if(arrayAtividades.size()==0){
			arrayAtividades.add(adiciona);
			msg.mensagemPopUp("Atividade "+adiciona.nome+" cadastrada com sucesso!");
		}else{
			//se não for a primeira testa se o código já existe, se não existe cont=1 e no final se cont==1 ele adiciona
			for (Atividade arrayAtv : arrayAtividades) {
				if(arrayAtv.codigo==codigo){
					msg.mensagemPopUp("A Atividade já existe!");
				}else{
					cont=1;
				}
			}
			if(cont==1){
				arrayAtividades.add(adiciona);
				msg.mensagemPopUp("Atividade "+adiciona.nome+" cadastrada com sucesso!");	
			}
		}
	}
	
        public void excluirAtividade(int excluirAtv){
		for (Atividade arrayAtv : arrayAtividades) {
			if(arrayAtv.codigo==excluirAtv){
				arrayAtividades.remove(arrayAtv);
				msg.mensagemPopUp("Removido");
			return;
			}
		}
			msg.mensagemPopUp("O Código não existe!");
	}
}
