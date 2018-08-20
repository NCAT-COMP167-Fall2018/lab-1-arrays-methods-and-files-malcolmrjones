package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mrjones4
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[80];
        int[] scores = new int[80];
        
        readPlayerNames(names, scores, args[0]);
        
        System.out.println(calculateAverage(scores));
        
    }
    
    public static void readPlayerNames(String[] names, int[] scores, String filename) {
        
        try {
            Scanner reader = new Scanner(new File(filename));
            
            int currentIndex = 0;
            while(reader.hasNext()) {
                String[] line = reader.nextLine().split(" ");
                
                names[currentIndex] = line[0];
                scores[currentIndex] = Integer.parseInt(line[1]);
                
                currentIndex += 1;
            }
            
            
        }
        catch(FileNotFoundException ex) {
            System.err.println("Unable to read file in readPlayerNames() : " + filename);
        }
        
        
        
    }
    
    public static void displayPlayerStats(String[] names, int[] scores) {
        for(int i = 0; i < names.length; i++) {
            System.out.println(String.format("%s %d", names[i], scores[i]));
        }
    }
    
    public static double calculateAverage(int[] scores) {
        double sum = 0;
        
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        return sum / scores.length;
    }
    
    //Sort the two parallel arrays with selection sort.
    public static void sortArrays(String[] names, int[] scores) {
        
    }
    
    public static void displayTopXPlayers(String[] names, int[] scores, int topX) {
        
    }
    
}
