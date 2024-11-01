import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
// import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemIn{

    public static void main(String[] args) throws IOException {
        
        // // System.out.println("check");
        // int num = 0; 
        // System.out.println("Enter num");
        // num = System.in.read();
        // System.out.println(num - 48); // minus 48 will get the actual number
        // System.out.println(num);

        // // how to get ASCII value  
        // System.out.println("ASCII value of " + (char)num + " is: " + num);

        // try{
        // // InputStreamReader in = new InputStreamReader(null, "UTF-8");
        // File file = new File("readme.txt"); 
        // InputStreamReader in = new InputStreamReader(new FileInputStream(file), "UTF-8"); 

        // // InputStreamReader in = new InputStreamReader(System.in, "UTF-8"); 
        // BufferedReader reader = new BufferedReader(in);

        // // System.out.println("Enter text");
        // String text = reader.readLine();
        // System.out.println("You entered: " + text);

        // reader.close();
        // }
        // catch(NullPointerException n){
        //     System.out.println(n +" " + n.getMessage());
        // }   
        // finally{
            
        //     System.out.println("Operation of Input Stream was attempted");
        // }


        try {
            // Ensure the file exists
            File file = new File("readme.txt");
            if (!file.exists()) {
                throw new IOException("File not found: " + file.getAbsolutePath());
            }

            // Create InputStreamReader and BufferedReader to read the file
            InputStreamReader in = new InputStreamReader(new FileInputStream(file), "UTF-8");
            BufferedReader reader = new BufferedReader(in);

            // Read and print the first line from the file
            String text = reader.readLine();
            System.out.println("You entered: " + text);

            // Close the reader
            reader.close();
        } catch (NullPointerException n) {
            System.out.println("NullPointerException: " + n.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } finally {
            System.out.println("Operation of Input Stream was attempted");
        }
    }
}


