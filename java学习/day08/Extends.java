class Animal {
    // �����Ա����
    private String name;
    private int age;
    private String color;

    // ���췽��
    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // ��Ա����
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("�óԷ��ˣ�");
    }
}

// ����Dog��
class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void lookDoor() {
        System.out.println("���ڿ��ţ�");
    }
}

// ����Cat��
class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void playGame() {
        System.out.println("è��׽����");
    }
}

class Extends {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("tom");
        d.setAge(1);
        d.setColor("red");
        System.out.println("���������ǣ�" + d.getName() + " �����ǣ�" + d.getAge() + " ��ɫ��" + d.getColor());
        d.eat();
        d.lookDoor();

        System.out.println("------------------");
        // ��ʽ�������εĵ���
        Dog d1 = new Dog("kitty", 2, "green");
        System.out.println("���������ǣ�" + d1.getName() + "�����ǣ�" + d1.getAge() + "��ɫ��" + d1.getColor());

    }
}