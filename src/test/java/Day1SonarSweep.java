import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Day1SonarSweep {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Day1.csv"));
        List<Integer> data = new ArrayList<>();
        List<Integer> dataInt = new ArrayList<Integer>();
        String line;
        while ((line = reader.readLine()) != null) {
            for (String token : line.split(",")) {
                data.add(Integer.parseInt(token));
            }
        }
        reader.close();

        for(int str : data){
            int number = Integer.parseInt(String.valueOf(str));
            dataInt.add(number);
        }

        System.out.println(data);

        int counter = 0;
        int position = 1;
        for (int i : dataInt){
            int realPosition = (position - 1);
            int previousNumber = dataInt.get(realPosition);
            int firstArrayElement = dataInt.get(0);
            if(i == firstArrayElement){
          //      System.out.println(i + "Pierwszy element listy");
                position--;
            } else if (previousNumber < i){
          //      System.out.println("----");
          //      System.out.println(i + " wieksze od " + previousNumber);
                counter++;
          //      System.out.println("----");
            } else {
          //      System.out.println(i + "mniejsze od " + previousNumber);
            }
            position++;
        }
        System.out.println(counter);

        int sumPrevoius = 0;
        int x = 0;
        int newCounter = 0;
        for (int i : dataInt){
            int firstArrayElement = dataInt.get(0);
            int minusI = 0;
            int minusII = 0;
            int minus = 0;

            try{
                minusI = dataInt.get((x + 1));
            } catch (Exception e){
                System.out.println(e);
            }

            try{
                minusII = dataInt.get((x + 2));
            } catch (Exception e){
                System.out.println(e);
            }

            try{
                minus = dataInt.get(x);
            } catch (Exception e){
                System.out.println(e);
            }

            int sumMinus = (minus + minusI + minusII);

            if(i == firstArrayElement){
                sumPrevoius = dataInt.get(0);
                position--;
            } else if (sumPrevoius < sumMinus){
                System.out.println(sumPrevoius + " mniejsza od " + sumMinus);
                sumPrevoius = sumMinus;
                newCounter++;
            } else if (sumPrevoius > sumMinus){
                System.out.println(sumPrevoius + " wieksze od " + sumMinus);
                sumPrevoius = sumMinus;
            } else {
                System.out.println(sumPrevoius + " wartość jest równa " + sumMinus);
                sumPrevoius = sumMinus;
            }
            position++;
            x++;
        }
        System.out.println(newCounter);
    }
}
