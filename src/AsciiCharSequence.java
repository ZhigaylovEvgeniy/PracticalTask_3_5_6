import java.lang.CharSequence;
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
public class AsciiCharSequence implements CharSequence {
    byte[] mb;

    public AsciiCharSequence(byte... mb) {
        this.mb = mb;
    }

    @Override
    public int length() {//
        return this.mb.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < this.mb.length; ++i){
            str = str.append(String.valueOf((char) this.mb[i]));
        }
        return str.toString();
    }

    @Override
    public char charAt(int index){
        return (char) (97 + index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(mb, start, end));
    }

}
