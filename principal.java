import java.util.HashMap;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        HashMap<String, Double> tabelaPrecos = new HashMap<>();

        tabelaPrecos.put("78910", 4.50);
        tabelaPrecos.put("78920", 8.90);
        tabelaPrecos.put("78930", 12.00);
        tabelaPrecos.put("78940", 3.50);
        tabelaPrecos.put("78950", 5.00);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Exiba o produto no leitor (Digite o código de barras):");
        String codigoBarras = scanner.nextLine();

        if (tabelaPrecos.containsKey(codigoBarras)) {
            Double preco = tabelaPrecos.get(codigoBarras);
            System.out.println("Produto localizado! Preço: R$ " + preco);
        } else {
            System.out.println("Código de barras não identificado. Procure um funcionário.");
        }

        scanner.close();
    }
}