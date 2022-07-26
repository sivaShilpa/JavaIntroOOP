public class Square extends Shape {

    int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    public String draw() {
        String square = "";
        for(int row = 0; row < side; row++){
            if(row == 0 || row == side-1){
                for(int column = 0; column < side; column++){
                    square += super.draw();
                }
            }
            else{
                for(int column = 0; column < side; column++){
                    if(column == 0 || column == side-1){
                        square += super.draw();
                    }
                    else{
                        square += " ";
                    }
                }
            }
            square += "\n";
        }
        return square;
    }
}
