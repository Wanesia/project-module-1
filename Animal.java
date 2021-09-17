public class Animal{
    String name;
    int xPosition;
    int yPosition;
    Animal(String name, int xPosition, int yPosition){
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    public void tellPosition(){
        if(this.name=="Rabbit"){
            System.out.println("I am the nice rabbit, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
        else{
            System.out.println("I am the evil snake, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
    }
    public void move(int xPosition, int yPosition){
            this.xPosition = xPosition;
            this.yPosition = yPosition;
    }
}