/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan1;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.net.InetAddress;

/**
 *
 * @author cr4zyb0t
 */
public class DisplayAllIP {
    public static void getAll() {
        try{
            Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
            while(netInterface.hasMoreElements()){
                NetworkInterface networkInterface
                        = netInterface.nextElement();
                //Lay danh sach dia chi IP cua cac giao dien mang
                Enumeration<InetAddress> inetEnumeration
                       = networkInterface.getInetAddresses();
                //Duyet qua tung dia chi IP va in ra man hinh
                while(inetEnumeration.hasMoreElements()){
                    InetAddress inet = inetEnumeration.nextElement();
                    String ip = inet.getHostAddress();
                    System.out.printf("Interface: %s - IPAddress : %s\n",networkInterface.getName(), ip);
                }
            }
        }
        catch(Exception e){
            
        }
    }
}
