//задание к теории 4.1 объектно-ориентированная парадигма
//💡 Задание: расширить функционал класса Student, выводящий в консоль текущее
// системное время при вызове метода learn, используя приведённый в примере шаблон.
//Время должно быть в формате: чч:мм:сс
//Название объявляемого класса: StudentWithClock
//Пример:
//Вывод: Я учусь. .zZ
//Вывод: Я закончил учиться
//Вывод: Текущее время: 20:21:41

//public class Main {
//
//    public static void main(String[] args) {
//        new Student().learn();
//    }
//}

public class Main {

    public static void main(String[] args) {
        new Student().learn();
        //new StudentWithTimer(new Student()).learn();
        new StudentWithClock(new Student()).learn();
    }
}