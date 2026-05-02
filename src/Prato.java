public class Prato implements IProduto {
    private int _id;
    private String _nome;
    private double _valor;
    private String _descricao;
    private CategoriaPrato _categoria;

    public Prato(String nome, double valor, String descricao, CategoriaPrato categoria){
        _nome = nome;
        _valor = valor;
        _descricao = descricao;
        _categoria = categoria;
    }

    public double GetValor(){
        return _valor;
    }

    public int GetId(){return _id;}

    public void SetID(int id){_id = id;}

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(_id + ".\nNome do Prato: " + _nome + "\nDescrição: " + _descricao + "\nPreço: " + _valor);
        return s.toString();
    }
}
