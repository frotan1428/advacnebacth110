package com.genecric.serilization;

import java.io.*;

public class Serialization_DeSerialization  {

    public static void main(String[] args) {

      // writeObjects();
         readObjects();

    }
    // writeObject()
    // Serialization
    private static void writeObjects(){
        System.out.println("User Objeleri oluşturuluyor");
        User user1 = new User(1L,"Yunus","4587985644");
        User user2 = new User(2L,"Yusuf","4514585644");
        User user3 = new User(3L,"Betül","5247985644");

        try(FileOutputStream fos = new FileOutputStream("user.dat")){ // bu dosya yazmak için
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){ // bu Objeleri yazmak için
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user3);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //readObject
    // Deserialization
    private static void readObjects(){
        // Java da File işlemlerinde okuma işlemi yaparken FileInputStream classı kullanırlır
        try(FileInputStream fis = new FileInputStream("user.dat")) { // okunacak dosyayı belirledik
            try(ObjectInputStream ois= new ObjectInputStream(fis)){ // Obje olarak okunacak
                User user1 = (User) ois.readObject();
                User user2 = (User) ois.readObject();
                User user3 = (User) ois.readObject();

                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
