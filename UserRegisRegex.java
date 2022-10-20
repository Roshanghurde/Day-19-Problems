package Day19problems;

public class UserRegisRegex {
    public static void main(String[] args) {
        String RegistrationName = "Roshan_Ghurde";

        String UserToCheck = "^[A-Za-z]\\w{5,29}$";
        System.out.println(RegistrationName.matches(UserToCheck));
    }
}
      