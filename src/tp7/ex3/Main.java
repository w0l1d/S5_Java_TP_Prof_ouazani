package tp7.ex3;

import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        File f = new File("src/tp7/ex3/test.txt");
        long date;

        // File(Input/Output)Stream
        File fios = new File("src/tp7/ex3/testFIOS.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(fios);
        FileInputStream fileInputStream = new FileInputStream(f);

        date = System.currentTimeMillis();
        int i;
        while ((i = fileInputStream.read()) != -1)
            fileOutputStream.write(i);
        date = System.currentTimeMillis() - date;
        System.out.println("File(Input/Output)Stream : " + date);

        fileInputStream.close();
        fileOutputStream.close();



        // File(Reader/Writer)
        File filefrw = new File("src/tp7/ex3/testFRW.txt");

        FileReader fileReader = new FileReader(f);
        FileWriter fileWriter = new FileWriter(filefrw);

        date = System.currentTimeMillis();

        while ((i = fileReader.read()) != -1)
            fileWriter.write(i);

        date = System.currentTimeMillis() - date;
        System.out.println("File(Reader/Writer) : " + date);


        fileReader.close();
        fileWriter.close();



        // Buffered(Reader/Writer)
        File filebrw = new File("src/tp7/ex3/testBRW.txt");
        FileReader fr = new FileReader(f);


        BufferedReader bufferedReader = new BufferedReader(fr);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filebrw));


        date = System.currentTimeMillis();

        String line = " ";

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line + "\r\n");
        }

        date = System.currentTimeMillis() - date;
        System.out.println("Buffered(Reader/Writer) : " + date);

        fr.close();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
