import java.util.Random;
import java.util.Scanner;

public class SecondMethodClass {

    // Plublic Variable

    public int[] lotto;
    public int check;
    public int count;
    public boolean look;
    public String answer;


// Parament setting

    public SecondMethodClass(int[] lotto, int check, int count, boolean look, String answer) {
        this.lotto = lotto;
        this.check = check;
        this.count = count;
        this.look = look;
        this.answer = answer;
    }



    public int[] FirstLoop() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Lotto Number Generator");
            System.out.println("");


            for(int i = 0; i < lotto.length; i++)
            {
                count=0;
                check = random.nextInt(50)+1;
                //System.out.println(check);
                lotto[i]= check;
                look = true;
                int c2=0;

                while (look){
                    for(int r=0; r<i; r++){
                        c2++;
                        if(lotto[i]!=lotto[r]){
                            count++;

                        }
                        else if(c2==i)
                        {
                            check = random.nextInt(50)+1;
                            //System.out.println(check);
                            i--;
                            lotto[i]= check;

                        }
                    }
                    if (count==i) {

                        look = false;
                        System.out.println(check);
                    }else if(c2 == i){
                        i--;
                        look=false;
                    }
                }





            }

            System.out.println("Do you want to regenerate another number ");
            answer= scanner.next();
        }while(answer.equals("ja"));

        return lotto;
    }



    public int[] getArray() {
        return this.lotto;
    }


    public int[] Sencond_loop() {

        int temp;
        for (int i=0; i<lotto.length-1;i++){
            for (int r=0; r<lotto.length-2; r++){

                if (lotto[r]>lotto[r+1]) {
                    temp = lotto[r+1];
                    lotto[r+1]= lotto[r];
                    lotto[r] = temp;
                }
            }
        }
        return lotto;
    }




    public int[] Enden(){

        for(int i=0; i< lotto.length; i++){
            if(i != lotto.length-1)
            {
                System.out.println("There is your Number: "+(i+1)+":\t"+ lotto[i]);
            }
            else {
                System.out.println("Supernumber: "+(i+1)+ ":\t \t \t"+lotto[i]);
            }
        }

        return lotto;
    }





}
