import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Day3BinaryDiagnostic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Day3.csv"));
        List<List<String>> splitWord = new ArrayList<>();
        List<String> arr;
        String line;
//        while ((line = reader.readLine()) != null) {
//            for (String token : line.split(",")) {
//                arr = Arrays.asList(token.split(""));
//                splitWord.add(arr);
//            }
//        }

        String[] arrNew;
        String[] arrayNew = new String[5];
        String[] arrnewnew = new String[30];
        String lineNew;
        int q = 0;
        while ((lineNew = reader.readLine()) != null) {
            for (String token : lineNew.split(",")) {
                for (int i = 0; i < 5 ; i++){
                    arrNew = token.split("");
                    arrayNew[i] = arrNew[i];
                    arrnewnew[q] = arrayNew[i];
                }
                q++;
            }
        }
        System.out.println(Arrays.toString(arrnewnew));
        System.out.println(Arrays.toString(arrayNew));


        List<Integer> rezult = new ArrayList<>();
        List<String> zeroCountList = new ArrayList<>();
        List<String> oneCountList = new ArrayList<>();
        for (List<String> x : splitWord) {
            if ((zeroCountList.size() + oneCountList.size()) == 5) {
                if (zeroCountList.size() > oneCountList.size()) {
                    rezult.add(0);
                } else if (zeroCountList.size() < oneCountList.size()) {
                    rezult.add(1);
                }
            }
                for (String y : x) {
                    if (y.equals("0")) {
                        zeroCountList.add(y);
                        splitWord.remove(0);
                        splitWord.get(0).remove(0);
                    } else if (y.equals("1")) {
                        oneCountList.add(y);
                    } else {
                        System.out.println("Somethink went wrong :(");
                    }
                    break;
                }
            }
            System.out.println(rezult);


            System.out.println(splitWord);
            System.out.println("---------------------");
            System.out.println("---------------------");
            System.out.println("---------------------");
            System.out.println("---------------------");

//        for(String token: data){
//            arr = Arrays.asList(token.split(""));
//            splitWord.add(arr);
//        }


        }
    }
