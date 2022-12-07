package Ex16;

import java.util.List;

public class Ex16 {
    public static Integer calculaNumeroDaSenha(List<String> senha) {
        String pass = "";
        // for coluna
        for(int j = 0; j < 10; j++){
            int contador0 = 0;
            int contador1 = 0;
            for(int i = 0; i < senha.size(); i++){
                String linha = senha.get(i);
                if(linha.charAt(j) == '1'){
                    contador1++;
                }else{
                    contador0++;
                }
            }
            if(contador0 > contador1){
                pass += "0";
            }else{
                pass += "1";

            }
        }

        return Integer.valueOf(pass);
    }
}
