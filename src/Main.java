import java.util.ArrayList;

public class Main{
    public static void main (String[] args){
        Prato p = new Prato("Arroz e feijao", 15.90,"o basico bem feito.", CategoriaPrato.PRINCIPAL);
        Prato p2 = new Prato("frango e jiló", 23.90,"clássico mineiro da casa.", CategoriaPrato.PRINCIPAL);
        ArrayList<IProduto> produtos = new ArrayList<>();
        produtos.add(p);
        produtos.add(p2);
        for(IProduto pr : produtos){
            System.out.println(pr.toString()+"\n");
        }
    }
}