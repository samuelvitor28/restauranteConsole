public class Bebida implements IProduto {
    private static int contador = 0;
    private int _id;
    private String _nome;
    private double _valor;
    private String _descricao;
    private CategoriaBebida _categoria;

    public Bebida(String nome, double valor, String descricao, CategoriaBebida categoria){
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

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("Nome da Bebida: " + _nome + "\nDescrição: " + _descricao + "\nPreço: " + _valor);
        return s.toString();
    }
}
