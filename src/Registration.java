
public class Registration {
    /*
    Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
     */

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
        //first time setting up a user-best practice by putting setter in the constructor
    }

    public void setEmail(String email) {

        if (email.contains("yahoo")){
            this.email = email;
        }else{
            System.out.println("not an accepted email provider");
        }
    }

    public void setUserName(String userName) {

        if(!userName.isEmpty()&& userName.length()>6){
            this.userName = userName;
        }else{
            System.out.println("Username does not meet requirements.");
        }
    }

    public void setPassword(String password) {

        if(!password.isEmpty()&& password.length()>6&& password!=userName){
            this.password = password;
        }else{
            System.out.println("Password does not meet requirements.");
        }
    }

    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }



    public static void main(String[] args) {
        Registration r1= new Registration("ayeshasaif97@yahoo.com","User123","Pass123");
        System.out.println("Email: "+ r1.getEmail());
        System.out.println("Username: "+r1.getUsername());
        System.out.println("Password: "+r1.getPassword());





    }


}


