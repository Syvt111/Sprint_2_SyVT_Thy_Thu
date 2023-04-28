public class ExampleString {

    public static void main(String[] args) {
        // Sử dụng lớp String
        String str1 = "Hello";
        String str2 = " World!";
        String str3 = str1.concat(str2); // Nối chuỗi
        System.out.println(str3);

        // Sử dụng lớp StringBuilder
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder(" is fun!");
        sb1.append(sb2); // Nối chuỗi
        System.out.println(sb1.toString());

        // Sử dụng lớp StringBuffer
        StringBuffer sbf1 = new StringBuffer("Hello");
        StringBuffer sbf2 = new StringBuffer(" World!");
        sbf1.append(sbf2); // Nối chuỗi
        System.out.println(sbf1.toString());


//            Sử dụng StringBuilder để thực hiện các thao tác sửa đổi chuỗi nhiều lần trong một vòng lặp

        String[] words = {"Lorem", "ipsum", "dolor", "sit", "amet"};

        // Sử dụng StringBuilder để nối các từ thành một câu
        StringBuilder sentence = new StringBuilder();
        for (String word : words) {
            sentence.append(word);
            sentence.append(" ");
        }
        System.out.println(sentence.toString());

        // Sử dụng String để nối các từ thành một câu
        String sentence2 = "";
        for (String word : words) {
            sentence2 += word + " ";
        }
        System.out.println(sentence2);
    }
}




