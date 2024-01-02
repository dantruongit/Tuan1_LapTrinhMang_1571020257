/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan1;

import java.net.InetAddress;

/**
 *
 * @author cr4zyb0t
 */
public class GetIP {
    public static String get(String host){
        try{
            InetAddress inet = InetAddress.getByName(host);
            return inet.getHostAddress();
        }
        catch(Exception e){
            return "ERROR";
        }
    }
}
