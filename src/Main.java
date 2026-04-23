import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        Cardapio cardapio = new Cardapio();
        do{
            System.out.print(ImprimirMenu());
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    CadastrarProduto(cardapio);
                    break;
            }
            System.out.println(cardapio.ListarProdutos());
        }while(opcao != 4);
    }

    public static String ImprimirMenu(){
        StringBuilder menu = new StringBuilder("---MENU---\n");
        menu.append("1. Cadastrar novo produto\n2. Excluir Produto\n3. Nova Mesa\n4. Sair\nDigite sua opção: ");
        return menu.toString();
    }

    public static void CadastrarProduto(Cardapio cardapio){
        Scanner leitor = new Scanner(System.in);
        int opcao, opcaoCategoria, contador = 1;
        String nome, descricao;
        double valor;
        CategoriaBebida categoriaBebida;
        CategoriaPrato categoriaPrato;
        System.out.print("\nOpções de Produtos para cadastrar:\n1. Prato\n2. Bebida\nDigite a opção desejada: ");
        opcao = leitor.nextInt();
        if(opcao == 1){
            System.out.print("\nDigite o nome do prato: ");
            nome = leitor.next();
            System.out.print("\nDigite o valor do prato: ");
            valor = leitor.nextDouble();
            System.out.print("\nDigite a descrição do prato: ");
            descricao = leitor.next();
            System.out.print("\n----CATEGORIAS-----");
            for(CategoriaPrato categoria : CategoriaPrato.values()){
                System.out.println("\n" + contador + ". " + categoria);
                contador++;
            }
            System.out.print("Digite o nº da categoria desejada: ");
            opcaoCategoria = leitor.nextInt();
            switch (opcaoCategoria){
                case 1:
                    categoriaPrato = CategoriaPrato.PRINCIPAL;
                    break;
                case 2:
                    categoriaPrato = CategoriaPrato.SOBREMESA;
                    break;
                case 3:
                    categoriaPrato =  CategoriaPrato.PORCAO;
                    break;
                case 4:
                    categoriaPrato = CategoriaPrato.ENTRADA;
                    break;
                default:
                    categoriaPrato = CategoriaPrato.PRINCIPAL; // refatorar isso.
                    System.out.println("Digite uma opcão válida!");
                    break;
            }
            Prato novoPrato = new Prato(nome, valor, descricao, categoriaPrato);
            System.out.println(cardapio.NovoProduto(novoPrato));
        }

        else if(opcao == 2){
            System.out.print("\nDigite o nome da bebida: ");
            nome = leitor.next();
            System.out.print("\nDigite o valor do bebida: ");
            valor = leitor.nextDouble();
            System.out.print("\nDigite a descrição da bebida: ");
            descricao = leitor.next();
            System.out.print("\n-----CATEGORIAS-----");
            for(CategoriaBebida categoria : CategoriaBebida.values()){
                System.out.println("\n" + contador + ". " + categoria);
                contador++;
            }
            System.out.print("Digite o nº da categoria desejada: ");
            opcaoCategoria = leitor.nextInt();
            switch (opcaoCategoria){
                case 1:
                    categoriaBebida = CategoriaBebida.SUCO;
                    break;
                case 2:
                    categoriaBebida = CategoriaBebida.REFRIGERANTE;
                    break;
                case 3:
                    categoriaBebida =  CategoriaBebida.ALCOOLICAS;
                    break;
                default:
                    categoriaBebida = CategoriaBebida.SUCO; // refatorar isso.
                    System.out.println("Digite uma opcão válida!");
                    break;
            }
            Bebida novaBebida = new Bebida(nome, valor, descricao, categoriaBebida);
            System.out.println(cardapio.NovoProduto(novaBebida));
        }
    }
}