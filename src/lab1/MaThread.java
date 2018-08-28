/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wil90
 */
public class MaThread extends Thread{
    DateTimeFormatter dtf;
    LocalDateTime now;  
    NewJDialog dialog;
    public MaThread (NewJDialog newdialog){
        now = LocalDateTime.now();  
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
        dialog = newdialog;
    }
    public void run(){
      while(true){
        now = LocalDateTime.now();
        dialog.ChangerDate(dtf.format(now));
      }
    }//fin run
}//fin MaThread