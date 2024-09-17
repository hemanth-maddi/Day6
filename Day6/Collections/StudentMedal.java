import java.util.HashMap;

class StudentMedal {
    public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        HashMap<Integer, String> studentMedals = new HashMap<>();
        for (Integer studentId : studentMarks.keySet()) {
            int marks = studentMarks.get(studentId);
            String medal;
            if (marks >= 90) {
                medal = "Gold";
            } else if (marks >= 80) {
                medal = "Silver";
            } else if (marks >= 70) {
                medal = "Bronze";
            } else {
                continue; 
            }
            studentMedals.put(studentId, medal);
        }

        return studentMedals;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(1, 92);
        studentMarks.put(2, 85);
        studentMarks.put(3, 78);
        studentMarks.put(4, 65); 
        HashMap<Integer, String> result = getStudents(studentMarks);

        System.out.println(result);
    }
}
