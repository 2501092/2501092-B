import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int n = 10;

        String[] hakbun = {
                "1601007", "1601003", "1601013", "1601024", "1601096",
                "1601058", "1601110", "1601077", "1601085", "1601026"
        };
        String[] name = {
                "이대한", "홍길동", "한나라", "이순신", "김혜숙",
                "김현호", "나희염", "이동국", "박예림", "김동근"
        };
        int[] midterm =    {100, 78, 90, 78, 89, 67, 78, 45, 56, 89};
        int[] finalExam =  {100, 90, 90, 89, 89, 78, 67, 67, 56, 78};
        int[] quiz =       {100, 90, 90, 89, 89, 78, 67, 78, 78, 78};
        int[] report =     {100, 90, 90, 89, 89, 78, 67, 78, 78, 78};
        int[] attendance = {100, 100, 90, 89, 78, 78, 89, 78, 78,  9};

        double[] weightedAvg = new double[n];

        final double MIDTERM_WEIGHT = 0.15;
        final double FINAL_WEIGHT = 0.15;
        final double QUIZ_WEIGHT = 0.10;
        final double REPORT_WEIGHT = 0.40;  // 과제 40%
        final double ATTENDANCE_WEIGHT = 0.20; // 출석 20%

        for (int i = 0; i < n; i++) {
            weightedAvg[i] = (midterm[i] * MIDTERM_WEIGHT) +
                    (finalExam[i] * FINAL_WEIGHT) +
                    (quiz[i] * QUIZ_WEIGHT) +
                    (report[i] * REPORT_WEIGHT) +
                    (attendance[i] * ATTENDANCE_WEIGHT);
        }

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (weightedAvg[j] < weightedAvg[j + 1]) {

                    double tempAvg = weightedAvg[j];
                    weightedAvg[j] = weightedAvg[j + 1];
                    weightedAvg[j + 1] = tempAvg;

                    String tempStr = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = tempStr;

                    tempStr = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempStr;

                    int tempInt = midterm[j];
                    midterm[j] = midterm[j + 1];
                    midterm[j + 1] = tempInt;

                    tempInt = finalExam[j];
                    finalExam[j] = finalExam[j + 1];
                    finalExam[j + 1] = tempInt;

                    tempInt = quiz[j];
                    quiz[j] = quiz[j + 1];
                    quiz[j + 1] = tempInt;

                    tempInt = report[j];
                    report[j] = report[j + 1];
                    report[j + 1] = tempInt;

                    tempInt = attendance[j];
                    attendance[j] = attendance[j + 1];
                    attendance[j + 1] = tempInt;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("********************************************************************");
        System.out.println(" 학번        이름     중간   기말   퀴즈  레포트   출석     점수");
        System.out.println("********************************************************************");

        for (int i = 0; i < n; i++) {
            System.out.printf("%s  %-5s %5d %5d %5d %5d %5d %7.2f%n",
                    hakbun[i],
                    name[i],
                    midterm[i],
                    finalExam[i],
                    quiz[i],
                    report[i],
                    attendance[i],
                    weightedAvg[i]);
        }
        System.out.println("********************************************************************");
    }
}