package codenote_Practice;

public class StringPractice5 {
    public static void main(String[] args) {

//        Task 5:
//        given a name with prefix, stored in a String variable called name
//        for example
//        Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
//                -- in case insensitive condition ----
//        print as below
//        if the name Started with (Dr )-->> Doctor
//        if the name Started with (Mr )-->> Male
//        if the name Started with (Miss )-->> Single female
//        if the name Started with (Mrs )-->> Married female
    String name= "Dr.Salam";
    name.equalsIgnoreCase(name);
    if (name.startsWith("dr")){
        System.out.println("Doctor");
    }






    }
}
