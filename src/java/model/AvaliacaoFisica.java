
package model;

import java.util.Date;

public class AvaliacaoFisica {
    private Aluno aluno;
    private Funcionario funcionario;
    private Date data;
    private int frequenciaCardiaca;
    private float peso;
    private float altura;
    private int abdominal;
    private int flexaoBracos;
    private float imc;
    private String consideracao;
    
    
    public float calcularIMC(){   
        this.imc = this.peso/(this.altura*this.altura);
        
        if(this.aluno.getSexo().equals("masculino")){ //1
            if(imc < 20.7f){ //2
            this.consideracao = ("Abaixo do peso"); //3
            } else if(imc < 26.4f){ //4
                this.consideracao = ("Peso normal"); //5
            } else if(imc < 27.8f){ //6
                this.consideracao = ("Marginalmente acima do peso"); //7
            } else if(imc < 31.1f){ //8
                this.consideracao = ("Acima do peso ideal"); //9
            } else { //10
                this.consideracao = ("Obeso"); //11
            }
        } else { //12
            if(imc < 19.1f){ //13
                this.consideracao = ("Abaixo do peso"); //14
            } else if(imc < 25.8f){ //15
                this.consideracao = ("Peso normal"); //16
            } else if(imc < 27.3f){ //17
                this.consideracao = ("Marginalmente acima do peso"); //18
            } else if(imc < 32.3f){ //19
                this.consideracao = ("Acima do peso ideal"); //20
            } else { //21
                this.consideracao = ("Obeso"); //22
            }
        }
        return imc;
    }
}
