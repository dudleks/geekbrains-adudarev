package com.gb.adudarev.level2.lesson1;


/*
        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/
public class MainClassLevel2Lesson1 {

    public static void main(String[] args) {
        Champions[] champions = {new Cat("Барсик", 400, 30), new Robot("Bender", 300, 40), new Human("Alexey", 100, 90)};

        Blockage[] blockages = {new RunRoad(400), new Wall(40)};

        for (int i = 0; i < champions.length; i++) {
            for (int j = 0; j < blockages.length; j++) {
                blockages[j].doIt(champions[i]);
                if (!champions[i].isOnDistance()) {
                    break;
                }
            }
        }

    }
}
