import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static boolean discountAmount(Klient k){
        if((k.getRachunek()*ObsługaKlienta.getProcentRabatu())>300)
        {
            return true;
        }
        else
            return false;
    }

    public static HashMap<Integer,String> DiscountMap(ArrayList<Klient>klist){
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<klist.size();i++)
        {
            if(discountAmount(klist.get(i)))
            {
                map.put(klist.get(i).getRachunek(),klist.get(i).getPrywatnePola())
            }
        }
        return map;
    }

    public static void main(String[] args){
        ArrayList<Klient> grupa= new ArrayList<Klient>();
        Klient k1= new Klient("Kowalski", "2005-02-27",300.1);
        Klient k2= new Klient("Bąk",'2005-02-27',150.2);
        Klient k3= new Klient("Nowak",'2021-05-13',500.50);
        Klient k4= new Klient("Kamiński","2011-01-01",500.50);
        Klient k5= new Klient("Mostowiak",'2000-11-11',600.25);
        Klient k6= new Klient("Mostowiak",'2001-02-02',100.0);

        grupa.add(k1);
        grupa.add(k2);
        grupa.add(k3);
        grupa.add(k4);
        grupa.add(k5);
        grupa.add(k6);
        System.out.println("\n\n");
    }
}