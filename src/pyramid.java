import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        int i, j, number = 1;
        System.out.println("enter your alphabet or symbol");
        Scanner hc = new Scanner(System.in);
        String symbol = hc.nextLine();
        System.out.println("enter your number of rows ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter your shape");
        Scanner nc = new Scanner(System.in);
        String shape = nc.nextLine();
        if (symbol.equals("alphabet")) {
            if (shape.equals("invertedhalfpyramid")) {
                for (i = n; i >= 1; --i) {
                    for (j = 1; j <= i; ++j) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
            if (shape.equals("triangle")) {
            int x = 10,y= 10;
                for (i = 0; i < n; i++) {
                    
                    for (j = n - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (j = 0; j <= i; j++) {
                        
                        if(j==i){
                            System.out.print(y);
                            System.out.print(" ");
                        }
                        else if((j >=1) && (j < i))
                        {
                            x++;
                            System.out.print(x);
                            System.out.print(" ");

                        }
                        else {
                            x--;
                            System.out.print(x);
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    y++;
                }
            }
        }
        if (shape.equals("floyd")) {
            for (i = 1; i <= n; i++) {

                for (j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    ++number;
                }

                System.out.println();
            }

        }else{
            if(shape.equals("halfpyramids")) {
                for ( i = 1; i <= n; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                }
            }else if(shape.equals("invertedhalfpyramids")){
                for ( i = n; i >= 1; --i) {
                    for ( j = 1; j <= i; ++j) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                }
            }else if(shape.equals("triangles")){
                for ( i=0; i<n; i++)
                {
                    for (j=n-i; j>1; j--)
                    {
                        System.out.print(" ");
                    }
                    for ( j=0; j<=i; j++ )
                    {
                        System.out.print(symbol);
                    }
                    System.out.println();
                }
            }


        }


    }
}