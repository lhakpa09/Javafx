package project_slr.project_l;
interface person{
    void greet();
}
class Student implements  person{
    @Override
    public void greet(){
        System.out.println("Nameste!!");
    }
}
public class AnnonymouslnnerClassDemo {
    public static void main(String[] args) {
        person student = new Student();
        student.greet();

    }
}
