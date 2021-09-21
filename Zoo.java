import java.util.concurrent.TimeUnit;
public class Zoo{
    public static void main(String[] args){

        //Creating rabbit and snake objects
        Animal rabbit = new Animal("Rabbit",2,2);
        Animal snake = new Animal("Snake",9,9);

        //condition to keep game runnning 
        boolean gameRunning = true;
        
        System.out.println("Animal horror zoo \n");

        snake.tellPosition();
        rabbit.tellPosition();
        do{
            snake.moveLeftAndDown();
            snake.tellPosition();

            if (!(rabbit.getYPosition()==snake.getYPosition() && snake.getXPosition()==snake.getXPosition())){
                rabbit.moveRightAndUp();
                rabbit.tellPosition();
                if (Math.abs(snake.getXPosition()-rabbit.getXPosition())==1 && Math.abs(snake.getYPosition()-rabbit.getYPosition())==1){
                    System.out.println("Nooooo Please don't eat me");
                }
            }
            else if (Math.abs(snake.getXPosition()-rabbit.getXPosition())==1){
                System.out.println("Nooooo Please don't eat me");
            }
            else{
                System.out.println("Ahhhrrrr Im eating you ha ha!");
                gameRunning=false;
            }
            try {

                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
            }

        }while(gameRunning);
        System.out.println("\nRIP\nGame over rabbit ded");

    }
}
