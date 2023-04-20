package project1;
/*Createaprogramthatusesanarraytostorealistoftemperaturesforaweek,andthenusesalooptofindthehighestandlowesttemperaturefortheweek.
 */
public class task1 {
    public static void main(String[] args) {
        int [] temp={10,20,50,60,78,45,54};

        int largest=temp[0];

        for (int i = 0; i < temp.length ; i++) {

            if(temp[i]>largest){
                largest=temp[i];
            }

            }
        System.out.println(largest);

        int lowest=temp[0];
        for (int j = 0; j < temp.length ; j++) {
            if(temp[j]<lowest){
                lowest=temp[j];
            }

        }
        System.out.println(lowest);


    }


    }

