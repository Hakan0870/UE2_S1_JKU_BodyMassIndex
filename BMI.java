class BMI {
    public static void main(String[] args){
        Out.print("Your weight in kg?: ");
        double weight = In.readDouble();

        Out.print("Your height in meter?: ");
        double  height = In.readDouble();

        double result = weight / (height * height);
        Out.print("BMI: " +result);

    }
}
