import java.util.*;
public class Admin {
    List<Employee>emp = new ArrayList<>();
    static int empId = 0;
    public Admin(){
        install(1,1,1);

    }
    public void install(int empId,int devID,int swID){
        if(emp.size()<empId){
            Employee e = new Employee(empId);
            emp.add(e);
        }
        emp.get(empId-1).install(devID,swID);

    }
    public List<Device> getDevices(){
        List<Device> dev = new ArrayList<>();
        for(Employee employee : emp)
            dev.addAll(employee.dev);
        return dev;
    }
    public List<Software> getSoftwares(){
        List<Software> sw = new ArrayList<>();
        List<Device> dev = getDevices();
        for(Device devices : dev)
            sw.addAll(devices.InstalledSoftwares);
        return sw;
    }
}
