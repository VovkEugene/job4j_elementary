package ru.job4j.loop;

/**
 * В тренажерный зал пришли новые спортсмены - Иван и Николай.
 * Они хотят прогрессировать очень быстро и поэтому употребляют много протеина.
 * Иван за месяц увеличивает силу тяги в 3 раза за счет такой диеты,
 * а Николай - за месяц увеличивает силу тяги в 2 раза.
 * Иван хочет узнать, сколько месяцев ему нужно тренироваться, чтобы обогнать Николая в тяге.
 * Начальная сила тяги спортсменов задается через аргументы методов.
 * Метод должен вычислять количество месяцев, которое необходимо Ивану, чтобы обогнать в тяге Николая.
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;

        while (ivan <= nik) {
            month++;
            ivan *= 3;
            nik *= 2;
        }
        return month;
    }
}
