class NumOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2]; 
        
        for (int student : students) {
            count[student]++;
        }
        
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break; 
            }
            count[sandwich]--; 
        }
        
        return count[0] + count[1];
    }
}

public class Main {
    public static void main(String[] args) {
        NumOfStudentsUnableToEatLunch solution = new NumOfStudentsUnableToEatLunch();

        int[] students1 = {1, 1, 0, 0};
        int[] sandwiches1 = {0, 1, 0, 1};
        System.out.println("Students unable to eat: " + solution.countStudents(students1, sandwiches1)); 

        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println("Students unable to eat: " + solution.countStudents(students2, sandwiches2)); 
    }
}