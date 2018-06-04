
package classes;

public class Equipamento {
    private String nome;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public void cadastrarEquipamento(String nome, String descricao) {
        this.setNome(nome);
        this.setDescricao(descricao);
    }
    
    public void editarEquipamento(String nome, String descricao) {
        this.setNome(nome);
        this.setDescricao(descricao);
    }
    
    public void excluirEquipamento() {
        
    }
}
