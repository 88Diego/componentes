package diego.ferreira;


public class Produto {


	String nome;
	float preco;
    
    
	public Produto(String string, float d) {
		this.nome = string;
		this.preco = d;
	};
	
	public String Nome()
    {
        return this.nome;
    }

	public float Preco() {
        return this.preco;
    }

}
