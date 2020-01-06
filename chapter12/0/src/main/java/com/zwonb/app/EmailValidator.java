package com.zwonb.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 说明
 *
 * @author zwonb
 * @date 2020-01-06
 */
public class EmailValidator {

    public static boolean isValidEmail(String email){
        if (null==email || "".equals(email)) return false;
        //Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); //简单匹配
        Pattern p =  Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");//复杂匹配
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
