public class Story {
    private Situation start_story;
    public Situation current_situation;
    public String race;
    Story() {
        start_story = new Situation("Выход из редактора персонажа",
                "Имперский капитан: Хорошо, а теперь отправляйся на плаху! \n" +
                "1. Попытаться убежать\n" +
                "2. Повиноваться", 2, 0, 0, 0, 0, 0, 0);
        start_story.direction[0] = new Situation("Ты попытался убежать",
                "Отлично, тебя не успели поймать! *Свист* О нет, стрела! Тебе подстрелили колено! \n" +
                        "Теперь тебя не будет вести дорога приключений! Но ты все же жив! *Свист* \n" +
                        "О нет! Теперь попали в твою голову. Прощай, ты пытался!", 0,
                0, 0, 0,0, 0, 0);
        start_story.direction[1] = new Situation("Тебя отвели к палачу",
                "Палач замахивается над тобой и.... Что это? О черт! Дракон! " +
                "Имперский капитан: Стреляйте! Все лучники! Он поджег крепость! Бежим!\n" +
                "1. Остаться на плахе и ждать смерти, как истинный норд! (Даже если я не норд) \n" +
                "2. Спрятаться где-нибудь и переждать \n" +
                "3. Убежать из крепости ", 3,
                0, 0, 0,0, 0, 0);
        start_story.direction[1].direction[0] = new Situation("Ты остался",
                "Тебя сжег дракон. Ты жил без страха, и умер без страха! До встречи в Совнгарде, норд!", 0,
                0,0,0,0,0,0);
        start_story.direction[1].direction[1] = new Situation("Ты решил спрятаться",
                "Не самый смелый поступок, но мое дело лишь вести тебя по дороге приключений, а не осуждать. Но куда спрятаться?\n" +
                "1. Нужно бежать к башне\n" +
                "2. Спрячусь в казармах!", 2, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[1].direction[0] = new Situation("Ты побежал к башне",
                "Ты забежал в башню и спрятался там. Но ждал ты недолго - башню поджег дракон и она обрушилась",
                0, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[1].direction[1] = new Situation("Ты спрятался в казармах",
                "Ты забежал в казармы. Стоит ли их обыскать или лучше найти место где можно спрятаться?\n" +
                "1. Обыскать казармы\n" +
                "2. Спрятаться в погребе", 2, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[1].direction[1].direction[0] = new Situation("Ты обыскал казармы",
                "Ты нашел имперскую снаряжение - броню и меч, а еще сыр! Если ты будешь при смерти, он тебя спасет! \n" +
                "1.Спрятаться в погребе", 1, 50, 15, 0, 1, 0,0);
        start_story.direction[1].direction[1].direction[1].direction[1] = new Situation("Ты спрятался",
                "Здесь можно переждать нападение, это уж точно.\n" +
                "=============Прошло много времени=============\n" +
                "Пора вылезать наружу, дракон улетел.\n" +
                "1. Вылезти", 1, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[1].direction[1].direction[0].direction[0] = start_story.direction[1].direction[1].direction[1].direction[1];
        start_story.direction[1].direction[1].direction[1].direction[1].direction[0] = new Situation("Ты вылез из погреба",
                "Крепость сгорела дотла... Вокруг столько тел! Черт! Бандиты! Пришли на горячее, грабят развалины! Придется дать бой, здесь не спрятаться!\n" +
                "1. Дать бой\n" +
                "2. Спрятаться", 2, 0, 0, 0, 0, 120, 25);
        start_story.direction[1].direction[1].direction[1].direction[1].direction[0].direction[0] = new Situation("Ты принял бой" ,
                "Ого! Ты всех их убил! Теперь путь свободен!\n" +
                "Ты сбежал из крепости и выжил. Но впереди еще много приключений!\n" +
                "============Продолжение следует============", 0, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[1].direction[1].direction[1].direction[0].direction[1] = new Situation("Ты спрятался",
                "Ты спрятался за обгоревшей стеной и стал ждать пока уйдут бандиты. Ты следишь за ними.\n" +
                "дин из них подкрался к тебе и убил со спины. Печаль. Мне будет тебя не хватать!", 0, 0, 0, 0, 0, 0, 0);

        start_story.direction[1].direction[2] = new Situation("Ты решил бежать",
                "Нужно решить куда бежать - все имперцы бегут к воротам, но еще можно пойти к той высокой башне\n" +
                "1. Конечно нужно бежать туда, куда бегут все! К выходу!\n" +
                "2. Нужно бежать к башне!",2, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[0] = new Situation("Ты побежал со всеми к выходу",
                "Все побежали к воротам. Отлично, осталось чуть-чуть и я буду на свободе! О нет!\n" +
                "Дракон подлетел к воротом и поджег их, они упали на всех...Включая тебя!",
                0, 0, 0, 0,0 ,0, 0);
        start_story.direction[1].direction[2].direction[1] = new Situation("Ты побежал к башне",
                "Особенный что ли? Ладно, неважно. Ты поднялся на башню, отлично! Но куда дальше?\n" +
                        "Черт! Дракон! Он поджег башню и снес верхушку своими лапами! Надо куда-то сматываться!\n" +
                        "Внизу есть стог сена, что насчет прыжка веры? Ты мог бы спрыгнуть с башни...\n" +
                        "1. Прыгнуть в стог сена\n" +
                        "2. Я спущусь обратно вниз", 2, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0] = new Situation("Ты спрыгнул вниз",
                "Ого! Ты выжил! Снова дракон! Убегай! Те имперские солдаты бегут к выходу, может побежать с ними?\n" +
                "1. Побежать с солдатами\n" +
                "2. Побежать внутрь крепости", 2, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[1] = new Situation("Ты решил спуститься вниз",
        "Ты побежал вниз по лестнице, но не успел - башня обрушилась. До связи.", 0, 0, 0, 0,0  ,0 , 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[0] = start_story.direction[1].direction[2].direction[0];
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1] = new Situation("Ты убежал внутрь крепости",
                "Отлично, теперь ты в безопасности. Смотри! Здесь имперское снаряжение - оружие и броня, теперь ты можешь драться!\n" +
                "Теперь надо найти отсюда выход, не попавшись дракону на глаза. Там лестница, спустись туда\n" +
                "1. Спуститься в подземелье\n" +
                "2. Переждать здесь, пока не улетит дракон", 2, 50, 15, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[1] = start_story.direction[1].direction[1].direction[1].direction[1];
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0] = new Situation("Ты спустился в подземелье" ,
                "Ты услашал голоса. Там кто-то есть!\n" +
                "1. Избежать встречи\n" +
                "2. Выйти к говорящим и сложить оружие в знак мирных намерений\n" +
                "3. Напасть первым", 3, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[0] = new Situation("Ты решил действовать скрытно",
                "Это оказалась кучка имперских солдат. Они тебя не заметили и ты успешно избежал бойни\n" +
                        "1. Спускаться дальше", 1, 0, 0, 0, 1, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[1] = new Situation("Ты решил действовать мирно",
                "Это оказалась группа имперских солдат. Видимо они тоже решили уйти из крепости этим путем\n" +
                        "Имперский солдат: Эй! Ни с места! Сложи свое оружие!\n" +
                "Ты: Спокойно! Не надо насилия! Я сдаюсь!\n" +
                "Имперский солдат: Отлично! Нам как раз нужно снаряжение! Можешь идти с миром, а твое оружие идет с нами\n" +
                "1. Просто отдать оружие\n" +
                "2. Я так не сдамся!", 2, 0, 0, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[1].direction[1] = new Situation("Ты решил драться",
                "Имперский солдат: Ладно, парни, отделаем его хорошенько!\n" +
                        "1. Бой", 1, 0, 0, 0, 0, 150, 30);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[1].direction[0] = new Situation("Ты потерял все снаряжение" ,
                "Как глупо с товей стороны! Ты даже не сможешь теперь защищаться! Ладно, двигай дальше\n" +
                        "1.Спуститься еще ниже", 1, -50, -15, 0, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[1].direction[1].direction[0] = new Situation("Бой",
                "Ты победил! У них много снаряжения, которое лучше твоего. А еще здесь лежит сыр! Надо двигаться дальше\n" +
                        "1. Спуститься еще ниже", 1, 60, 30, 0, 1, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2] = new Situation("Ты неожиданно напал на них",
                "Элемент неожиданности сыграл свою роль - имперские ублюдки ничего не смогли сделать, и ты порубил их как свиней. У них оказалось отличная снаряга!\n" +
                        "1. Двигаться дальше", 1, 30, 10, 0, 1, 0, 0);
       start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2].direction[0] = new Situation("Ты спустился еще ниже",
                "Подземелье крепости ведет к пещерам! Стой! Там опять кто-то есть! Черт, кажется тебя заметили!\n" +
                        "Маг: Кто это к нам пожаловал?\n" +
                        "Некромант: Отлично, еще одно мясо для моих эскпериментов!\n" +
                        "Придется дать бой. Впрочем, их всего двое!\n" +
                        "1. Драться!", 1, 0, 0, 0, 0, 170, 25 );
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[0].direction[0] =
                start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2].direction[0];
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[1].direction[0].direction[0] =
                start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2].direction[0];
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[1].direction[1].direction[0].direction[0] =
                start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2].direction[0];
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2].direction[0].direction[0] = new Situation("Ты победил",
                "Магический мир проиграл! Клинок оказался сильней! Ты изрубил этих шарлатанов, называющих себя магами!\n" +
                        "Но что это? Это магический посох! Тепенрь ты можешь использовать магию, если она будет сильнее меча!\n" +
                        "1. Двигаться дальше по пещерам",1, 0, 0, 20, 0, 0, 0);
        start_story.direction[1].direction[2].direction[1].direction[0].direction[1].direction[0].direction[2].direction[0].direction[0].direction[0] = new Situation("Ты выбрался",
                "Наконец-то! Ты покинул Хелген! Но впереди еще много дел! Да пусть ведет тебя дорога приключений!", 0, 0, 0, 0, 0, 0, 0);
        current_situation = start_story;
    }
    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Ошибочка! Вы можете выбирать только из "
                    + current_situation.direction.length + " вариантов");
    }
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }

}
