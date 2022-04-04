import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class DishMain {
    public static void main(String[] args) {
        List<Dish> dish = Arrays.asList(
                Dish.builder()
                        .name("Samosa")
                        .dishType(DishType.VEG)
                        .cost(6.99)
                        .ingredients(Arrays.asList("Potato", "Onion", "Spices"))
                        .build(),
                Dish.builder()
                        .name("Butter Chicken")
                        .dishType(DishType.NON_VEG)
                        .cost(14.99)
                        .ingredients(Arrays.asList("Fish", "Onion", "Spices"))
                        .build(),
                Dish.builder()
                        .name("Chicken Tikka")
                        .dishType(DishType.NON_VEG)
                        .cost(13.99)
                        .ingredients(Arrays.asList("Chicken", "Tomato", "Spices"))
                        .build()
        );

        System.out.println("List of all Dishes");
        System.out.println(dish);
        System.out.println("List of non veg dishes");
        dish.stream().filter(d -> d.getDishType() == DishType.NON_VEG).forEach(System.out::println);
        System.out.println("List of vegetarian dish");
        dish.stream().filter(d -> d.getDishType() == DishType.VEG).forEach(System.out::println);
        System.out.println("After price update");
        dish.stream().filter(d -> d.getDishType() == DishType.NON_VEG)
                .map(d -> {
                    d.setCost(d.getCost() + 2);
                    return d;
                }).forEach(System.out::println);
        System.out.println("Dish with maximum price");
        Optional<Double> max = dish.stream().map(d -> d.getCost()).max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);
        System.out.println("Minimum price dish");
        Optional<Double> min = dish.stream().map(d -> d.getCost()).min(Comparator.naturalOrder());
        System.out.println(min);
        Map<DishType, List<Dish>> collect = dish.stream().collect(Collectors.groupingBy(d -> d.getDishType()));
        System.out.println(collect);
        List<String> collect1 = dish.stream().flatMap(d -> d.getIngredients().stream()).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        //        dishes.stream().filter(d -> d.getDishType() == DishType.NON_VEG).forEach(System.out::println);
//        Optional<Double> max = dishes.stream().map(d -> d.getCost()).max(Comparator.naturalOrder());
//        max.ifPresent(System.out::println);
//        List<Integer> nums = List.of(1, 2, 4, 54, 34, 21);
//        System.out.println(nums.stream().reduce(0, (a, b) -> a + b));
            List<Integer> nums=List.of(1,3,2,11,23,21,43,98);
        System.out.println(nums.stream().reduce(0,Integer::sum));

    }
}
