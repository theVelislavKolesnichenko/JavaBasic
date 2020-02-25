# Java ООП

## Методи с променлив брой аргументи

```java
static void funWithVarargs(int... a) {
    System.out.println("Number of arguments: " + a.length); 

    for (int i : a) {
        System.out.print(i + " "); 
    } 
}
```
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


## Енкапсулация

- Множеството текущи стойности на член-данните на даден обект се наричат негово състояние
- Само вътрешните методи на даден обект имат достъп до неговото състояние, като правят невъзможни неочакваните промени на състоянието от външния свят.
- В Java се постига чрез модификаторите за достъп.

Пример:

## Наследяване

- Позволява преизползване и разширяване на състояние и поведение на вече съществуващи класове
- Когато клас наследява друг клас, за него казваме, че е наследник, или дете или подклас, а вторият клас наричаме родител, или базов клас или суперклас
- В Java се реализира с ключовата дума extends
- Класът-наследник получава достъп до всички public и protected член-променливи и методи на родителския клас
- Класът-наследник може да предостави собствена дефиниция на (т.е. да предефинира) методи на родителския клас (method overriding).
- Модификаторът за достъп на метод в класа–наследник трябва да съвпада или да разширява модификатора за достъп на метода в родителския клас (но не може да я свива/ограничава)
- Java не поддържа множествено наследяване

## Ключовата дума super
- Референция към прекия родител на обекта
- Употребява се за:
    - достъпване на член-променливи на родителя
    - извикване от конструктор в текущия клас на конструктор в родителския клас
    - извикване на произволен метод на родителския клас
    - Неявно се подава като параметър на всеки конструктор и метод на класа
    - Не нарушава енкапсулацията - през super може да достъпим само public и protected членове на родителския клас
    
## Йерархията от класове в Java
- Всички класове в Java са (преки или косвени) наследници на класа java.lang.Object
- Липсата на множествено наследяване означава, че всеки клас има точно един родител (с изключение на един-единствен клас, java.lang.Object, който няма родител).
- Йерархията от класове е дърво, с java.lang.Object в корена

```java
boolean equals(Object obj)
int hashCode()
String toString()
Object clone()
```
## Операторът instanceof

Използва се за type checking на референтните типове - дали даден обект е инстанция на даден клас

## Ключовата дума final
- в декларация на променлива -> прави я константа
- в декларация на метод -> методът не може да се override-ва
- в декларация на клас -> класът не може да се наследява

## Полиморфизъм
- ООП - наследниците на даден клас споделят поведение от родителския клас, но могат да дефинират и собствено поведение
- Всички Java обекти са полиморфични, понеже всеки обект наследява Object класа

## Method overriding vs method overloading
- *Overriding* - класът-наследник предефинира поведението на класа-родител
- *Overloading* - класът декларира методи с едно и също име и различен брой и/или тип параметри

<table>
  <tr>
    <th></th>
    <th style="font-size:0.7em">Overloading</th>
    <th style="font-size:0.7em">Overriding</th>
  </tr>
  <tr style="font-size:0.7em">
    <td>Кога</td>
    <td>Compile-time</td>
    <td>Runtime</td>
  </tr>
  <tr style="font-size:0.7em">
    <td>Къде</td>
    <td>В същия клас</td>
    <td>В класовете - наследници</td>
  </tr>
  <tr style="font-size:0.7em">
    <td>Runtime performance</td>
    <td>Better</td>
    <td></td>
  </tr>
  <tr style="font-size:0.7em">
    <td>Return type</td>
    <td>Може да бъде различен</td>
    <td>Запазва се</td>
  </tr>
  <tr style="font-size:0.7em">
    <td>static, private & final methods</td>
    <td>Да</td>
    <td>Не</td>
  </tr>
  <tr style="font-size:0.7em">
    <td>Binding</td>
    <td>Статично</td>
    <td>Динамично</td>
  </tr>
  <tr style="font-size:0.7em">
    <td>Списък от аргументи</td>
    <td>Различен</td>
    <td>Запазва се</td>
  </tr>
</table>



