public class Software {
    int swId;
    int installCount;
    int price;
    int licenceId;
    public Software(int swId,int price){
        this.swId = swId;
        this.price = price;
    }
    public int SoftwareInstall_Count(){
        return installCount;
    }
    public int SoftwareCost(){
        return installCount*price;
    }
    public void install(Software sw){
        installCount++;
        new Vendor().Buy(sw);
    }
}
