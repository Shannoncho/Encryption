/**
 * Write a description of class Encry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Encrypt
{
  
   private String x, y; 

   public Encrypt (String x)
   {
      String message = x;
                
        char[] cArray =message.toCharArray();
        
        int counter = 0;
       
        while (counter < message.length()) {

            char out = (char) ((cArray[counter]) - (((3 * (counter + 1)) + 3) % ('Z' - 'A')));
            counter ++;
           
            if (out < 'A') {
                char wrap = (char) (('Z' + 1) - ('A' - out));
                System.out.print(wrap);
            } else {

                System.out.print(out);
            }
        }

    } 
}
