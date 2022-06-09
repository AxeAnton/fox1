package gemeFox;

import java.util.ArrayList;
import java.util.Scanner;

public class Description {

    private static final ArrayList<Script> scripts = new ArrayList<>();
    private static boolean fix = false;
    private static int resultFix;


    public static ArrayList<Script> createScripts() {
        scripts.add(new Script("Лисенок", "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга.  Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду. - подумал Лисёнок. Как поступить Лисенку?", "1.Вернуться домой", "2.Отправиться на поиски"));
        scripts.add(new Script("Вернуться домой", "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! игра завершилась успехом", null, null));
        scripts.add(new Script("Отправиться на поиски", "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.", "1.Попытаться разузнать о Бельчонке у лесных жителей", "2.искать Бельчонка в одиночку"));
        scripts.add(new Script("Попытаться разузнать о Бельчонке у лесных жителей", "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?", "1.Расспросить Сову", "2.Расспросить Волка"));
        scripts.add(new Script("искать Бельчонка в одиночку", "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать. игра завершилась неудачей", null, null));
        scripts.add(new Script("Расспросить Сову", "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.", "1.Поверить Сове и отправиться вглубь леса", "2.Сове не стоит верить -> искать Бельчонка в одиночку"));
        scripts.add(new Script("Расспросить Волка", "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?", "1.Волк прав -> Вернуться домой", "2.-> искать Бельчонка в одиночку"));
        scripts.add(new Script("Поверить Сове и отправиться вглубь леса", "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.", "1.Нет, потрачено слишком много времени, нужно идти дальше -> искать Бельчонка в одиночку", "2.Нужно воспользоваться шансом и раздобыть мёд"));
        scripts.add(new Script("Нужно воспользоваться шансом и раздобыть мёд", "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.", "1.Подождать, вдруг пчёлы улетят", "2.Нужно попытаться выкрасть мёд немедленно"));
        scripts.add(new Script("Подождать, вдруг пчёлы улетят", "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?", "1.Поесть немного и передохнуть", "2.Скорее отнести мёд Медвежонку"));
        scripts.add(new Script("Нужно попытаться выкрасть мёд немедленно", "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. игра завершилась неудачей", null, null));
        scripts.add(new Script("Поесть немного и передохнуть", "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски. игра завершилась неудачей", null, null));
        scripts.add(new Script("Скорее отнести мёд Медвежонку", "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.", "1.Медвежонок ничего не знает, нужно продолжить поиски -> искать Бельчонка в одиночку", "2.Может быть он прав и Лисёнок просто паникует -> Вернуться домой"));
        return scripts;
    }


    public static int play(int startNumDescription) {


        boolean stop = true;


        ArrayList<Script> arrayList = createScripts();

        Scanner scanner = new Scanner(System.in);
        System.out.println(arrayList.get(startNumDescription).getExplanation());
        System.out.println(arrayList.get(startNumDescription).getOption1());
        System.out.println(arrayList.get(startNumDescription).getOption2());
        System.out.println("3.Выйти из игры");


        while (stop) {
            int n = scanner.nextInt();
            String result = null;

            if (n == 1) {

                result = arrayList.get(startNumDescription).getOption1();
                if (result.contains("Вернуться домой")) {
                    for (Script s : arrayList) {
                        if (result.contains(s.getAction())) {
                            System.out.println(s.getExplanation());
                            break;
                        }
                    }
                    fix = false;
                    stop = false;
                    break;
                }

                for (Script node : arrayList) {

                    if (result.contains(node.getAction())) {
                        System.out.println(node.getExplanation());
                        if (node.getOption1() == null && node.getOption2() == null) {
                            System.out.println(" Вы проиграли");
                            fix = false;
                            stop = false;
                            break;
                        }
                        System.out.println(node.getOption1());
                        System.out.println(node.getOption2());
                        System.out.println("3.Выйти из игры");

                        startNumDescription = arrayList.indexOf(node);
                        break;
                    }
                }
            }
            if (n == 2) {

                result = arrayList.get(startNumDescription).getOption2();
                if (result.contains("Вернуться домой")) {
                    for (Script s : arrayList) {
                        if (result.contains(s.getAction())) {
                            System.out.println(s.getExplanation());
                            break;
                        }
                    }
                    fix = false;
                    break;
                }

                for (Script node : arrayList) {
                    if (result.contains(node.getAction())) {
                        System.out.println(node.getExplanation());
                        if (node.getOption1() == null && node.getOption2() == null) {
                            System.out.println("Вы проиграли");
                            fix = false;

                            stop = false;

                            break;
                        }
                        System.out.println(node.getOption1());
                        System.out.println(node.getOption2());
                        System.out.println("3.Выйти из игры");

                        startNumDescription = arrayList.indexOf(node);
                        break;
                    }
                }
            }
            if (n == 3) {
                System.out.println("4.Сохранить игру?" + "\n" + "5.Не сохранять игру ");
                int answer = scanner.nextInt();
                if (answer == 4) {
                    fix = true;
                    resultFix = startNumDescription;
                    return resultFix;

                } else {
                    fix = false;
                }
                break;
            }
        }
        return startNumDescription;
    }


    public static boolean isFix() {
        return fix;
    }

    public static int getResultFix() {
        return resultFix;
    }
}
