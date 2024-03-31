package async;

public class AccountService {
    public static String getBankAccount(int id) {
        if (id == 1) {
            return "Account A";
        } else if (id == 2) {
            return "Account B";
        } else {
            return "Invalid Input";
        }
    }


    public static String getBankBalance(String accountName) {
        if (accountName.equals("Account A")) {
            return "10000";
        } else if (accountName.equals("Account B")) {
            return "20000";
        } else {
            return "Invalid Input";
        }
    }


}
