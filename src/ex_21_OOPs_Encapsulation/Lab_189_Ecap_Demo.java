package ex_21_OOPs_Encapsulation;

public class Lab_189_Ecap_Demo {
    static void main(String[] args) {
        VWOlogin vwOlogin = new VWOlogin("admin", "pass123");
        System.out.println(vwOlogin.password);
        vwOlogin.password="345";
        System.out.println(vwOlogin.password);

        GoodVWOLogin vwoLogin1= new GoodVWOLogin("admin","pwd123");
        System.out.println(vwOlogin.password);


    }


}


class VWOlogin{
    public String username;
    public String password;

    public VWOlogin(String username, String password){

        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    GoodVWOLogin(String usernmae, String password){

        this.password= password;
        this.username= usernmae;
    }
}