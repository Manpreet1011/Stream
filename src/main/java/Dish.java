import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Builder
@Data
public class Dish{
    private String name;
    private DishType dishType;
    private double cost;
    private List<String> ingredients= new ArrayList<>();

}