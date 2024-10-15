import java.util.Scanner;

public class ContarA extends MetodoContagem{
    public static void main(String[] args) throws Exception {
        
        // Usando Scanner para entrada do usuário
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe uma string: ");
            String texto = scanner.nextLine();
            
            // Chamando o método para contar 'a'
            int quantidade = contarA(texto);
            
            // Exibindo o resultado
            if (quantidade > 0) {
                System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");
            } else {
                System.out.println("A letra 'a' não aparece na string.");
            }
        }
    }
}
