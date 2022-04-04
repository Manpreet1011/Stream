import java.util.*;

public class DishMain {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(Dish.builder().name("Butter Chicken")
                        .dishType(DishType.NON_VEG)
                        .cost(13.99)
                        .ingredients(Arrays.asList("Chicken", "Butter", "Spices")).build(),
                Dish.builder().name("Pizza")
                        .dishType(DishType.VEG)
                        .cost(11.99)
                        .ingredients(Arrays.asList("Cheese", "Butter", "Spices"))
                        .build(),
                Dish.builder().name("Mutton")
                        .dishType(DishType.NON_VEG)
                        .cost(16.99)
                        .ingredients(Arrays.asList("Mutton", "Butter", "Spices"))
                        .build());
//                List<Dish> name=Arrays.asList
//                        (Dish.builder()
//                                .name("MAnpreet")
//                                .dishType(DishType.NON_VEG)
//                                .cost(10.9)
//                                .ingredients(Arrays.asList("a","b"))
//                                .build());
//        System.out.println(name);


        dishes.stream().filter(d -> d.getDishType() == DishType.NON_VEG).forEach(System.out::println);
        Optional<Double> max=dishes.stream().map(d->d.getCost()).max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);
        List<Integer> nums=List.of(1,2,4,54,34,21);
        System.out.println(nums.stream().reduce(0,(a,b)->a+b));


    }
}
