public class ArryAobject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="a";
        s1.roleno=1;
        s1.marks=60;

        Student s2 = new Student();
        s2.name="b";
        s2.roleno=1;
        s2.marks=60;

        Student s3 = new Student();
        s3.name="c";
        s3.roleno=1;
        s3.marks=60;

        Student st [] = new Student[3];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;
        System.out.println(st[1].name);

        for (Student student : st) {
            System.out.println(student.name);
        }
    }
}
/**
 * InnerArryAobject
 */
class Student {

    int roleno;
    String name;
    int marks;
}
