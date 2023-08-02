//Você e seu time estão desenvolvendo um sistema de indicações de postos de gasolina que ficam próximos da localização atual do veículo. No modo de direção “viagem”, a funcionalidade a ser desenvolvida é de indicar ao condutor o posto mais distante possível dentro do limite atual de combustível. E caso não exista posto de gasolina, retornar -1

//A pessoa responsável por fazer a especificação do sistema informou que você terá as seguintes informações: consumo médio de combustível, quantidade de combustível restante no veículo e um array contendo distâncias dos postos de gasolinas.

//Exemplo:
//Combustivel (em litros): 2
//Consumo médio (km/l): 8
//Postos de Gasolina (km): [2, 15, 22, 10.2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class exercicio01 {


    public static void main(String [] args){
        ultimaParada(50, 2, [0]);
    }
    public static int ultimaParada(int combustivel,int consumo, List<Integer> postosDeGasolina) {
       
        System.out.println("" + combustivel + ", " + consumo + ", " +  postosDeGasolina);
       
      //  double[] postosDeGasolina = new double[]{2.0, 10.2, 15.0, 22.0};
        int limite= combustivel * consumo;;
        int postoEscolhido = -1; 

        //Collections.sort(postosDeGasolina); 
       //for(int i = (postosDeGasolina.size()); i < postosDeGasolina.size(); i++){
        // postosDeGasolina = postosDeGasolina;        
      // }
        for(int i = 0 ; i < postosDeGasolina.size();i++){
            for(int j = i+1 ; j< postosDeGasolina.size();j++){
                if(postosDeGasolina.size[i] > postosDeGasolina.size(j)){
                    int temp = postosDeGasolina.size(i);
                    postosDeGasolina.size(i) = postosDeGasolina.size(j);
                    postosDeGasolina.size(j) = temp;
            }
        }
       
        for(int i = 0; i < postosDeGasolina.size(); i++){
            int distanciaPosto = postosDeGasolina.get(i);

            if(distanciaPosto <= limite){

                postoEscolhido = i; 
            }
           
        }
       
       if(postoEscolhido == -1){
         return -1;
       }

        System.out.println("Posto escolhido: " + postosDeGasolina.get(postoEscolhido) + "km");

            return postosDeGasolina.get(postoEscolhido);
        

        }
    
}
    

