import java.util.Arrays;

/**
 * Напишите статический класс AsciiCharSequence,
 * реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
 * По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
 *
 * Класс AsciiCharSequence должен:
 *
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определять методы length(), charAt(), subSequence() и toString()
 *
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
 *
 * В данном задании методам charAt() и subSequence()
 * всегда будут подаваться корректные входные параметры,
 * поэтому их проверкой и обработкой ошибок заниматься не нужно.
 * Тем более мы еще не проходили исключения.
 * */
public class Main {
    public static void main(String[] args) {

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence((byte)97, (byte)98,(byte)99,
                (byte)100, (byte)101, (byte)102, (byte)103, (byte)104, (byte)105, (byte)106);
        System.out.println("Длина массива\t" + asciiCharSequence.length());
        System.out.println("Символ из массива\t" + asciiCharSequence.charAt(5));
        System.out.println("Последовательность символов из массива\n" + asciiCharSequence.toString());

    }
}
