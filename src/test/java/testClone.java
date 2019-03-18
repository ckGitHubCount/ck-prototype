import deepClone.DeepUser;
import simplePro.Animal;
import simplePro.User;

public class testClone {

    public static void main(String[] args) {
        User user=new User();
        user.setName("tom");
        user.setAddress("湖南");
        Animal animal=new Animal();
        animal.setDog("dogbig");
        user.setAnimal(animal);
        try {
            User user1=user.clone();
            System.out.println(user.getClass()==user1.getClass());
            user1.setName("dsad");
            user1.getAnimal().setDog("smallDog");
            System.out.println(user.getAnimal().getDog());

            DeepUser deepUser=new DeepUser();
            deepUser.setName("sdf");
            deepUser.setAddress("第三方的");
            deepUser.setAnimal(animal);

            DeepUser clone = deepUser.clone();

            clone.getAnimal().setDog("sssssss");

            System.out.println(deepUser.getAnimal().getDog());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
