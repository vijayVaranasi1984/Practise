import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueString {

    public static void main(String[] args) {

        String para = "i am avnish";
//UNIQUE
        System.out.println(Stream.of(para)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
            .collect(Collectors.toList()));



        char[] charArray = para.toCharArray();

       for(int i=0;i< charArray.length;i++){
           for(int j=i+1;j< charArray.length;j++){
               if(charArray[i] == charArray[j]){
                   System.out.println(charArray[i]);
               }
           }
       }

    }
}
