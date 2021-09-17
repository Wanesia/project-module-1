public class Zoo {
    public static void main(String[] args){
        Animal rabbit=new Animal("Rabbit",2,2);
        Animal snake=new Animal("Snake",9,9);
        rabbit.tellPosition();
        snake.tellPosition();
        rabbit.move(3,3);
        snake.move(8,8);
        rabbit.tellPosition();
        snake.tellPosition();
        rabbit.move(4,4);
        snake.move(7,7);
        rabbit.tellPosition();
        snake.tellPosition();
        rabbit.move(5,5);
        snake.move(6,6);
        rabbit.tellPosition();
        snake.tellPosition();
        if (Math.abs(snake.xPosition-rabbit.xPosition) == 1 && Math.abs(snake.yPosition-rabbit.yPosition)==1){
            System.out.println("Nooooo Please don't eat me");
        }
        snake.move(5,5);
        snake.tellPosition();

        if (snake.xPosition==rabbit.xPosition && snake.yPosition==rabbit.yPosition){
            System.out.println("Ahhrrrr Im eating you ha ha!");
        }
    }
}
