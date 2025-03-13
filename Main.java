import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Make an array of doubles, and test your sumArray method
    double[] foo = new double[5];
    foo[0] = 2.718281828;
    foo[1] = 3.141526535;
    foo[2] = 1.681;

    System.out.println(sumArray(foo));
    // TODO: Make an array of Strings, and test your averageLength method
    String[] bar = {"hello", "darkness", "my", "old", "friend"};
    System.out.println(averageLength(bar));
    // TODO: Make an array of ints, and test your arrayMax method

    int[] testMax = {1, 2, 3, 4, 5};
    System.out.println(arrayMax(testMax));
    // TODO: Make an array of Strings as well as a target, and test your linearSearch method
    System.out.println(linearSearch(bar, "my"));
  }


  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i].length();
    }
    return sum/arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++)
    {
      if (arr[i] > max)
      {
        max = arr[i];
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i].equals(target))
      {
        return true;
      }
    }
    return false;
  }
}
