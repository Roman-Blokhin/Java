package tasks;

import java.util.Timer;
import java.util.TimerTask;

public class TimerMy {
    public static void main(String[] args) {

        // ЗАДАЧА 28 - Работа с таймерами в Java (Timer и TimerTask).
        //Задание: Запустите таймер, который выводит сообщение "Привет!" каждую секунду в течение 5 секунд.

        Timer timer = new Timer();  // создаем сам таймер
        TimerTask task = new TimerTask() {
            int stop = 0;

            @Override
            public void run() {
                stop++;
                System.out.println("Привет!");
                if (stop == 5) {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
