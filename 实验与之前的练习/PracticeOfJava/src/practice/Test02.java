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
        System.out.println("�˶���Ҫ˯����");
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
        System.out.println("�����˶�Ա��ţ�⣬��ţ��");
    }

    void learn() {
        System.out.println("�����˶�Աѧϰ��������Ͷ��");
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
        System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
    }

    void learn() {
        System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
    }
    public void SpokenEnglish() {
        System.out.println("ƹ�����˶�Ա˵Ӣ��");
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
        System.out.println("������������⣬������");
    }

    void teach() {
        System.out.println("�����������������Ͷ��");
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
        System.out.println("ƹ���������С�ײˣ��ȴ�����");
    }

    void teach() {
        System.out.println("ƹ�����������η���ͽ���");
    }

    public void SpokenEnglish() {
        System.out.println("ƹ�������˵Ӣ��");
    }
}
