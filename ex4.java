import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Challenge {
    public static List<String> calculaTopOcorrenciasDeQueries(String texto,List<String> queries,Integer k) {
        System.out.println(texto);
        System.out.println(queries);
        System.out.println(k);

        String[] palavras = texto.split(" ");
        int[] quantidadeTermos = new int[queries.size()];
        for(int i = 0; i < queries.size(); i++){
            String termo = queries.get(i);
            int contadorTermo = 0;
            for(int n = 0; n < palavras.length; n++){
                String palavra = palavras[n];
                if(palavra.contains(termo) || palavra.equals(termo)){
                    for(int x = 0; x < palavra.toCharArray().length; x++){
                        char temp = palavra.toCharArray()[x];
                    }
                    contadorTermo++;
                }
            }
            quantidadeTermos[i] = contadorTermo;
        }
        System.out.println(quantidadeTermos);
        return List.of("","menor");

        
    }
}