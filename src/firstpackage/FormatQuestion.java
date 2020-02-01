package firstpackage;

public class FormatQuestion {
    public static void main(String[] args){
        String java = "Java is fun";
        float myFormat = 78.98f;
        double myDouble = 78.98;
        System.out.format( "Do you think %s\n", java);
        System.out.format( "Yes %%%f of the people think it is fun\n", myFormat);
        System.out.format( "Yes %%%.2f of the people think it is fun", myDouble);


    }
}
