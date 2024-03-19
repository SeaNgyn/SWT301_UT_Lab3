import account.account;

import java.util.ArrayList;
import java.util.List;

public class loginMain {

    List<account> list = new ArrayList<>();

    public String register(String username, String password, String phone) {
        if (username.length() < 8 || username.length() > 12 || Character.isDigit(username.charAt(0)) || !username.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (password.length() < 13 || !password.matches(".*\\d.*") || !password.matches(".*[^a-zA-Z0-9].*")) {
            throw new IllegalArgumentException("Invalid password");
        }

        if (phone.length() != 10 || phone.charAt(0) != '1') {
            throw new IllegalArgumentException("Invalid phone number");
        }

        for (account o : list) {
            if (username.equals(o.getUsername())) {
                throw new IllegalArgumentException("Username already exists");
            }
        }

        account ac = new account(username, password, phone);
        list.add(ac);
        return "Register successfully";
    }



    // 1: loi 8-12
    // 2: loi chu cai dau la digit
    // 3: chua ki tu dac biet
    // 4: pass khong >= 13
    // 5: ko chua it nhat 1 number
    // 6: ko co it nhat 1 ky tu dac biet
    String checking(String username, String password, String phone) {
        if (username.length() < 8 || username.length() > 12) {
            return "username is invalid";
        }

        if (Character.isDigit(username.charAt(0))) {
            return "username is invalid";
        }

        if (!username.matches("[a-zA-Z0-9]+")) {
            return "username is invalid";
        }

        if (password.length() < 13) {
            return "password is invalid";
        }

        if (!password.matches(".*\\d.*")) {
            return "password is invalid";
        }

        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            return "password is invalid";
        }

        if (phone.length() != 10) {
            return "Phone number is invalid";
        }

        if (phone.charAt(0) != '1') {
            return "Phone number is invalid";
        }

        for (account o : list) {
            if (username.equals(o.getUsername())) {
                return"username already exist";
            }
        }
        return "nothing error";
        //System.out.println("Register successfully");
    }
}
