import java.util.Random;
public class Animal {
    Random rand = new Random();
    String name;
    int yPosition;
    int xPosition;
    Animal(String name,int yPosition,int xPosition) {
        this.name = name;
        this.yPosition = yPosition;
        this.xPosition= xPosition;
    }
    public void goUp(){
        this.yPosition=yPosition+1;
    }
    public void goDown(){
        this.yPosition=yPosition-1;
    }
    public void goRight(){
        this.xPosition=xPosition+1;
    }
    public void goLeft(){
        this.xPosition=xPosition-1;
    }
    public void getPosition(){
        if(this.name=="Rabbit"){
            System.out.println("I am the nice rabbit, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
        else{
            System.out.println("I am the evil snake, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
    }
    public void checkIfAlive(int x, int y){
        if (this.xPosition==x && this.yPosition==y){
            System.out.println("Ahhrrrrr im eating you ha ha!");
        }
        else{
            //System.out.println("zyje");
        }
    }
}
