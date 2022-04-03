package Week7.Q3;

public class Pro3_64010845 {
    public static void main(String[] args) {
        Person man1 = new Person("Sirasit", "92/199 Rattanathibet Road, Muang ,Nonthaburi 11000", "0863520489",
                "64010845@kmitl.ac.th");
        Student man2 = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", "0123456789",
                "somsak@mymail.com", 1);
        Faculty man3 = new Faculty("_Chelby_", "92/109 Rattanathibet Road, Muang ,Nonthaburi 11000", "0929240552",
                "cheiby@gmail.com", "Oot Oot company", 2000000, "8 Hr.", "CEO");
        Staff man4 = new Staff("Mai wai rawww", "Somewhere on earth", "0923534592", "aaa@mai.com", "Tesla motor",
                90000000, "let me go");
        System.out.println(man1.toString());
        System.out.println("---------------------------------------");
        System.out.println(man2.toString());
        System.out.println("---------------------------------------");
        System.out.println(man3.toString());
        System.out.println("---------------------------------------");
        System.out.println(man4.toString());
        System.out.println("---------------------------------------");
    }
}
