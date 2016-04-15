package Lesson19.IO;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoMain {

    public static void main(String[] args) {
    absoluteAndRelativePaths();
      //  uglyPriorJava7Style();
     ///   tryWithResources();
         //copy();
     //   readWithCodePage();
    //    bufferRead();
        //dataOutputStream();
    }

    private static void dataOutputStream() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("temp/primitives.dat"))) {
            dataOutputStream.writeInt(12);
            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("emp/primitives.dat"))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void bufferRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("temp/myFile.txt")))) {
            String value = null;

            while ((value = reader.readLine()) != null) {
                System.out.print(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithCodePage() {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("temp/myFile.txt"), "windows-1251")) {

            int value = 0;
            while ((value = reader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
    }

    private static void tryWithResources() {
        try (InputStream inputStream = new FileInputStream("temp/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
            //Закрывает
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uglyPriorJava7Style() {
        //прочитаем текст иза файа
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("temp/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }


            //Закрывает
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void absoluteAndRelativePaths() {
        System.out.println("yes\no");
        System.out.println("yes\\no");
        System.out.println("yes\\no");
//так только диск С
        //старрый до 7 джавы
        File file = new File("c:/temp/myFile.txt");

        System.out.println(file.exists());
        file.mkdirs();
        System.out.println(file.exists());

        File relativeFile = new File("/.myFile.txt");
        File relative = new File("myFile.txt");
        System.out.println(relativeFile.getAbsolutePath());
        System.out.println(relative.getAbsolutePath());

        //После джавы
        Path relativePath = Paths.get("temp/myFile.txt");
        Path parent = relativePath.getParent();
        Path resolve = parent.resolve(relativePath);
        System.out.println(parent);
        System.out.println(resolve);

        System.out.println(relativePath.toAbsolutePath());


        Path absolutePath = relativePath.toAbsolutePath();
        System.out.println("absolute" + absolutePath + " is absolute " + absolutePath.isAbsolute());
        System.out.println("relative" + relative + " is relative " + relative.isAbsolute());

        try {
            //Создаем директорию
            Files.createDirectories(relativePath.getParent());
//создаем файл
            Files.createFile(relativePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void someMethodCaller() {
        someMethod(1, 2, 3, 5, 8, 10, 852, 52);
        //someMethod();
    }

    public static void someMethod(Integer... integers) {
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
        System.out.println(integers[3]);
    }
}
