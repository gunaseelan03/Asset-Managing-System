import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("...............Welcome to Asset Management System........................");
        System.out.println("Enter no of softwares");
        int n = sc.nextInt();
        Vendor v = new Vendor(n);
        Admin admin = new Admin();
        System.out.println("1.Software Install Count   2.SoftwareCost "+"\n"+"Enter your choice");
        int c = sc.nextInt();
        switch(c){
            case 1:{
                System.out.println("For  1.Employee  2.Device  3.software");
                int ch = sc.nextInt();
                switch(ch){
                    case 1:{
                        System.out.println("Enter Employee Id");
                        int empId = sc.nextInt();
                        List<Employee>emp = admin.emp;
                        for(int i=0;i<emp.size();i++){
                            if(empId==emp.get(i).id){
                                System.out.println(emp.get(i).SoftwareCount());
                                System.exit(0);
                            }
                        }
                        System.out.println("Invalid id");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter Device Id");
                        int Id = sc.nextInt();
                        List<Device>dev = admin.getDevices();
                        for(int i=0;i<dev.size();i++){
                            if(Id==dev.get(i).devId){
                                System.out.println(dev.get(i).NoOfSoftwares());
                                System.exit(0);
                            }
                        }
                        System.out.println("Invalid id");
                        break;
                    }
                    case 3:{
                        System.out.println("Enter Software Id");
                        int Id = sc.nextInt();
                        List<Software>sw = admin.getSoftwares();
                        for(int i=0;i<sw.size();i++){
                            if(Id==sw.get(i).swId){
                                System.out.println(sw.get(i).SoftwareInstall_Count());
                                System.exit(0);
                            }
                        }
                        System.out.println("Invalid id");
                        break;
                    }
                }
            }
            case 2:{
                System.out.println("For  1.Employee  2.Device  3.software 4.Vendor");
                int ch = sc.nextInt();
                switch(ch){
                    case 1:{
                        System.out.println("Enter Employee Id");
                        int empId = sc.nextInt();
                        List<Employee>emp = admin.emp;
                        for(int i=0;i<emp.size();i++){
                            if(empId==emp.get(i).id){
                                System.out.println(emp.get(i).SoftwareCost());
                                System.exit(0);
                            }
                        }
                        System.out.println("Invalid id");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter Device Id");
                        int Id = sc.nextInt();
                        List<Device>dev = admin.getDevices();
                        for(int i=0;i<dev.size();i++){
                            if(Id==dev.get(i).devId){
                                System.out.println(dev.get(i).SoftwareCost());
                                System.exit(0);
                            }
                        }
                        System.out.println("Invalid id");
                        break;
                    }
                    case 3:{
                        System.out.println("Enter Software Id");
                        int Id = sc.nextInt();
                        List<Software>sw = admin.getSoftwares();
                        for(int i=0;i<sw.size();i++){
                            if(Id==sw.get(i).swId){
                                System.out.println(sw.get(i).SoftwareCost());
                                System.exit(0);
                            }
                        }
                        System.out.println("Invalid id");
                        break;
                    }
                    case 4:{
                        System.out.println(v.installCost);
                    }
                }
            }
        }
        



    }
}