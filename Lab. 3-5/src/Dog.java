public class Dog 
{
    private int weight;   // Вес кота
    private String name;  // Имя кота 
    private String color; // Цвет кота

    public void eat() // Собака ест
    {
        System.out.print("Eating...\n");
    }

    public void sleep() // Собака ест
    {
        System.out.print("Sleeping zZzzZZz..\n");
    }

    public String speak(String words) // Собака говорит
    {
        return words + " gaw...\n";
    }
}