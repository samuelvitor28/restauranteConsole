import java.util.ArrayList;

public class Mesa {
    private int _numeroMesa;
    private int _quantidadeLugares;
    private ArrayList<IProduto> _pedidos;
    private boolean _disponivel;

    public Mesa(int numeroMesa, int quantidadeLugares){
        _numeroMesa = numeroMesa;
        _quantidadeLugares = quantidadeLugares;
        _pedidos = new ArrayList<>();
        _disponivel = true;
    }

    public String NovoPedido(ArrayList<IProduto> NovoPedido){
        StringBuilder mensagem = new StringBuilder();
        for(IProduto produto: NovoPedido){
            _pedidos.add(produto);
        }
        mensagem.append("Pedido realizado com sucesso!");
        return mensagem.toString();
    }

    public double FecharConta(){
        double contaMesa = 0;
        for(IProduto produto : _pedidos){
            contaMesa += produto.GetValor();
        }
        return contaMesa;
    }

    public String Ocupar(){
        StringBuilder mensagem = new StringBuilder();
        if(_disponivel){
            _disponivel = false;
            mensagem.append("Mesa nº: " + _numeroMesa + " ocupada com Sucesso!");
        }
        else{
            mensagem.append("Mesa nº: " + _numeroMesa + " não está disponível!");
        }
        return mensagem.toString();
    }

    public String Desocupar(){
        StringBuilder mensagem = new StringBuilder();
        if(!_disponivel){
            _disponivel = true;
            mensagem.append("Mesa nº: " + _numeroMesa + " desocupada com sucesso!");
        }
        else{
            mensagem.append("Mesa nº: " + _numeroMesa + " já estava livre!");
        }
        return mensagem.toString();
    }
}
