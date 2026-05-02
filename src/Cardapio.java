import java.util.ArrayList;

public class Cardapio{
    ArrayList<IProduto> _produtos;
    public Cardapio(){
        _produtos = new ArrayList<>();
    }

    public String ListarProdutos (){
        StringBuilder cardapio = new StringBuilder("----MENU----\n");
        for(IProduto prod : _produtos){
            cardapio.append(prod.toString() + "\n------------\n");
        }
        return cardapio.toString();
    }

    public String NovoProduto (IProduto novoProduto){
        _produtos.add(novoProduto);
        novoProduto.SetID(_produtos.size());
        return "Produto adicionado com sucesso!";
    }

    public String ExcluirProduto (int idProduto){
        boolean found = false;
        StringBuilder mensagem = new StringBuilder();
        for(int i = 0; i < _produtos.size() && !found; i++){
            if(_produtos.get(i).GetId() == idProduto){
                _produtos.remove(i);
                found = true;
                mensagem.append("Item Removido com Sucesso!");
            }
        }
        if(!found){
            mensagem.append("Item NÃO encontrado!");
        }
        return mensagem.toString();
    }
}
