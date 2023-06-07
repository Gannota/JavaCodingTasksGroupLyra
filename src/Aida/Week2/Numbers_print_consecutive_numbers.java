package Aida.Week2;

public class Numbers_print_consecutive_numbers {
    public static void main(String[] args) {

        int[] a = {1, 2, 5, 7, 9,10, 24};

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            int first = 0;

            /*  System.out.println(i);*/
            first = a[i];

            if (a[i + 1] - a[i] == 1) {

                count++;

                int last = a[i] + count;
                i++;
                System.out.println(first + " " + last);

            } else {


                System.out.println(a[i]);

                /*
                  if(a.length>0) {
        int i=0,j=0;
        do{
            j=i+1;
            while(j<a.length){
                if(a[j]-a[i]!=j-i)
                    break;
                j++;
            }
            if(i==j-1)
                System.out.println(a[i]);
            else
                System.out.println(a[i] + "-" + a[j-1]);
            i=j;
        }while(i<a.length);
    }
                 */

            }
        }
    }}


