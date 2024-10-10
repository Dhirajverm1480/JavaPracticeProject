public class Student {
    private int id;
    private String studentName;
    private int classNumber;

    public Student(int id, String studentName, int classNumber){
        this.id = id;
        this.studentName =  studentName;
        this.classNumber = classNumber;
    }

    public int getId(){
        return id;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getClassNumber(){
        return classNumber;
    }
}