public class LinhaEncomenda(){
    /*• referência produto, que é uma String com o código que internamente
se atribui ao produto
    • descrição do produto
    • preço do produto antes de impostos
    • quantidade encomendada
    • regime de imposto que se aplica ao produto - é um valor em percentagem (ex: 6%, 13%, 23%, etc.)
    • valor (em percentagem) do desconto comercial em relação ao preço
antes de impostos */

    private String ref;
    private String descricao;
    private double preco;
    private int quantidade;
    private double imposto;
    private double desconto;

    public LinhaEncomenda(String ref, String descricao, double preco, int quantidade, double imposto, double desconto){
        this.ref = ref;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public LinhaEncomenda(LinhaEncomenda l){
        this.ref = l.getRef();
        this.descricao = l.getDescricao();
        this.preco = l.getPreco();
        this.quantidade = l.getQuantidade();
        this.imposto = l.getImposto();
        this.desconto = l.getDesconto();
    }

    public String getRef(){
        return this.ref;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getImposto(){
        return this.imposto;
    }

    public double getDesconto(){
        return this.desconto;
    }

    public void setRef(String ref){
        this.ref = ref;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public double calculaValorLinhaEnc(){
        return this.preco * this.quantidade * (1 - this.desconto) * (1 + this.imposto);
    }

    public double calculaValorDesconto(){
        return this.preco * this.quantidade * this.desconto;
    }

    public double calculaValorTotal(){
        return this.calculaValorLinhaEnc() - this.calculaValorDesconto();
    }

    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        LinhaEncomenda l = (LinhaEncomenda) o;
        return this.ref.equals(l.getRef()) && this.descricao.equals(l.getDescricao()) && this.preco == l.getPreco() && this.quantidade == l.getQuantidade() && this.imposto == l.getImposto() && this.desconto == l.getDesconto();

    }
