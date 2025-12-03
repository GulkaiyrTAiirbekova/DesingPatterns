package Command;
import java.util.List;

public class OrderFoodCommand  implements RestaurantCommand{
    private List<String> dishes;

    public OrderFoodCommand(List<String> dishes){
        this.dishes = dishes;
    }

    private String order(){
        //combining dishes via comma
        return String.join(", ", dishes);
    }

    @Override
    public String execute(){
        return order();

    }
}
