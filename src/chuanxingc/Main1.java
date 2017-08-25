package chuanxingc;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 写一个算法判断某个字符串是不是一个合法的IP地址.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        String  originIp=sin.next().replaceAll(" ","");

       if (isIpv4(originIp)||isIPv6(originIp)){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }

    }
    public static boolean isIpv4(String ip){
        if(!Pattern.matches("[0-9]*[.][0-9]*[.][0-9]*[.][0-9]*", ip))
            return false;
        else {
            String[] arrays = ip.split("\\.");
            if(Integer.parseInt(arrays[0]) < 256 && arrays[0].length() <= 3
                    &&Integer.parseInt(arrays[1]) < 256 && arrays[0].length() <= 3
                    &&Integer.parseInt(arrays[2]) < 256 && arrays[0].length() <= 3
                    &&Integer.parseInt(arrays[3]) < 256 && arrays[0].length() <= 3){
                return true;
            }
            else return false;
        }
    }
    public static boolean isIPv6(String ip){
        if(!Pattern.matches("^((([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4})|" +
                                  "(([0-9A-Fa-f]{1,4}:){1,7}:)|(([0-9A-Fa-f]{1,4}:){6}:[0-9A-Fa-f]{1,4})" +
                                  "|(([0-9A-Fa-f]{1,4}:){5}(:[0-9A-Fa-f]{1,4}){1,2})|(([0-9A-Fa-f]{1,4}:){4}(:[0-9A-Fa-f]{1,4}){1,3})" +
                                  "|(([0-9A-Fa-f]{1,4}:){3}(:[0-9A-Fa-f]{1,4}){1,4})|(([0-9A-Fa-f]{1,4}:){2}(:[0-9A-Fa-f]{1,4}){1,5})" +
                                  "|([0-9A-Fa-f]{1,4}:(:[0-9A-Fa-f]{1,4}){1,6})|(:(:[0-9A-Fa-f]{1,4}){1,7})|" +
                                  "(([0-9A-Fa-f]{1,4}:){6}(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})" +
                                  "|(([0-9A-Fa-f]{1,4}:){5}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})" +
                                  "|(([0-9A-Fa-f]{1,4}:){4}(:[0-9A-Fa-f]{1,4}){0,1}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})" +
                                  "|(([0-9A-Fa-f]{1,4}:){3}(:[0-9A-Fa-f]{1,4}){0,2}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})" +
                                  "|(([0-9A-Fa-f]{1,4}:){2}(:[0-9A-Fa-f]{1,4}){0,3}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})" +
                                  "|([0-9A-Fa-f]{1,4}:(:[0-9A-Fa-f]{1,4}){0,4}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3})" +
                                  "|(:(:[0-9A-Fa-f]{1,4}){0,5}:(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}))$", ip)){
            return false;
        }
        return true;
    }
}
