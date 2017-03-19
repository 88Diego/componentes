package diego.ferreira;
//import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Carrinho {
	
	private List<Produto> produtos = new ArrayList<Produto>();	
    private float precoTotal = 0f;
    
	
	public void AddProduto(Produto prod) {
		produtos.add(prod);
        precoTotal += prod.preco;
	}
	
	public List<Produto> Produtos()
	{
		return this.produtos;
	}

    public float PrecoTotal()
    {
        return this.precoTotal;
	}
	
	
    
}
