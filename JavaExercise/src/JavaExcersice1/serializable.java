package JavaExcersice1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *
 * @author Nguyễn Xuân Thành
 */
public class serializable implements Serializable{
    private int id;

    public serializable(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializable seri = new serializable(1);
        
        File file = new File("Demo.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(seri);
        
        objectOutputStream.close();
        fileOutputStream.close();
        
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        
        serializable ser = (serializable)inputStream.readObject();
        
        System.out.println(ser.getId());
    }
}
