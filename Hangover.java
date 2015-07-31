import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 北大OJ1003题
 * @author kaling
 *
 */
public class Hangover
{
    public static void main(String[] args)
    {
        List<Float> arrayList = new ArrayList<Float>();
        float temp;
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        while (((temp = in.nextFloat()) != 0.00))
        {
            arrayList.add(temp);
        }

        for (int i = 0; i < arrayList.size(); i++ )
        {
            temp = arrayList.get(i);
            float hangLength = (float) 0.00;
            for (float j = 2; j < 1000; j++)
            {
                hangLength += 1/j;
                if (hangLength >= temp)
                {
                    System.out.printf("%d card(s)\n", (int)j - 1);
                    break;
                }
            }
        }
    }

}
