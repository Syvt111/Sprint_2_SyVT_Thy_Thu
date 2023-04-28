public class Oca5 {

    interface Readable1{
        public void readBook();
        public void setBookMart();
    }

    abstract class Book1 implements Readable1{
        public void readBook() {}

        public void setBookMart() {

        }
    }

   abstract class EBook1 extends Book1{

        public void readBook(){}

    }

}
