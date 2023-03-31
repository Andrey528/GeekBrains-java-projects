package semLesson1.Task3;

public class Task3 {
    public static int getMaxOneCount(int[] arg) {
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        int maxCount = 0;
        int count = 0;
        for (int item:arg) {
            if (item == 1) count++;
            else count = 0;
            if (count > maxCount) maxCount = count;
        }
        return maxCount;
    }
}
