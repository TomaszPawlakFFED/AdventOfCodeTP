import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day2Dive {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Day2.csv"));
        List<String> data = new ArrayList<>();
        List<String> data2 = new ArrayList<>();
        List<String> data3 = new ArrayList<>();
        List<String> data4 = new ArrayList<>();
        List<Integer> data5 = new ArrayList<Integer>();
        String line;
        while ((line = reader.readLine()) != null) {
            for (String token : line.split(",")) {
                data.add(token);
            }
        }
      //  System.out.println(data);
        System.out.println(data.get(0));


        for(String i : data){
            i.split(" ");
        }

        for(String s : data) {
            String[] s2 = s.split(" ");
            for(String results : s2) {
                System.out.println(results);
                data2.add(results);
            }
        }

        int arrayLenght = data2.size();
        for(int i = 0; i < arrayLenght; i = i + 2){
            String element = data2.get(i);
            data3.add(element);
        };

        for(int i = 1; i < arrayLenght; i = i + 2){
            String element = data2.get(i);
            data4.add(element);
        };

        for(String str : data4){
            int number = Integer.parseInt(str);
            data5.add(number);
        }

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(data3);
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(data4);
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(data5.get(0) + data5.get(1));

        int forwardCount = 0;
        int downCount = 0;
        int upCount = 0;
        int aim = 0;
        int depth = 0;
        for (String x : data3){
            for (int y : data5){
                if(x.equals("forward")){
                    System.out.println("forward");
                    forwardCount = (forwardCount + y);
                    depth = depth + (aim * y);
                    data5.remove(0);
                } else if (x.equals("down")){
                    System.out.println("down");
                  //  downCount = downCount + y;
                    aim = aim + y;
                    data5.remove(0);
            } else {
                    System.out.println("up");
                    int yy = - + y;
                 //   upCount = (upCount + yy);
                    aim = aim + yy;
                    data5.remove(0);
                }
                break;
        }
    } System.out.println("Wynik: " + (forwardCount * depth));
        System.out.println("aim: " + aim);
        System.out.println("forward: " + forwardCount + " downCount " + downCount + " upCount: " + upCount);
        System.out.println(data3.size() + ": data 3 " + data5.size() + ": data5");
}}
