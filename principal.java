import java.util.HashMap;

public class principal {
    public static void main(String[] args) {
        HashMap<Integer, String> produtos = new HashMap<>();

        produtos.put(201, "Café");
        produtos.put(202, "Azeite");
        produtos.put(203, "Choocolate");
        produtos.put(204, "bolacha");
        produtos.put(205, "macarrão");

        System.out.println("Produto 201: " + produtos.get(201));
        System.out.println("Produto 203: " + produtos.get(203));
        
           if (produtos.containsKey(999)) {
            System.out.println("Produto: " + produtos.get(999));
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}