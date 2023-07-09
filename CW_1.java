import java.io.FileWriter;

public class CW_1 {
    public static void main(String[] args) {
        //Записать в файл слово TEST 10 раз
        int n = 10;
        String text = "TEST";
        try {
            FileWriter writer = new FileWriter("file.txt", true);
            for (int i = 0; i < n; i++) {
                writer.write(text);
        //         writer.write("\n");
            }
            System.out.println("Получилось!");
            writer.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
        // File fl = new File("file.txt");
        // try{
        //     FileReader file = new FileReader(fl);
        //     char[] arr = new char[(int) fl.length()];
        //     file.read(arr);
        //     for(char c: arr){
        //         System.out.print(c);
        //     }
        //     file.close();
        // }
        // catch (Exception e)
        // {
        //     System.out.println("Что то пошло не так");
        // }
    }
}