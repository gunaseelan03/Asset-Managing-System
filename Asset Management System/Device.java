import java.util.*;
public class Device {
    int empId;
    int devId;
    int SoftwareCount;
    int SoftwareCost;
    List<Software>InstalledSoftwares;
    public Device(int empId,int devId){
        SoftwareCount=0;
        SoftwareCost=0;
        this.empId = empId;
        this.devId=devId;
        InstalledSoftwares = new ArrayList<>();
    }
    public int NoOfSoftwares(){
        return SoftwareCount;
    }
    public int SoftwareCost(){
        return  SoftwareCost;
    }
    public void install(int swId){
        Software sw = new Vendor().findSoftware(swId);
        InstalledSoftwares.add(sw);
        InstalledSoftwares.get(swId-1).install(sw);
        SoftwareCount++;
        SoftwareCost+=sw.price;
    }
}
