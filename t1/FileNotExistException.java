package t1;

import java.io.IOException;

public class FileNotExistException extends IOException{

    public FileNotExistException() {
        super("Попытка открыть несуществующий файл");
    }
    
}
