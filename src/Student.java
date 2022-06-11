public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int sNotu1, int sNotu2, int sNotu3){
        if ((note1 >= 0 && note1 <= 100) && (sNotu1 >= 0 && sNotu1 <= 100)){
            this.c1.note = note1;
        }

        if ((note2 >= 0 && note2 <= 100) && (sNotu2 >= 0 && sNotu2 <= 100)){
            this.c2.note = note2;
        }

        if ((note3 >= 0 && note3 <= 100) && (sNotu3 >= 0 && sNotu3 <= 100)){
            this.c3.note = note3;
        }
    }

    public void calcAverage(){
        double n1 = (this.c1.note * 0.8 + this.c1.sozluNotu * 0.2);
        double n2 = (this.c2.note * 0.6 + this.c2.sozluNotu * 0.4);
        double n3 = (this.c3.note * 0.7 + this.c3.sozluNotu * 0.3);
        this.average = (n1 + n2 + n3) / 3;
    }

    void isPass(){
        System.out.println("======================================");
        calcAverage();

        if (this.average > 55){
            System.out.println("Hababam sinifi uyaniyor!");
            this.isPass = true;
        }
        else {
            System.out.println("Hababam sinifi, sinifta kaldi!");
            this.isPass = false;
        }

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
        System.out.println("Ortalamaniz: " + this.average);
    }
}
