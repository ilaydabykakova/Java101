package OPP.StudentInformationSystem;

public class Course {
    Teacher courseteacher;//teacher adında nesne atadık.
    String name;
    String code;
    String prefix;
    int note1;
    int note2;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note1 = 0;
        int note2 = 0;
    }
    void printTeacherInfo(){
        this.courseteacher.print();
    }
    void  addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            System.out.println("İşlem Başarılı");
        }else{
            System.out.println(t.name+"Akademisyeni bu dersi veremez.");
        }
    }
    void printTeacher(){
        if (courseteacher !=null){
            System.out.println(this.name+" dersinin Akademisyeni : "+courseteacher);
        }else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
