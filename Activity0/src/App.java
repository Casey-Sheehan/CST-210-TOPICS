import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.w3c.dom.css.Counter;



public class App {
    public static void main(String[] args) throws NullPointerException, Exception {
        BufferedReader in = new BufferedReader(new FileReader(new File("sampletext.txt")));
        String[] array = new String[10000];
        String line = new String();
        int c = 0;
        do
        {
        if ((line = in.readLine()) != null)
        {
            array[c] = line;
            ++c;
            System.out.println(line);
        }

        for (int i=0;i<c;++i)
        {
          
              if (array[i].compareTo(array[i + 1]) > 0 && array[i + 1] != null) 
                {
                    System.out.println(array[i]);
                    String temp1 = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp1;
                }
            
        }
    }while (in.readLine() != null);

    for(int b=0;b<array.length;++b)
    {
        if (array[b] != null)
        {
        System.out.println(array[b]);
        }
    }
            



        in.close();

        

    }
}
