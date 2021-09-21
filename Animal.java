public class Animal{
   
    //Attributes

    private String type;
    private int xPosition;
    private int yPosition;
    
    //Constructor

    Animal(String type, int xPosition, int yPosition){
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    //Setters and getters

    public String getType(){
        return this.type;
    }
    public int getXPosition(){
        return this.xPosition;
    }
    public int getYPosition(){
        return this.yPosition;
    }
    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }
    public void setYPosition(int yPosition){
        this.yPosition = yPosition;
    }
    public void setType(String type){
        this.type = type;
    }
    //Print position of object
    public void tellPosition(){
        if(this.type=="Rabbit"){
            System.out.println("I am the nice rabbit, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
        else{
            System.out.println("I am the evil snake, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
    }

    //Move methods
    public void moveLeftAndDown(){
        this.yPosition = this.yPosition-1;
        this.xPosition = this.xPosition-1;
    }
    public void moveRightAndUp(){
        this.yPosition = this.yPosition+1;
        this.xPosition = this.xPosition+1;
    }
}

    public void tellPosition(){
11
        if(this.name=="Rabbit"){
12
            System.out.println("I am the nice rabbit, i am now standing on square "+this.xPosition+", "+this.yPosition);
13
        }
14
        else{
15
            System.out.println("I am the evil snake, i am now standing on square "+this.xPosition+", "+this.yPosition);
16
        }
17
    }
18
    public void move(int xPosition, int yPosition){
19
            this.xPosition = xPosition;
20
            this.yPosition = yPosition;
21
    }
22
}
    }
    public int getXPosition(){
        return this.xPosition;
    }
    public int getYPosition(){
        return this.yPosition;
    }
    public void setXPosition(int xPosition){
        this.xPosition = xPosition;
    }
    public void setYPosition(int yPosition){
        this.yPosition = yPosition;
    }
    public void setType(String type){
        this.type = type;
    }
    //Print position of object
    public void tellPosition(){
        if(this.type=="Rabbit"){
            System.out.println("I am the nice rabbit, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
        else{
            System.out.println("I am the evil snake, i am now standing on square "+this.xPosition+", "+this.yPosition);
        }
    }

    //Move methods
    public void moveLeftAndDown(){
        this.yPosition = this.yPosition-1;
        this.xPosition = this.xPosition-1;
    }
    public void moveRightAndUp(){
        this.yPosition = this.yPosition+1;
        this.xPosition = this.xPosition+1;
    }
}
