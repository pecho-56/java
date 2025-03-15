class vehicle1
{
    String model = "a567";
    int modelId = 123;
}

public class Car extends vehicle1 
{
    String brand = "BMW";

    public static void main(String[] args) 
    {
        Car car1 = New Car();
        Car car2 = New Car();
        Car car3 = New Car();

        System.out.println(car1.model);  
        System.out.println(car2.modelId); 
        System.out.println(car3.brand);   
    }
}