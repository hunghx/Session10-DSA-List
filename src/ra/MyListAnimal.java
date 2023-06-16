package ra;

public class MyListAnimal extends MyList<Animal,String>{


    @Override
    public boolean save(Animal animal) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Animal findById(String s) {
        return null;
    }
    public static  <E extends Animal>boolean textGeneric(E dog,E cat){
        return dog.equals(cat);
    }
}
