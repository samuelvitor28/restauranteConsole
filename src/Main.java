import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.print(ImprimirMenu());
            opcao = leitor.nextInt();
        }while(opcao != 4);
    }

    public static String ImprimirMenu(){
        StringBuilder menu = new StringBuilder("---MENU---\n");
        menu.append("1. Cadastrar novo produto\n2. Excluir Produto\n3. Nova Mesa\n4. Sair\nDigite sua opção: ");
        return menu.toString();
    }
}