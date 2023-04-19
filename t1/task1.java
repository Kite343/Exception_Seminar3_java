package t1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task1 {
    public static void main(String[] args) {
        
    }

    
    public void rwline(Path pathRead, Path patchWrite) throws IOException{

        // BufferedReader in = null; // переносим в try
        // BufferedWriter out = null; // переносим в try
        try (BufferedReader in = Files.newBufferedReader(pathRead);
        BufferedWriter out = Files.newBufferedWriter(patchWrite);) {
            // in = Files.newBufferedReader(pathRead); // переносим в try
            // out = Files.newBufferedWriter(patchWrite); // переносим в try
            out.write(in.readLine());
        } // finally{                                // не нужен после переноса в try
        //     try {
        //         if (in != null) {in.close();}
        //     } catch (Exception e) {
                
        //     }
        //     try {
        //         if(out != null) {out.close();}
        //     } catch (Exception e) {
                
        //     }

        // }
        
    }
}
