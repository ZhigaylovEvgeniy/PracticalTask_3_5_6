import java.io.UnsupportedEncodingException;
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
    private byte[] mb;//Создаём массив
    //КОНСТРУКТОР
    public AsciiCharSequence(byte[] mb) {
        this.mb = mb;
    }

    //РЕАЛИЗАЦИЯ ИНТЕРФЕЙСА (Метод возвращает длину массива)
    @Override
    public int length() {//
        return this.mb.length;
    }

    @Override //version 2
    public String toString() {
           /*String str = new String(this.mb, "UTF-8");*/
           String str = new String(this.mb);
        return  str;
    }

    @Override
    public char charAt(int index){
        return (char)(this.mb[index]);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.mb, start, end));//
    }

}
