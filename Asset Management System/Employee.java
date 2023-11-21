import java.util.*;
public class Employee {
    int id;
    int SoftwareCount;
    int cost;
    List<Device>dev;
    public Employee(int id){
        cost = 0;
        SoftwareCount=0;
        this.id=id;
        dev = new ArrayList<>();
    }
    public void install(int devId,int swId){
        if(dev.size()<devId){
            Device e = new Device(this.id,devId);
            dev.add(e);
        }
        
        dev.get(devId-1).install(swId);
        SoftwareCount++;
    }
    public int SoftwareCount(){
        return this.SoftwareCount;
    }
    public int SoftwareCost(){
        int cost = 0;
        for(int i=0;i<dev.size();i++)
            cost+=dev.get(i).SoftwareCost;
        return cost;
    }
}
