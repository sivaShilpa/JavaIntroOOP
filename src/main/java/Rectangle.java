public class Rectangle extends Shape {

    int length;
    int height;
   public Rectangle(int length, int height) {
       this.length = length;
       this.height = height;
    }

    @Override
    public String draw() {
        String rectangle = "";
        for(int row = 0; row < height; row++){
            if(row == 0 || row == height-1){
                for(int column = 0; column < length; column++){
                    rectangle += super.draw();
                }
            }
            else{
                for(int column = 0; column < length; column++){
                    if(column == 0 || column == length-1){
                        rectangle += super.draw();
                    }
                    else{
                        rectangle += " ";
                    }
                }
            }
            rectangle += "\n";
        }
        return rectangle;
    }
}
