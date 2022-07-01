import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uzduotis1 {
    public static void main(String[] args) {
        ArrayList<Double>masyvas=nuskaitytiSarasa();
        System.out.println("masyvas = " + masyvas);


    }
    public static ArrayList<Double>nuskaitytiSarasa(){
        Scanner skaitytuvas = new Scanner(System.in);

        ArrayList<Double> skaiciai = new ArrayList<>();
        System.out.println("Iveskite " + skaiciai);
        int n=skaitytuvas.nextInt() ;
        for (int i = 0; i < n; i++) {
          skaiciai.add(skaitytuvas.nextDouble());
        }
        return skaiciai;
    }




    }











