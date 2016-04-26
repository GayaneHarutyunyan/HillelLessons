package Lesson19.IO;


import Lesson20.Car;
import Lesson20.Tenant;
import Lesson8.hierarchy.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

public class IoMain {

    public static void main(String[] args) {
        //absoluteAndRelativePaths();
        //uglyPriorJava7Style();
        //tryWithResources();
        //copy();
        //readWithCodePage();
        //bufferRead();
        //dataOutputStream();
        //primitivesExample();
        //objectExample();
        //propertiesExample();
        //writeObjectExample();
/*        Person ivan = new Person("Ivan");
        Car myCar = new Car("BMW", 1985, ivan);
        ivan.setCar(myCar);
        myCar.setTenant(new Tenant("Nikolay"));
        save(myCar);
*/

            Car deserializedCar = load();

            System.out.println(deserializedCar);
            // System.out.println(deserializedCar == myCar);
        }

    public static void save(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/car.dat"))) {
            //хочу записать сайкар

            outputStream.writeObject(car);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car load() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/car.dat"))) {
            return (Car) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeObjectExample() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/car.dat"))) {
            Car myCar = new Car("BMW", 1985, new Person("Ivan"));
            myCar.setTenant(new Tenant("Nikolay"));
            //хочу записать сайкар
            outputStream.writeObject(myCar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/car.dat"))) {
            Car myCar = (Car) inputStream.readObject();
            System.out.println(myCar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void propertiesExample() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream("myFolder/setting.property")) {
            properties.load(inputStream);
            String db = properties.getProperty("DB");
            String password = properties.getProperty("password");

            int timeout = Integer.parseInt((properties.getProperty("Timeout")));

            System.out.println(db + " " + password + " " + timeout);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void objectExample() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("myFolder/object.dat"))) {
            int[] date = new int[]{15, 4, 2016};
            outputStream.writeObject(date);
            outputStream.writeObject("hello");
            outputStream.writeObject(2);
            System.out.println(Arrays.toString(date));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("myFolder/primitives.dat"))) {
            int[] date = (int[]) inputStream.readObject();
            String dat = (String) inputStream.readObject();

            System.out.println(dat);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject() {
        return new Object();
    }

    private static void primitivesExample() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myFolder/primitives.dat"))) {
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("myFolder/primitives.dat"))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            //    System.out.println(dataInputStream.readLong());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251"))) {
            String value = null;

            while ((value = reader.readLine()) != null) {
                System.out.println(value);
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
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("myFolder/myFile.txt"), "windows-1251")) {
            int value = 0;
            while ((value = reader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
        try (InputStream inputStream = new FileInputStream("myFolder/myFile.txt");
             OutputStream outputStream = new FileOutputStream("myFolder/myFile_copy.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
