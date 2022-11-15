package project;

import com.mysql.cj.protocol.Resultset;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class controller{

   private static String person;
  private  static String  id;
    @FXML
    private Button deposit;
    @FXML
    private Button fdu;
    @FXML
    private Label a1;
    @FXML
    private Label a3;
    @FXML
    private TextField uidpassword;
    @FXML
    private TextField uipusername;
    @FXML
    private TextField uippassword;
    @FXML
    private TextField amount;
    @FXML
    private TextField uidemail;
    @FXML
    private TextField old;
    @FXML
    private TextField newp;
    @FXML
    private TextField conp;
    @FXML
    private Label a2;
    @FXML
    private Button back;
    @FXML
    private Button ph;
    @FXML
    private Button logout;
    @FXML
   private TextField firstname;
    @FXML
    private TextField age;
    @FXML
    private TextField uiemail;
    @FXML
    private TextField uipassword;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private TextField illness;
    @FXML
    private TextField country;
    @FXML
    private TextField address;
    @FXML
    private TextField lastname;
    @FXML
    private RadioButton malebtn;
    @FXML
    private RadioButton femalebtn;
    @FXML
    private TextField password;
    @FXML
    private TextField cpassword;
    @FXML
    private TextField initial;
    @FXML
    private TextField firstnamed;
    @FXML
    private TextField aged;
    @FXML
    private TextField emaild;
    @FXML
    private TextField licenceidd;
    @FXML
    private TextField doctoridd;
    @FXML
    private TextField phoned;
    @FXML
    private TextField nationalityd;
    @FXML
    private TextField addressd;
    @FXML
    private TextField lastnamed;
    @FXML
    private RadioButton malebtnd;
    @FXML
    private RadioButton femalebtnd;
    @FXML
    private TextField passwordd;
    @FXML
    private TextField cpasswordd;

    @FXML
    private TextField docname;

    @FXML
    private TextField medipre;

    @FXML
    private TextField userpre;
    @FXML
    private TextField mediname;

    @FXML
    private TextField pri;

    @FXML
    private TextField quan;
    @FXML
    private Label labt;

   public void  gotopharmacistlogin() throws IOException {
       Stage st=(Stage)ph.getScene().getWindow();
       st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("loginpharmacist.fxml"));
        stage.setScene(new Scene(root ,320,400));
        stage.show();
    }

    public void  gotodoctor() throws IOException {
        Stage st=(Stage)ph.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("logindoctor.fxml"));
        stage.setScene(new Scene(root ,320,400));
        stage.show();
    }
    public void  lgotouserlogin() throws IOException {
        Stage st=(Stage)ph.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("userlog.fxml"));
        stage.setScene(new Scene(root ,350,400));
        stage.show();
    }
    public void gobacktohome()  throws IOException {
       Stage st=(Stage)back.getScene().getWindow();
       st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
        stage.setScene(new Scene(root ,760,500));
        stage.show();

    }
    public void goformtouserlog()  throws IOException {
        Stage st=(Stage)back.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("userlog.fxml"));
        stage.setScene(new Scene(root ,350,400));
        stage.show();

    }
    public void gouserlogtoform()  throws IOException {
        Stage st=(Stage)back.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("signupuser.fxml"));
        stage.setScene(new Scene(root ,760,500));
        stage.show();

    }
    public  void insertd(){
        String firstname=this.firstnamed.getText();
        int age=Integer.parseInt(this.aged.getText());
        String  email=this.emaild.getText();
        String country="kenya";
        String  nationality =this.nationalityd.getText();
        String doctoridd=this.doctoridd.getText();
        int phone=Integer.parseInt(this.phoned.getText());
        String licenceid=this.licenceidd.getText();
        String address=this.addressd.getText();
        String  lastname=this.lastnamed.getText();
        String password=this.passwordd.getText();
        String cpassword=this.cpasswordd.getText();

        char gender;
        if(malebtnd.isSelected() ){
            gender='M';

        }
        else if(femalebtnd.isSelected()){
            gender='F';

        }
        else{
            gender='N';
        }
        if (cpassword.equals(password)) {
            String sql = "insert into doctors(firstname,lastname,nationality,gender,country,phone,doctorid,licenceid,address,uname,passwords)values('" + firstname + "','" + lastname + "','" + nationality + "','" + gender + "','" + country + "','" + phone + "','" + doctoridd + "','" + licenceid + "','" + address + "','" + email + "','" +password +"')";
            dbcon.dbmethod(sql,"iu");
        }
        else{
            a1.setText("password doesnt match");

        }
    }




   public  void insert(){
       String firstname=this.firstname.getText();
      int age=Integer.parseInt(this.age.getText());
       String  email=this.email.getText();
       String  nationality ="kenyan";
       String country=this.country.getText();
    int phone=Integer.parseInt(this.phone.getText());
      String illness=this.illness.getText();
      String address=this.address.getText();
      String  lastname=this.lastname.getText();
      String password=this.password.getText();
       String cpassword=this.cpassword.getText();
       int initial=Integer.parseInt(this.initial.getText());
       char gender;
       if(malebtn.isSelected() ){
           gender='M';

       }
       else if(femalebtn.isSelected()){
           gender='F';

       }
       else{
           gender='n';
       }
if (cpassword.equals(password)) {
    String sql = "insert into users(firstname,lastname,nationality,gender,country,phone,illness,address,uname,passwords,balance)values('" + firstname + "','" + lastname + "','" + nationality + "','" + gender + "','" + country + "','" + phone + "','" + illness + "','" + address + "','" + email + "','" +password + "','" + initial + "')";
    dbcon.dbmethod(sql,"iu");
}
else{
    a1.setText("password doesnt match");

}
   }
   public void userlogincheck() throws SQLException, IOException {
       String uiemail=this.uiemail.getText();
       String uipassword=this.uipassword.getText();
       String sql="select passwords from users where uname='"+uiemail+"'";
      ResultSet rs= dbcon.dbmethod(sql,"get");
      rs.next();
      if(uipassword.equals(rs.getString("passwords"))){
          this.person="pa";
          this.id=uiemail;
          System.out.println(this.id);
          System.out.println("out");
          Stage st=(Stage)back.getScene().getWindow();
          st.close();
          Stage stage =new Stage();
          Parent root = FXMLLoader.load(getClass().getResource("user.fxml"));
          stage.setScene(new Scene(root ,560,500));
          stage.show();


      }
      else{
          a2.setText("username or password incorrect");

      }

   }
    public void doctorlogincheck() throws SQLException, IOException {
        String uiemail = this.uidemail.getText();
        String uipassword = this.uidpassword.getText();
        String sql = "select passwords from doctors where uname='" + uiemail + "'";
        ResultSet rs = dbcon.dbmethod(sql, "get");
        rs.next();
        if (uipassword.equals(rs.getString("passwords"))) {
            this.person = "do";
            this.id = uiemail;
            System.out.println("out");
            Stage st = (Stage) back.getScene().getWindow();
            st.close();
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("doctor.fxml"));
            stage.setScene(new Scene(root, 560, 500));
            stage.show();


        }
    }
        public void pharmalogincheck() throws SQLException, IOException {
            String uiemail=this.uipusername.getText();
            String uipassword=this.uippassword.getText();
            String sql="select passwords from pharmacist where uname='"+uiemail+"'";
            ResultSet rs= dbcon.dbmethod(sql,"get");
            rs.next();
            System.out.println(rs.getString("passwords"));
            if(uipassword.equals(rs.getString("passwords"))){

                this.person="ph";
                this.id=uiemail;

                Stage st=(Stage)back.getScene().getWindow();
                st.close();
                Stage stage =new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("pharmascist.fxml"));
                stage.setScene(new Scene(root ,600,500));
                stage.show();


            }
        else{
            a3.setText("username or password incorrect");

        }

    }
    public void gotodeposit() throws IOException {
        Stage st=(Stage)deposit.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("deposit.fxml"));
        stage.setScene(new Scene(root ,560,500));
        stage.show();

    }
    public void gotorest() throws IOException {
        Stage st=(Stage)logout.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("restpassword.fxml"));
        stage.setScene(new Scene(root ,560,500));
        stage.show();

    }
    public void gotodf() throws IOException {
        Stage st=(Stage)logout.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("doctorform1.fxml"));
        stage.setScene(new Scene(root ,700,600));
        stage.show();

    }
    public void gotoprescribe() throws IOException {
        Stage st=(Stage)logout.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("prescribe.fxml"));
        stage.setScene(new Scene(root ,700,600));
        stage.show();

    }
    public void gotorefil() throws IOException {
        Stage st=(Stage)logout.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("refillstock.fxml"));
        stage.setScene(new Scene(root ,700,600));
        stage.show();

    }
    public void gotouser() throws IOException {
        Stage st=(Stage)fdu.getScene().getWindow();
        st.close();
        Stage stage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("user.fxml"));
        stage.setScene(new Scene(root ,560,500));
        stage.show();

    }
    public void deposit() throws SQLException {

        String cm="select balance from users where uname='"+this.id+"'";
        ResultSet r= dbcon.dbmethod(cm,"get");
        r.next();
        String m=r.getString("balance");
        System.out.println(m);
        int total=Integer.parseInt(amount.getText())+Integer.parseInt(m);

        String s=String.valueOf(total);
        System.out.println(s);
        String sql="update users set balance='"+s+"' where uname='"+this.id+"'";
        dbcon.dbmethod(sql,"iu");


    }
    public void prescribe() throws SQLException {

        String docname= this. docname.getText();
        String medipre = this.medipre.getText();


         String userpre=this.userpre.getText();
        String cm="select price from levelofstock where medicienename='"+medipre+"'";
        ResultSet r= dbcon.dbmethod(cm,"get");
        r.next();
        String m=r.getString("price");

        String sql = "insert into combo(username,medicienename,firstname,price)values('" + userpre + "','" + medipre + "','" + docname + "','" + m + "')";
        dbcon.dbmethod(sql,"iu");


    }
    public void refill(){

        String mediname= this. mediname.getText();
        int pri =  Integer.parseInt(this.pri.getText());


        int quan=Integer.parseInt(this.quan.getText());

        String sql = "insert into levelofstock(medicienename,quantityleft,price)values('" + mediname + "','" +quan+ "','" + pri + "')";
        dbcon.dbmethod(sql,"iu");


    }

   public void rest() throws SQLException {


       String lsql=null;
       if(this.person.equals("pa")){
          lsql="select passwords from users where uname='"+this.id+"'";
       }
       else  if(this.person.equals("ph")){
         lsql="select passwords from pharmacist where uname='"+this.id+"'";
       }
       else  if(this.person.equals("do")){
           lsql="select passwords from doctors where uname='"+this.id+"'";
       }
       System.out.println(lsql);
       ResultSet rs= dbcon.dbmethod(lsql,"get");
       rs.next();
       System.out.println(rs.getString("passwords"));
       if(old.getText().equals(rs.getString("passwords"))){
           if(newp.getText().equals(conp.getText())){
               String sql=null;
               System.out.println("hi");
               if(this.person.equals("pa")){
                   sql="update users set passwords='"+newp.getText()+"' where uname='"+this.id+"'";
               }
              else  if(this.person.equals("ph")){
                   sql="update pharmacist set passwords='"+newp.getText()+"' where uname='"+this.id+"'";
               }
               else  if(this.person.equals("do")){
                   sql="update doctors set passwords='"+newp.getText()+"' where uname='"+this.id+"'";
               }
               System.out.println(sql);
               dbcon.dbmethod(sql,"iu");
           }
       }



   }
   public void refresh() throws SQLException {
       String sql="select balance from users where uname='"+id+"'";
       ResultSet t=dbcon.dbmethod(sql,"get");
       t.next();
       labt.setText(t.getString("balance"));
   }
}




