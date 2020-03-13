package practice;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TableTennisAthlete tableTennisAthlete = new TableTennisAthlete();
        tableTennisAthlete.name=scanner.next();
        tableTennisAthlete.age=scanner.nextInt();
        BasketballAthete basketballAthete = new BasketballAthete();
        basketballAthete.name = scanner.next();
        basketballAthete.age = scanner.nextInt();
        TableTennisCoach tableTennisCoach = new TableTennisCoach();
        tableTennisCoach.name=scanner.next();
        tableTennisCoach.age=scanner.nextInt();
        BasketballCoach basketballCoach = new BasketballCoach();
        basketballCoach.name=scanner.next();
        basketballCoach.age=scanner.nextInt();
        System.out.println(tableTennisAthlete);
        tableTennisAthlete.show();
        System.out.println(basketballAthete);
        basketballAthete.show();
        System.out.println(tableTennisCoach);
        tableTennisCoach.show();
        System.out.println(basketballCoach);
        basketballCoach.show();
    }
}

abstract class People {
    String name;
    int age;

    abstract void eat();

    public void sleep() {
        System.out.println("人都是要睡觉的");
    }

    @Override
    public String toString() {
        return name + "---" + age;
    }
}

abstract class Athlete extends People {
    abstract void learn();
}

abstract class Coach extends People {
    abstract void teach();
}

interface EnglishLearning {
    void SpokenEnglish();
}

class BasketballAthete extends Athlete {
    public void show() {
        sleep();
        eat();
        learn();
        System.out.println("----------------");
    }

    void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }

    void learn() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}

class TableTennisAthlete extends Athlete implements EnglishLearning {
    public void show() {
        sleep();
        eat();
        learn();
        SpokenEnglish();
        System.out.println("----------------");
    }

    void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    void learn() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }
    public void SpokenEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}

class BasketballCoach extends Coach {
    public void show() {
        sleep();
        eat();
        teach();
        System.out.println("----------------");
    }

    void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }

    void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }
}

class TableTennisCoach extends Coach implements EnglishLearning {

    public void show() {
        sleep();
        eat();
        teach();
        SpokenEnglish();
        System.out.println("----------------");
    }
    void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    public void SpokenEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
