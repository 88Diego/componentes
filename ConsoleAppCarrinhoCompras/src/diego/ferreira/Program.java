package diego.ferreira;

import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

        Carrinho c = new Carrinho();
        
        Produto[] produtos = new Produto[]{
        		new Produto("Cerveja", 3.1f),
        		new Produto("Amendoin", 1.99f),
        		new Produto("Picanha", 49.7f),
        		new Produto("Carvão", 9.99f),
        		new Produto("Refrigerante", 5.6f)
        };
        boolean flag = true;
        while (flag)
        {
	        System.out.println("\nProdutos");
	        
	        Integer i = 1;
	        for (Produto produto : produtos)
	        {
	        	System.out.println(String.format("%s %s (R$ %s)", i++, produto.nome, produto.preco));
	        }
	        
	        System.out.println("Que produto você quer colocar no carrinho (entre vazio para finalizar compra): ");
	        String entrada = sc.nextLine();
	        
	        if (entrada.isEmpty()){
	        	flag = false;
	        } else{	        
		        int idxProd = Integer.parseInt(entrada);
	            c.AddProduto(produtos[idxProd-1]);
	        }
        }
        
        System.out.println("\nCarrinho:");
        
        for (Produto produto : c.Produtos())
        {
        	System.out.println("- "+produto.Nome()+" (R$ "+produto.Preco()+")");
        }
        
        System.out.println("Total: R$" + c.PrecoTotal());
        
        
        
	}
}
