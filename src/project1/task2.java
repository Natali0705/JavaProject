package project1;
/*
Createanarrayofintegervalues.Afterthearrayiscreated,calculatethesumofallstoredelementsinthatarray.
 */
public class task2 {
    public static void main(String[] args) {
        int [] elem={10,20,50,60,78,45,54};
        int sum=0;

        for (int i = 0; i < elem.length ; i++) {
            sum=sum+elem[i];

        }
        System.out.println(sum);

    }
}
