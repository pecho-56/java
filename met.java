public class met
{
    public static void main(String[] args)
     {
        String[] fruits={"apple","orange","Mango"};
        int i;
        for(i=0;i<3;i++)
        {
            System.out.println("Enter the fruits:"+fruits[i]);
        }
       fruits[0]="pineapple";
       for(i=0;i<3;i++)
        {
            System.out.println("Enter the fruits:"+fruits[i]);
        }
    }
}