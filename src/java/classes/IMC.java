package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunoces
 */
public class IMC{
    //private String sexo;
    //private float peso;
    //private float altura;
    //private float imc;    
    
    /*public String calcularIMC(IIMC IMC){*/
        public String calcularIMC(IIMC pImc){
        float imc;
        String sexo = pImc.getSexo();
        String resultado = null;
        //imc = (IMC.getPeso()/(IMC.getAltura()*IMC.getAltura()));
        imc = pImc.calcularIMC();
        
        if(sexo.equals("M")){ //1
            if(imc < 20.7f){ //2
            resultado = ("Abaixo do peso"); //3
            }
            else if(imc < 26.4f){ //4
                resultado = ("Peso normal"); //5
            }
            else if(imc < 27.8f){ //6
                resultado = ("Marginalmente acima do peso"); //7
            }
            else if(imc < 31.1f){ //8
                resultado = ("Acima do peso ideal"); //9
            }
            else { //10
                resultado = ("Obeso"); //11
            }
        }
        else{ //12
            if(imc < 19.1f){ //13
                resultado = ("Abaixo do peso"); //14
            }
            else if(imc < 25.8f){ //15
                resultado = ("Peso normal"); //16
            }
            else if(imc < 27.3f){ //17
                resultado = ("Marginalmente acima do peso"); //18
            }
            else if(imc < 32.3f){ //19
                resultado = ("Acima do peso ideal"); //20
            }
            else { //21
                resultado = ("Obeso"); //22
            }
        }
        return resultado;
    }
    
 
     
}
