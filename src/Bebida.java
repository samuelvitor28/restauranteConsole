public class Bebida implements IProduto {
    private int _id;
    private String _nome;
    private double _valor;
    private String _descricao;
    private CategoriaBebida _categoria;

    public Bebida(String nome, double valor, String descricao, CategoriaBebida categoria){
        _nome = nome;
        _valor = valor;
        _descricao = descricao;
        _categoria = categoria;
    }

    public double GetValor(){
        return _valor;
    }

    public int GetId(){return _id;}

    public void SetID(int id){_id = id; }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(_id + ".\nNome da Bebida: " + _nome + "\nDescrição: " + _descricao + "\nPreço: " + _valor);
        return s.toString();
    }
}
