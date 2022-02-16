package com.project.db;

import java.util.ArrayList;

public class DBUtil {

    private static ArrayList<Users> users = new ArrayList<>();
    private static Long id = 4L;

    static{

        users.add(new Users(1L, "ilyas", "qwerty", "Ilyas Zhuanyshev"));
        users.add(new Users(2L, "arman", "qweqwe", "Arman Ermekov"));
        users.add(new Users(3L, "erzhan", "qweqwe", "Erzhan Assetov" ));

    }

    public static Users getUser(String login, String password){
        for(Users u : users){
            if(u.getLogin().equals(login)&&u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

}
