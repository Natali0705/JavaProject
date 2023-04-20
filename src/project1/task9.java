package project1;
/*
Writeajavaprogramtofindthesecondlargestnumberinthearray?
 */
public class task9 {
    public static void main(String[] args) {
        int [] number={10,20,50,60,78,45,54};

        int max =number[0];
        int maxSecond=number[0];

        for (int i = 0; i < number.length ; i++) {

            if(number[i]>max){
                maxSecond=max;
                max=number[i];
            }
            if(number[i]<max && number[i]>maxSecond);

        }
        System.out.println(maxSecond);
        }

    }
    // have a mistake

