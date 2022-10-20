package Day19problems;

public class Regexemail {
    public static void main(String[] args) {
        String Email = "roshanghurde05@gmail.com";

        String EmailToCheck = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{3,})$";
        System.out.println(Email.matches(EmailToCheck));
    }
}
