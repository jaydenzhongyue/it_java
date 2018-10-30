class Animal {
    // 定义成员变量
    private String name;
    private int age;
    private String color;

    // 构造方法
    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 成员方法
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
        System.out.println("该吃饭了！");
    }
}

// 定义Dog类
class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void lookDoor() {
        System.out.println("狗在看门！");
    }
}

// 定义Cat类
class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void playGame() {
        System.out.println("猫在捉老鼠！");
    }
}

class Extends {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("tom");
        d.setAge(1);
        d.setColor("red");
        System.out.println("狗的名字是：" + d.getName() + " 年龄是：" + d.getAge() + " 颜色是" + d.getColor());
        d.eat();
        d.lookDoor();

        System.out.println("------------------");
        // 方式二，带参的调用
        Dog d1 = new Dog("kitty", 2, "green");
        System.out.println("狗的名字是：" + d1.getName() + "年龄是：" + d1.getAge() + "颜色是" + d1.getColor());

    }
}