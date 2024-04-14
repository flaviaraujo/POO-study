package week6;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class CasaInteligente {
    
    private List<Lampada> lampadas;

    public CasaInteligente(){
        this.lampadas = new ArrayList<>();
    }

    public CasaInteligente(List<Lampada> lamps){
        this.lampadas = this.lampadas.stream() 
                    .map(Lampada::clone)
                    .collect(Collectors.toList());
    }

    public CasaInteligente(CasaInteligente lamps){
        this.lampadas = lamps.getlampadas();
    }

    public List<Lampada> getlampadas() {
        return this.lampadas;
    }

    public List<Lampada> getIndex(){
        return this.index;
    }

    public void addLampada(Lampada l){
        this.lampadas.add(l.clone());
    }

    public void ligaLampadaNormal(int index){
        
        this.lampadas.get(index).lampON();
                    
    }

    public void ligaTodasEco(){
        this.lampadas.stream()
            .forEach(Lampada::lampECO);
    }

    public void ligaTodasMax(){
        this.lampadas.stream()
            .forEach(l -> l.lampON()); //podia usar igual ao ECO, e o mesmo
    }

    public int qtdLampadasOFF(){
        return (int)this.lampadas.stream()
            .filter(l -> l.getModo() == Modo.OFF)
            .count();
    }


  




}
