import ra.*;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // array
        int[] arr = {1,2,3,4,5};
        System.out.println("SSố lượng phân tử mảng la :" +arr.length);
        // collection : danh sách , cấu trúc dữ liệu
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        boolean check =  list.remove(5);
        System.out.println(check?"Xóa thành công":"xóa thất bại");
        System.out.println(list);
        System.out.println(list.contains(5));
//        list.clear();
//        System.out.println(list);
        System.out.println(list.size());
        Object[] arrInt = list.toArray();
        System.out.println(Arrays.toString(arrInt)); // in ra array
        // duyệt cấu trúc dữ liệu
       Iterator<Integer> listIntegerIterator = list.iterator();
//       int index = 0;
        while(listIntegerIterator.hasNext()){
//            if(index == 1){
            System.out.println(listIntegerIterator.next());
//            }
//            index++;
        }


        // List
        List<String> listString = new ArrayList<>();
        listString.add("Hung");
        listString.add("Nam");
        listString.add("Hưng");
        listString.add("Minh");
        listString.add("Đạt");
        System.out.println(listString.get(1));
        listString.set(2,"Trang");
        System.out.println(listString);
        listString.add(1,"Khánh");
        System.out.println(listString);
        // addAll
        List<String> subString = new ArrayList<>();
        subString.add("Đức");
        subString.add("Minh");
        listString.addAll(1,subString);
        System.out.println(listString);
        System.out.println(listString.indexOf("Minh"));
        System.out.println(listString.lastIndexOf("Minh"));
        ListIterator<String> listIterator = listString.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        listString.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(listString);

        // ép kiểu
//        List<Integer> listnIntegers = (List<Integer>) list;
////        listnIntegers.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o2-o1;
////            }
////        });
////        System.out.println(listnIntegers);
        // xóa
        listString.remove(4);
        System.out.println(listString);
        // cắt danh sách
        List<String> sub = listString.subList(2,6);
        System.out.println(sub);
        System.out.println(listString);

        // LinkedList
        LinkedList<Double> listFLoat = new LinkedList<>();
        listFLoat.addFirst(7.5);
        listFLoat.addFirst(7.0);
        listFLoat.addLast(9.0);
        listFLoat.addLast(10.0);
        listFLoat.addLast(6.0);
        listFLoat.add(5.0);
//        {7.0,7.5,9.0,10.0,6.0}
        System.out.println(listFLoat);
        listFLoat.remove(2);
        System.out.println(listFLoat);
//        Iterator<Double> liIterator = listFLoat.iterator();
//        while (liIterator.hasNext()){
//
//        }
        System.out.println(listFLoat.isEmpty());
        while (!listFLoat.isEmpty()){
            System.out.println(listFLoat);
            // pop() dùng để xóa phần tử đầu tiên và trả về phần tửu đã xóa
//            Double element = listFLoat.pop();
            Double element = listFLoat.peek();
            listFLoat.removeFirst();
            System.out.println(element);
        }

        /// ArrayList
        ArrayList<Car> listCars = new ArrayList<>();
        listCars.add(new Car(1,"Red"));
        listCars.add(new Car(2,"Yellow"));
        listCars.add(new Car(3,"Pink"));
        listCars.add(new Car(4,"Black"));
        listCars.add(new Car(5,"Brown"));
        System.out.println(listCars.get(2));
        Car car =listCars.get(1);
        // xóa đối tượng
        listCars.remove(car);
        // xoá vị trí
        listCars.remove(2);
        System.out.println(listCars);
        System.out.println(listCars.contains(car));



        // Set
        Set<String> listSet = new HashSet<>();
        listSet.add("Hùng");
        listSet.add("Nam");
        listSet.add("Hùng");
        listSet.add("Đức");
        listSet.add("Khánh");
        listSet.add("Đức");
        listSet.add("Việt");
        System.out.println(listSet);
        for (String e: listSet){
            System.out.println(e);
        }

        // tạo đối tượng
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.id="001";
        dog.gen= true;
        Animal animal = dog;

        System.out.println(MyListAnimal.textGeneric(dog,animal));
    }
}