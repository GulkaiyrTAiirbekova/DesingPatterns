package Command;
import java.util.Arrays;

public class Main {
    public static void main (String [] args) {
        RestaurantCommandExecutor executor = new RestaurantCommandExecutor();
        Phone phone = new Phone();

        //create Commands

        OrderFoodCommand orderCommand = new OrderFoodCommand(Arrays.asList("fish", "salad"));
        PayCommand payCommand = new PayCommand(phone);

        //realize Commands

        System.out.println(executor.executeOperation(orderCommand)); //fish , salad
        System.out.println(executor.executeOperation(payCommand)); //payment Successful

    }
}
