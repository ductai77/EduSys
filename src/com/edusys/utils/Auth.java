
package com.edusys.utils;

import com.edusys.entity.Nhanvien;


public class Auth {
    public static Nhanvien user=null;
    public static void clear(){
        Auth.user=null;
    }
    public static boolean isLogin(){
        return Auth.user != null;
    }
    public static boolean isManager(){
        return Auth.isLogin() && user.getVaitro();
    }
}
