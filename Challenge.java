import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Challenge {
    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> vendedores) {
        
        Integer maior = 0;
        Integer menor = 0;

        for(int i=0; i < vendedores.size(); i++){
            List<Integer> vendas = vendedores.get(i);

            for(int j=0; j<vendas.size(); j++){
                Integer valor = vendas.get(j);
                if(maior == 0 && menor ==0){
                    maior = valor;
                    menor = valor;
                } 
                if(valor > maior){
                    maior = valor;
                }
                if(valor < menor){
                    menor = valor;
                }
            }
           // menorEMaior.add(new ArrayList<Integer>(menor, maior));

        }

        return List.of(maior,menor);
    }
}