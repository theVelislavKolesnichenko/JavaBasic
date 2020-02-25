# Java ООП

## Методи с променлив брой аргументи

static void funWithVarargs(int... a) {
    System.out.println("Number of arguments: " + a.length); 

    for (int i : a) {
        System.out.print(i + " "); 
    } 
}

## Ключовата дума this

Референция към текущия обект

```java
public class Human {
 
    private String name;
 
    public Human() {
        // Извикване на overload-натия конструктор със String параметър
        this("Unknown");
    }
 
    public Human(String name) {
        // Достъпване на член-променлива, скрита от едноименен параметър
        this.name = name;
    }
 
    public void whoAmI() {
        System.out.println("My name is " + name);
    }
}
```

## Пакети

- Всеки клас има достъп по подразбиране (имплицитно) до:
  - класовете от собствения си пакет
  - класовете в пакета java.lang
- Ако искаме клас да има достъп до клас в някой друг пакет, трябва експлицитно да го заявим с import декларация, която поставяме над декларацията на класа.

```java
import java.util.Scanner;
 
public class StringUtils {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
  
        String string = scanner.nextLine(); 
        System.out.println("You entered string " + string); 
  
        int number = scanner.nextInt(); 
        System.out.println("You entered integer " + number); 
  
        float num = scanner.nextFloat(); 
        System.out.println("You entered float " + num); 
    }
}
```

## Модификатори за достъп

За член-променливи и методи на клас

| Modifier    | Class             | Package                  | Subclass                 | World                    |
| ----------- |:-----------------:|:------------------------:|:------------------------:|:------------------------:|
| public      | yes               | yes                      | yes                      | yes                      |
| protected   | yes               | yes                      | yes                      | no                       |
| no modifier | yes               | yes                      | no                       | no                       |
| private     | yes               | no                       | no                       | no                       |


