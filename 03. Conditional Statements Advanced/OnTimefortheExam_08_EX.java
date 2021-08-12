import java.util.Scanner;

public class OnTimefortheExam_08_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //дошъл навреме, ако е пристигнал в часа на изпита или половин час преди това
        //по-рано повече от 30 минути той е подранил
        //след часа на изпита, той е закъснял

        //Първият ред съдържа час на изпита – цяло число от 0 до 23.
        //Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
        //Третият ред съдържа час на пристигане – цяло число от 0 до 23.
        //Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.

        int startHour = Integer.parseInt(scanner.nextLine());
        int startMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());
        // да си обърнем 4асовете в минути на 4аса на теста и на пристигащият 4ас
        //и ги събираме по отделно
        /* !!! ПРИ ПРЕСМЯТАНЕ НА ТОТАЛНИТЕ МИНУТИ ПРИСТИГАЩИТЕ - СТАРТ 4АСА В МИНУТИ

         ЗА ДА ПОЛУ4А ЗАКЪСНЯЛОТО ВРЕМЕ В МИНУТИ НА ПРИСТИГАНЕТО 20,30 ЕТС ..
         А ОБРАТНО ЩЕ СА ПОДРАНИЛОТО ВРЕМЕ!!!
         ОТ ЦЯЛОТО ВРЕМЕ В МИНУТИ ДЕЛЯ МОДУЛНО (%) НА ТЯХ И НАМИРАМ ОСТАТЪКА*/
        /* --> “Late”, ако студентът пристига по-късно от часа на изпита.
          -->“On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
           -->“Early”, ако студентът пристига повече от 30 минути преди часа на изпита */


        int totalStartMin = startHour * 60 + startMin;
        int totalArriveMin = arriveHour * 60 + arriveMin;

        /*int lateTime = totalArriveMin - totalStartMin;
        int earlyTime = totalArriveMin - totalStartMin;*/

        // пресмятаме подраняването
        if (totalArriveMin < totalStartMin) {
            int early = totalStartMin - totalArriveMin;
            if (early > 30 && early < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", early);
            } else if (early >= 60) {
                int earlyMin = totalStartMin + early;
                int endMin = earlyMin - totalStartMin;
                int startInHours = endMin / 60;
                int startInMin = endMin % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", startInHours, startInMin);
            }

        }
        if (totalArriveMin > totalStartMin) {
            int late = totalArriveMin - totalStartMin;
            if (late < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", late);
            } else if (late >= 60) {
                int lateMin = totalArriveMin + late;
                int endMin = lateMin - totalArriveMin;
                int startInHours = endMin / 60;
                int startInMin = endMin % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", startInHours, startInMin);

            }
        }
        if (totalArriveMin == totalStartMin) {
            System.out.println("On time");
        } else if (totalArriveMin <= totalStartMin) {
            int onTime = totalStartMin - totalArriveMin;
            if (onTime <= 30){
                System.out.println("On time");
                System.out.printf("%d minutes before the start", onTime);
            }

        }
    }
}
