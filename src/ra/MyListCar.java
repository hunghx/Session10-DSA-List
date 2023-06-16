package ra;

public class MyListCar extends MyList<Car,Integer>{
    @Override
    public boolean save(Car car) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    @Override
    public Car findById(Integer integer) {
        return null;
    }
}
