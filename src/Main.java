public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "90552312331");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "85231220023");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "86321520023");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Inek Saban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,78,50,70,80,90);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "444", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(50,30,70,80,80,70);
        s2.isPass();

        Student s3 = new Student("Damat Ferit", "492", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(60,70,85,90,85,75);
        s3.isPass();
    }
}
