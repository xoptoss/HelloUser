package Main;

import java.util.Scanner;

public class mainClass {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  String tUser = "";
  System.out.print("Whats your name? ");
  Scanner tKeyboard = new Scanner(System.in);
  tUser = tKeyboard.nextLine();
  
  System.out.println("Hello " + tUser);
 }

}