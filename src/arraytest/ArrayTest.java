/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;
/**
 *
 * @author rkaune
 */
public class ArrayTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] friends;
        friends = new String[5]; // fixed size of 5
        String [] friendsTwo = {"Peter","Evan","Aaron"};
        friendsTwo[1]="Thomas";
        int [] ages = {17,15,17};
        
        for (int i=0;i<=friendsTwo.length;i++){
            System.out.println(friendsTwo[i]);
        }
        for (String element: friendsTwo){
            System.out.println(element);
        }
    }
    
}
