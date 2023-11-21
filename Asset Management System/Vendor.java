import java.util.*;
public class Vendor {
    static List<Software>Softwares=new ArrayList<>();
    int price = 3000;
    int installCount=0;
    int installCost=0;
    public Vendor(){
    }
    public Vendor(int n){
        for(int i=1;i<=n;i++)
            Softwares.add(new Software(i,price+500));
    }
    public Software findSoftware(int swId){
        for(int i=0;i<Softwares.size();i++){
            if(Softwares.get(i).swId==swId)
                return Softwares.get(i);
        }
        return null;
    }
    public void Buy(Software sw){
        installCount++;
        installCost+=sw.price;
    }
}
