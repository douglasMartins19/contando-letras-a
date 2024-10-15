public class MetodoContagem {
    
    // Método que conta a ocorrência da letra 'a' (maiúscula e minúscula)
    public static int contarA(String str) {
        int contagem = 0;
        
        // Convertendo a string para minúsculas para facilitar a contagem
        str = str.toLowerCase();
        
        // Contando as ocorrências de 'a'
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                contagem++;
            }
        }
        
        return contagem;
    }
}
