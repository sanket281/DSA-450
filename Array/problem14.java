//Merge Intervals
package Array;

import java.util.Arrays;
import java.util.Stack;

public class problem14 {
    static void mergeInterval(int interval[][], int row, int column)
    {
        Arrays.sort(interval, (a,b)->Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.add(interval[0]);
        for(int i=1;i<row;i++)
        {
            //1 4
            //2 3
            int startPoint2 = interval[i][0];
            int endPoint2 = interval[i][1];
            int popArray[] = stack.pop();
            int startPoint1 = popArray[0];
            int endPoint1 = popArray[1];
            int endMax = Math.max(endPoint2, endPoint1);
            if(endPoint1>=startPoint2)
            {
                int merge[] = new int[]{startPoint1, endMax};
                stack.add(merge);
            }
            else
            {
                stack.add(popArray);
                stack.add(interval[i]);
            }
        }
        int output[][] = new int[stack.size()][2];
        for(int i=output.length-1;i>=0;i--)
        {
            int popArray[] = stack.pop();
            output[i][0] = popArray[0];
            output[i][1] = popArray[1];
        }
        for(int i =0;i<output.length;i++)
        {
            System.out.println(output[i][0] + " " + output[i][1]);
        }
    }
    public static void main(String[] args) {
        int interval[][] = {{1,2},{2,6},{8,10},{15,18}};
        int row = interval.length;
        int column = interval.length>0?interval[0].length:0;
        mergeInterval(interval,row,column);
    }
}
