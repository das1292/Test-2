import java.time.LocalDate;

public class Klient implements Cloneable,Comparable<Klient> {
    public Klient(String prywatnePola, LocalDate dataZakupy, Double rachunek){
        this.prywatnePola=prywatnePola;
        this.dataZakupy=dataZakupy;
        this.rachunek=rachunek;
    }
    @Override
    public String tostring(){
        return "Klient[" + "prywatnePola='" + prywatnePola + '\'' + ",dataZakupy='" + dataZakupy + '\'' + ",rachunek=" + rachunek + ']';
    }
    @Override
    public int compareTo(Klient o){
        if(this.prywatnePola.compareTo(o.prywatnePola)==0)
        {
            if(this.dataZakupy==o.dataZakupy)
                return 0;
            else if((this.dataZakupy>o.dataZakupy))
                return 1;
            else
                return -1;
        }
        else if(this.prywatnePola.compareTo(o.prywatnePola)==1)
            return 1;
        return -1;
    }
    public String getPrywatnePola(){
        return prywatnePola;
    }
    public LocalDate getDataZakupy(){
        return dataZakupy;
    }
    public double getRachunek(){
        return rachunek;
    }

    public void setPrywatePola(String prywatePola){
        this.prywatnePola=prywatePola;
    }
    public void setDataZakupy(LocalDate dataZakupy){
        this.dataZakupy=dataZakupy;
    }
    public void setRachunek(double rachunek){
        this.rachunek=rachunek;
    }
    private String prywatnePola;
    private LocalDate dataZakupy;
    private double rachunek;
}
