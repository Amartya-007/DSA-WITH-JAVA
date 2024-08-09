public class RealWorldExamples {
    public static void main(String[] args) {
        // Example: Storing and Displaying Exam Scores
        int[] scores = {85, 90, 78, 92, 88};
        System.out.println("Exam Scores:");
        for (int score : scores) {
            System.out.println(score);
        }

        // Example: Calculating the Average Score
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("Average Score: " + average);
    }
}
