package deepClone;

import simplePro.Animal;

import java.io.*;
import java.util.Date;

public class DeepUser implements Serializable {

    String name;

    String address;

    Animal animal;

    public DeepUser clone() throws CloneNotSupportedException {
        // 内存中完成操作，对象读写，是通过字节码直接操作
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            // 完整的新对象
            DeepUser copy = (DeepUser)ois.readObject();
            return copy;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (DeepUser)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
