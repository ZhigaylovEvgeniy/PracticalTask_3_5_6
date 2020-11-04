import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

import static java.lang.System.*;

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
        int start = 2;
        int end = 16;
        byte[] mbs = new byte[]{95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115};
        out.println(Arrays.toString(mbs));
        AsciiCharSequence aCh1 = new AsciiCharSequence(mbs);
        out.println(aCh1.subSequence(start, end).toString());
        out.println(aCh1.subSequence(start, end).length());
        out.println(aCh1.subSequence(start, end).charAt(5));
    }
}
