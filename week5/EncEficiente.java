import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class EncEficiente {
    
    private String nomeCliente;

    private String nif;

    private String morada;

    private int numEncomenda;

    private int dataEncomenda;

    private List<LinhaEncomenda> encomendas;

    public EncEficiente() {
        this.nomeCliente = "";
        this.nif = "";
        this.morada = "";
        this.numEncomenda = 0;
        this.dataEncomenda = 0;
        this.encomendas = new ArrayList<>();
    }

    public EncEficiente(String nomeCliente, String nif, String morada, int numEncomenda, int dataEncomenda) {
        this.nomeCliente = nomeCliente;
        this.nif = nif;
        this.morada = morada;
        this.numEncomenda = numEncomenda;
        this.dataEncomenda = dataEncomenda;
        this.encomendas = new ArrayList<>();
    }

    public EncEficiente(String nomeCliente, String nif, String morada, int numEncomenda, int dataEncomenda, List<LinhaEncomenda> outrasEncomendas){
        this.nomeCliente = nomeCliente;
        this.nif = nif;
        this.morada = morada;
        this.numEncomenda = numEncomenda;
        this.dataEncomenda = dataEncomenda;
        this.encomendas = new ArrayList<>();
        for(LinhaEncomenda e : outrasEncomendas){
            this.encomendas.add(e);
        }
    }

    public List<LinhaEncomenda> getEncomendas() {
        List<LinhaEncomenda> copiaEncomendas = new ArrayList<>();
        Iterator<LinhaEncomenda> it = this.encomendas.iterator();

        while(it.hasNext()){
            LinhaEncomenda le = it.next();
            copiaEncomendas.add(le.clone());
        }
        return copiaEncomendas;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public String getNif(){
        return this.nif;
    }

    public String getMorada(){
        return this.morada;
    }

    public int getNumEncomenda(){
        return this.numEncomenda;
    }

    public int getDataEncomenda(){
        return this.dataEncomenda;
    }

    public double calculaValorTotal(){}

}
