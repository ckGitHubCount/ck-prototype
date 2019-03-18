package simplePro;

import java.io.Serializable;

public class Animal implements Serializable {

    String dog;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }
}
