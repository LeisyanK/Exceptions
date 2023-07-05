package seminar3;

import java.io.IOException;

public class DataProcessor {
    private FileReader fileReader;

    public DataProcessor(FileReader fileReader){
        this.fileReader = fileReader;
    }

    public void processFile(String filePath) throws IOException {
        try {
            fileReader.readFile(filePath);
            // обработка данных из файла
            // ...
        } catch (IOException e) {
            // переброс исключения выше
            throw e;
        }
    }
    
}
