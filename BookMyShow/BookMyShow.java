import java.util.Scanner;
public class BookMyShow
{
    public static void main()throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        char pent = (char)9750;
        char pent2 = (char)9751;
        int y = 0;
        String seats[][]= {{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"},{"nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb","nb"}};
        for(int z = 0; z>=0;z++)
        {
            System.out.println(pent+" means the seat is not booked");
            System.out.println(pent2+" means the seat is booked");
            System.out.println("\n\n");
            int k = 0;
            System.out.println("\t\t\t\t   1   2   3  4   5   6             7   8   9  10  11 12");
            for(int i = 0; i <12; i++)
            {
                System.out.print("\t\t\t\t");
                System.out.print((char)(k+97)+"  ");
                for(int j = 0; j<12; j++)
                {
                    if(j == 6)
                    {
                        System.out.print("        ");
                        System.out.print((char)(k+97)+"  ");
                    }
                    if(seats[i][j].equals("nb"))
                        System.out.print(pent+"  ");
                    else
                        System.out.print(pent2+"  ");
                }
                k = k +1;
                System.out.println();
            }
            System.out.println("\n\n");
            System.out.println("\t\t\tEnter the desired number of seats ");
            int no = sc.nextInt();
            System.out.println("\t\t\tEnter the desired seat numbers \n\t\t\tPlease mention the row first and then column  e.g.  h7 or a3");
            String na[] = new String[no];
            for(int i  = 0; i< no; i++)
            {
                na[i] = sc.next();
                String part = na[i].substring(1);
                char part2 = na[i].charAt(0);
                int two = Integer.parseInt(part);
                int temp = (int)part2;
                int one = temp - 97;
                if(seats[one][two--].equals("ba"))
                {
                    System.out.println("\t\t\tPlease choose another seat\n\t\t\tSeat already booked");
                    i--;
                }
                else
                    seats[one][two--] = "ba";
            }
            System.out.print("\f");
            System.out.println(pent+" means the seat is not booked");
            System.out.println(pent2+" means the seat is booked");
            System.out.println("\n\n");
            int f = 0;
            System.out.println("\t\t\t\t   1   2   3  4   5   6             7   8   9  10  11 12");
            for(int i = 0; i <12; i++)
            {
                System.out.print("\t\t\t\t");
                System.out.print((char)(f+97)+"  ");
                for(int j = 0; j<12; j++)
                {
                    if(j == 6)
                    {
                        System.out.print("        ");
                        System.out.print((char)(f+97)+"  ");
                    }
                    if(seats[i][j].equals("nb"))
                        System.out.print(pent+"  ");
                    else
                        System.out.print(pent2+"  ");
                }
                f = f +1;
                System.out.println();
            }
            System.out.println("\t\t\tEnter 0 if you want to continue booking");
            System.out.println("\t\t\tEnter 1 if you want to stop");
            y= sc.nextInt();
            if(y>0)     
                break;
                else
                System.out.println("\f");
        }
        System.out.println("\f");
    }
}
