/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_2;

import java.util.Scanner;
class Node {
    int data;
    Node next;
    
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
/**
 *
 * @author Student
 */
public class Exam_2 {

    private void insertstart(int index) {
    }
    private class Node{
        String data;
      
        Node next;
    } 
    private Node head;
    private Node tail;
    int size;
    
    private Node createNewNode (int index) throws Exception{
    
        Node node = new Node ();
        
        if (node == null) {
            throw new Exception("does not Located");
        }else {
            node.data = index;
            node.next = null;
            return node;
        }
    }
  
    
    private void insertion (int index, int pos) throws Exception{
        if (pos < 0 || pos> size){
            throw new Exception ("invalid position");
        }
        if (pos == 0){
            insertstart (index);
            
        }else if(pos == size){
            insertend (index);
        }
        
    }
       private void insertend(int index) throws Exception{
        Node node = createNewNode (index);
            if (head == null){
                head = node;
            }else {
               Node temp = head;
               while (temp.next != null){
                   temp = temp.next;
               }
            }
    }
      
      public void display() throws Exception{
           if (size == 0){
                throw new Exception("Linked List Is empty");
           }
         
           
      }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
    
     
     while (true) {
         System.out.println("names of student");
         System.out.println("Display all Names");
         System.out.println("Exit");
         int choice = scn.nextInt();
         
         switch (choice) {
             case 1:
                 System.out.println("Names of studens");
         String index = scn.nextLine();
             break;
             
             case 2:
           list.display();
             break;
             
             case 3:
                 System.out.println("exiting program.");
                 scn.close();
                 System.exit(0); 
             break;
             
             case 4:
                 System.out.println("Fita");
                 System.out.println("Pride Powder");
                 System.out.println("Canola oil");
                 System.out.println("Nescafe black coffee");
                 System.out.println("Ariel Powder");
                 System.out.println("Rebisco");
                 System.out.println("Steelwool");
                 System.out.println("Head and Shoulder");
                 System.out.println("Nova");
                 System.out.println("Tanduay");
                 System.out.println("Bearbrand");
                 System.out.println("Nature Spring mineral water 8oz");
                 System.out.println("Coke 1ltr");
                 System.out.println("Sprite Kasalo");
                 System.out.println("Royal 1ltr");
                System.out.println("Sugar");
                 
                 
             
             default:
                 System.out.println("Invalid choice");
         }
     }
    }
    
}
