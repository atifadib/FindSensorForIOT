/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

/**
 *
 * @author ATIF ADIB
 */
public class IOT {
    public static String url="jdbc:mysql://localhost:3306/iot";
    public static String user="root";
    public static String pass="atifadib251194";
    public static String driver="com.mysql.jdbc.Driver";
    public static Login obj1=new Login();
    public static Menu objmenu=new Menu();
    public static AddUser objuser=new AddUser();
    public static SenDataView objview=new SenDataView();
    public static SensorSelect objsen=new SensorSelect();
    public static Help hpage=new Help();
    public static RunQuery rq=new RunQuery();
    public static mt m=new mt();
    public static SysInfo sinf=new SysInfo();
    public static InsLog ilog=new InsLog();
    public static Best bb=new Best();
    public static RaiseRequest rr=new RaiseRequest();
    public static void raise(){
        rr.setVisible(true);
        objmenu.setVisible(false);
    }
    public static void findsensor(){
        objmenu.setVisible(false);
        bb.setVisible(true);
    }
    public static void openLog(){
        objmenu.setVisible(false);
        ilog.setVisible(true);
    }
    public static void sysinfo(){
        objmenu.setVisible(false);
        sinf.setVisible(true);
    }
    public static void maintain(){
        objmenu.setVisible(false);
        m.setVisible(true);
    }
    public static void run(){
        objmenu.setVisible(false);
        rq.setVisible(true);
    }
    public static void helpcall(){
        objmenu.setVisible(false);
        hpage.setVisible(true);
    }
    public static void sensel(){
        objsen.setVisible(true);
    }
    public static void viewData(){
        objsen.setVisible(false);
        objview.setVisible(true);
    }
    public static void start(){
        obj1.setVisible(true);
    }
    public void startmenu(){
        obj1.setVisible(false);
        objmenu.setVisible(true);
    }
    public void startadd(){
        objuser.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        start();
    }
    
}
