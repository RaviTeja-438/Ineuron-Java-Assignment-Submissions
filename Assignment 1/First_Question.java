public class First_Question {
    public static void main(String[] args) {
        int n=5,x=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++) {
                if (j == (n - 1) / 2 || i == 0 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("\t");

            for (int j=0;j<n;j++) {
                if (j == i || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("\t");

            for (int j=0;j<n;j++) {
                if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\t");



            for (int j=0;j<n;j++) {
                if (j == 0 || j == n - 1 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\t");

            for (int j=0;j<n;j++) {
                if (j == 0 || (j != n - 1 && i == 0) || j == n - 1 && (i > 0 && i < (n - 1) / 2) || i == (n - 1) / 2 && j != n - 1 || i == j && i > n / 2) //r
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\t");

                for (int j=0;j<n;j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.print("\t");

            for (int j=0;j<n;j++) {
                if (j == i || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
            }

        }
    }

