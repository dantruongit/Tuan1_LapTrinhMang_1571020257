/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan1;

import java.net.Inet4Address;
import java.net.InetAddress;

/**
 *
 * @author cr4zyb0t
 */
public class Tuan1 {
    public static void connect(){
        try{
            //Lay dia chi IP cua google.com
            InetAddress  inet = InetAddress.getByName("www.google.com");
            // Thu ket noi
            boolean isConnected = inet.isReachable(5000);
            //In ra thong bao
            if(isConnected){
                System.out.println("Ket noi toi google thanh cong");
            }
            else{
                System.out.println("Ket noi toi google that bai");
            }
        }
        catch(Exception e){
            
        }
    }

    //Kiem tra ket noi Internet
    public static void main(String[] args) {
        try{
            //Bai 1 
            System.out.println("Bai 1");
            connect();
            //Bai 2
            System.out.println("Bai 2");
            String ipgg = GetIP.get("www.google.com");
            System.out.println("Dia chi IP cua google la : "+ ipgg);
            //Bai 3
            System.out.println("Bai 3");
            DisplayAllIP.getAll();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
