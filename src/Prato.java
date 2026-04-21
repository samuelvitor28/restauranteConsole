public class Prato implements IProduto {
    private static int contador = 0;
    private int _id;
    private String _nome;
    private double _valor;
    private String _descricao;
    private CategoriaPrato _categoria;

    public Prato(String nome, double valor, String descricao, CategoriaPrato categoria){
        contador++;
        _id = contador;
        _nome = nome;
        _valor = valor;
        _descricao = descricao;
        _categoria = categoria;
    }

    public double GetValor(){
        return _valor;
    }

    public int GetId(){return _id;}

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("id: " + _id + " Nome do Prato: " + _nome + "\nDescrição: " + _descricao + "\nPreço: " + _valor);
        return s.toString();
    }
}
