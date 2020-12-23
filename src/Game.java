import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("=====================Bethesda Game Studio=====================");
        System.out.println("================Совместно с Игорем Стрешневым================");
        System.out.println("=======================Представляет=======================");
        System.out.println("=========Скайрим. Снова. На консоли нового поколения=========");
        System.out.println("=============================================================");
        System.out.println("Узник:Эй ты! Не спишь? Ты нарушитель границы, так? Надо же было тебе налететь прямо на имперскую засаду!");
        System.out.println("Узник:Нас везут в Хелген. Совнгард ждет!");
        System.out.println("=====================Тебя привезли в имперскую крепость Хелген=====================");
        System.out.println("Узник:вот мы и приехали. \n" +
                "Имперский капитан: Когда вызовем, делайте шаг вперед, по одному.\n " +
                "=================Узников вызывают по списку=================\n" +
                "Имперский капитан: Стоп. Этого в списке нет. А ты кто такой?\n" +
                "Введите расу из 4 предложенных:\n" +
                "Норд \n" +
                "Аргонианин\n" +
                "Эльф\n" +
                "Каджит");
        String race = sc.next();
        System.out.println("Введите имя:");
        String name = sc.next();
        Player dovakin = new Player(name, race);
        Story story = new Story();
        while (true) {
            dovakin.battle(story.current_situation.attackHealth,story.current_situation.attackDamage);
            System.out.println("Здоровье: " + dovakin.health + "\tУрон: " + dovakin.damage + "\tМана: " + dovakin.mana + "\tСыр: " + dovakin.cheese);
            System.out.println("============" + story.current_situation.subject + "============");
            System.out.println(story.current_situation.text);
            dovakin.healthBonus = story.current_situation.healthBonus;
            dovakin.damageBonus = story.current_situation.damageBonus;
            dovakin.manaBonus = story.current_situation.manaBonus;
            dovakin.health += dovakin.healthBonus;
            dovakin.damage += dovakin.damageBonus;
            dovakin.mana += dovakin.manaBonus;
            dovakin.cheese += story.current_situation.dCheese;
            if (story.isEnd()) {
                System.out.println("==========Конец игры==========");
                return;
            }
            if (dovakin.isDead()) {
                System.out.println("==========Тебя убили==========");
                return;
            }
            story.go(sc.nextInt());
        }

    }
}
