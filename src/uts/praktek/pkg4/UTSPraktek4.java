/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.praktek.pkg4;

/**
 *
 * @author ASUS
 */
public class UTSPraktek4 {
   public static void main(String[] args)
   {
      Instructor myInstructor =
          new Instructor("Tasmara", "Hasbi Rivanda", "HRT0908");

      TextBook myTextBook =
          new TextBook("Pengenalan Sitem Informasi",
                       "Abdul Kadir", "Andi Offset");

      Course myCourse = 
         new Course("Information Systems", myInstructor,
                    myTextBook);

      System.out.println(myCourse);
   }
}
