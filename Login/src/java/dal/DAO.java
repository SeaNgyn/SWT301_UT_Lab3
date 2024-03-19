/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.account;

/**
 *
 * @author Admin
 */
public class DAO {

    List<account> list = new ArrayList<>();

    public String register(String username, String password, String phone) {
    if (username.length() < 8 || username.length() > 12) {
        return "Username is invalid"; 
    }

    // Kiểm tra xem tên người dùng có bắt đầu bằng số không
    if (!Character.isDigit(username.charAt(0))) {
        return "Username is invalid";
    }

    // Kiểm tra xem tên người dùng có chứa ký tự đặc biệt không
    if (!username.matches("[a-zA-Z0-9]+")) {
        return "Username is invalid"; 
    }

    // Kiểm tra độ dài của mật khẩu
    if (password.length() < 13) {
        return "Password is invalid"; 
    }

    // Kiểm tra xem mật khẩu có chứa ít nhất một số không
    if (!password.matches(".*\\d.*")) {
        return "Password is invalid";
    }

    // Kiểm tra xem mật khẩu có chứa ít nhất một ký tự đặc biệt không
    if (!password.matches(".*[^a-zA-Z0-9].*")) {
        return "Password is invalid"; 
    }

    // Kiểm tra độ dài và số điện thoại bắt đầu bằng số 1
    if (phone.length() != 10 || phone.charAt(0) != '1') {
        return "Phone number is invalid"; 
    }
    
    for (account o : list) {
        if (username.equals(o.getUsername())) {
            return "Username already exists";
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
    private void checking(String username, String password, String phone) {
        if (username.length() < 8 || username.length() > 12) {
            System.out.println("username is invalid");
        }

        if (!Character.isDigit(username.charAt(0))) {
            System.out.println("username is invalid");
        }

        if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("username is invalid");
        }

        if (password.length() < 13) {
            System.out.println("password is invalid");
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("password is invalid");
        }

        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            System.out.println("password is invalid");
        }

        if (phone.length() != 10) {
            System.out.println("Phone number is invalid");
        }

        if (phone.charAt(0) != '1') {
            System.out.println("Phone number is invalid");
        }

        for (account o : list) {
            if (username.equals(o.getUsername())) {
                System.out.println("username already exist");
            }
        }

        //System.out.println("Register successfully");
    }

}
