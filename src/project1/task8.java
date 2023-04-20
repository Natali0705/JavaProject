package project1;
/*
Maximumandminimumnumberinthearray?
 */
public class task8 {
    public static void main(String[] args) {
        int [] number={10,20,50,60,78,45,54};

        int max =number[0];

        for (int i = 0; i < number.length ; i++) {

            if(number[i]> max){
                max =number[i];
            }

        }
        System.out.println(max);

        int min=number[0];
        for (int j = 0; j < number.length ; j++) {
            if(number[j]<min){
                min=number[j];
            }

        }
        System.out.println(min);


    }
}
