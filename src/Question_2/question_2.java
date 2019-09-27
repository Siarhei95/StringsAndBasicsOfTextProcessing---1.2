package Question_2; //Замените в строке все вхождения 'word' на 'letter'

public class question_2 {
    public static void main(String[] args) {
        String offer = "Letter and word are the most important elements in word formation"; //предложение разбиваем на элементы и помещаем в массив;
        String[] words = offer.split(" ");
        System.out.println("Original sentence: " + offer);

        System.out.print("Modified sentence: ");
        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].replaceAll("word", "letter"); //находим совпадение и производим замену.
            System.out.print(words[i] + " ");
        }
    }
}