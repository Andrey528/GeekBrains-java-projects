import semLesson2.Task1.Task1;

public class program {
    public static void main(String[] args) {
//        semLesson1.Task1.Task1.hello();
//        semLesson1.Task2.Task2.hello();
//        int[] array = new int[] {1,1,0,1,1,1};
//        System.out.println(semLesson1.Task3.Task3.getMaxOneCount(array));
//        homeWork1.Task1.Task1.sumOfNums();
//        homeWork1.Task2.Task2.callFactorial();
//        System.out.println(Task3.findSimpleNums(1000));
//        homeWork1.Task4.Task4.calc();
//        System.out.println(semLesson2.Task1.Task1.getRepeatString(5));
//        System.out.println(semLesson2.Task1.Task1.getRepeatString(5).length());
//        System.out.println(semLesson2.Task2.Task2.stringCompression("aaaabbbcdd"));
//        System.out.println(semLesson2.Task3.Task3.writeString("test"));
        homeWork2.Task1.Task1.bubbleSort(homeWork2.Task1.Task1.genArray(10));
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        homeWork2.Task2.Task2.parseJsonString(jsonString);
    }
}
