# Колекции

## Структори от данни

- Хранилища за данни
- Основни операции
  - добавяне
  - триене
  - търсене
  - обхождане

## Масиви - предимства

|предимства|недостатъци|
|-|-|
пределно прост "интерфейс" | добавянето или изтриването на елемент (с изключение на последна позиция) е скъпа операция|
най-ефективни от гледна точка на използвана памет* | размерът им е фиксиран при инициализацията|
бърз достъп на елемент по индекс: O(1) | търсенето на елемент по стойност е бавно: О(N) за произволен масив O(logN) за сортиран масив

## Класа Arrays

Arrays дефинира методи за работа с масиви

Arrays.fill - метод за запълване на масиви е една стойност
Arrays.sort - метод за сортиране на масиви
Arrays.toString - метод за текстово представяне на масиви

## Колекции

- Java предоставя т.нар. collections framework, съдържащ интерфейси, имплементации и алгоритми върху най-използваните структури от данни
- За разлика от масивите,
    - размерът им е динамичен
    - съдържат само референтни типове
- Почти всички интерфейси и класове се намират в пакета java.util

## Итератори
- Итераторите предоставят унифициран начин за обхождане на елементите на дадена колекция.
- Колекциите (както и масивите) могат да се обхождат с foreach loop
- В java са дефинирани интерфейсите поведението на който се имплементира от всички колекции.

```java
//Интерфейси Iterable
public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}
//Интерфейси Iterable
public interface Iterable<T> {
    Iterator<T> iterator();
}
```
- Метода next() връща следващия елемент в колекцията
- Методът remove() премахва от колекцията елемента, последно върнат от next()
- Ако колекцията бъде модифицирана докато бъде итерирана, по какъвто и да е начин, различен от извикване на remove() на итератора, поведението на итератора е недефинирано води до грешка (ConcurrentModificationException)

## Основни структури от данни

- Масиви
- Свързани списъци
- Хеш таблици
- Дървета

## Предефинирани методи за работа с java.util.Collection

Collection е интерфейс, за всички колекции който го имплементират могат да се използват методите:

```java
//броя на елементите в колекцията
int size()
//Проверка дали е празна молекцията
boolean isEmpty()
//Проверка дали колекцията съдържа елемента
boolean contains(Object element)
//Добавяне на елемент в колекция
boolean add(E element)
//Премахване на елемент от колекция
boolean remove(Object element)
//Извличане на итератора на колекцията
Iterator<E> iterator()
//Проверка дали всички елементи се съдържт в колекцията
boolean containsAll(Collection<?> c)
//Докабяне на списък от обекти
boolean addAll(Collection<? extends E> c)
//Премахване на сисък от елементи
boolean removeAll(Collection<?> c)
//Премахване на всички които не присъстват в сисъка от елементи
boolean retainAll(Collection<?> c)
//Почистване на паметта към която сочи колекцията
void clear()
//Преобразуване на колекцията в масив от класа Ojbect
Object[] toArray() 
//Преoбразуване на колекцията в масив от програмно дефиниран клас
<T> T[] toArray(T[] a) 
```

## Обхождане на колекции

```java
//създаване на списък с дробни числа
List<Float> nums = Arrays.asList(4.999f, 0.271f, 7.1f, -1f);

//Обхождане чрез enhanced for-loop:
for (float current : nums) {
	System.out.printf("%.2f%n", current);
}

//Обхождане чрез итератор
Iterator<Float> iterator = nums.iterator();
while (iterator.hasNext()) {
	System.out.printf("%.2f%n", iterator.next());
}
```

## Предефинирани методи за работа с List

List е интерфейс, за всички колекции който го имплементират могат да се използват методите:

```java
boolean add(E e)
boolean contains(Object o)
E get(int index)
int indexOf(Object o)
boolean remove(Object o)
E remove(int index)
int size()
boolean isEmpty()
Object[] toArray()
List<E> subList(int fromIndex, int toIndex)
```

## Имплементации на List

- ArrayList - resize-ващ се (динамичен) масив
- LinkedList - двойно свързан списък
- Vector - resize-ващ се (динамичен) масив. Synchronized. Legacy
- Stack - наследява Vector. Legacy -> замества се от Dequeue

# Предефинирани методи за работа с Queue

Queue е интерфейс, за всички колекции който го имплементират могат да се използват методите:

```java
// Добавя елемент в края на опашката
boolean offer(E e)

// Извлича първия елемент от опашката
E peek()

// Извлича и премахва първия елемент от опашката
// Връща null ако опашката е празна
E poll()

// Премахва и извлича първия елемент от опашката
// Ако опашката е празха хвърля NoSuchElementException
E remove()
```

## Имплементации на Queue
- PriorityQueue - heap (пирамида)
- LinkedList
- ArrayDeque - resize-ващ се (динамичен) масив

## Предефинирани методи за работа с Set

Set е интерфейс, за всички колекции който го имплементират могат да се използват методите:

```java
boolean add(E e)
boolean contains(Object o)
boolean remove(Object o)
int size()
boolean isEmpty()
Object[] toArray()
```

## Имплементации на Set
- TreeSet - TreeMap. Червено-черно дърво
  - конструктори
    ```java
    TreeSet(); // natural ordering
    TreeSet(Collection<? extends E> c);
    TreeSet(Comparator<? super E> comparator);
    TreeSet(SortedSet<E> s);
    ```
- HashSet - хеш таблица
  - конструктори
    ```java
    HashSet(); // default initial capacity (16) and load factor (0.75).
    HashSet(Collection<? extends E> c);
    HashSet(int initialCapacity);
    HashSet(int initialCapacity, float loadFactor);
    ```
- LinkedHashSet - хеш таблица + свързан списък
- EnumSet - битов масив

## Операции над множества със Set

```java
    Set<String> one = new HashSet<>();
    one.add("foo");
    one.add("bar");
    Set<String> two = new HashSet<>();
    two.add("foo");
    two.add("baba");
    
    Set<String> union = new HashSet<>(one);
    union.addAll(two); // union, съюз, обединение = [baba, bar, foo]
    
    Set<String> intersection = new HashSet<>(one);
    intersection.retainAll(two); // intersection, пресичане, обща част = [foo]
    
    Set<String> difference = new HashSet<>(one);
    difference.removeAll(two); // difference, разлика, различна част  = [bar]
```

## Предефинирани методи за работа с Map

Map е интерфейс, за всички колекции който го имплементират могат да се използват методите:

- Колекция съпоставяща обект ключ към обект стойност.
- Не може да съдържа дублирани ключове.
  - При опит за добавяне на съществуващ ключ се променя стойноста

```java
    V put(K key, V value)
    V get(Object key)
    V remove(Object key)
    boolean containsKey(Object key)
    int size()
    boolean isEmpty()
    Set<K> keySet()
    Collection<V> values()
```

## Обхождане на колекции Map

```java
    // множеството от ключовете
    Set<Integer> keys = map.keySet();
    // колекция от стойностите
    Collection<String> values = map.values();
    // Set<Entry<Integer, String>> s = map.entrySet();
```
## Имплементации на Map
- HashMap - хеш таблица
- LinkedHashMap - хеш таблица + свързан списък
- EnumMap - битов масив
- TreeMap - червено-черно дърво

## Колекции с наредба vs Колекции без наредба

- TreeMap/TreeSet - червено-черни дървета. Запазват естествена наредба. Елементите трябва да имплементират интерфейса Comparable (или да се подава имплементация на Comparator). Логаритмична сложност за повечето операции
- HashMap/HashSet - хеш таблици. Нямат естествена наредба. Елементите трябва да имплементират методите hashCode() и equals(). Константна сложност за повечето операции

# Generics

```java
List list = new LinkedList();
list.add(new Integer(1)); 
Integer i = list.iterator().next(); //неможе да се опредили типа на обекта върнат от метода next()
```
- трябва експлицитно да кастваме, което е досадно

```java
List list = new LinkedList();
list.add(new Integer(1)); 
Integer i = (Integer) list.iterator().next(); //кастване към класа Integer
```
- Опасн е защото има вероятност да сгрешим в предположението си за типа и cast-ът да "гръмне" с ClassCastException по време на изпълнение
- Много по-удобно
- програмистът може да изрази намерението си да ползва определен тип и компилаторът може да гарантира коректността на програмата за този тип

## Пример

```List<E>``` - // Чете се "списък от E"

**Не-generic кутия**

```java
public class Box {
private Object value;
 
    public Object getValue() {
        return value;
    }
 
    public void setValue(Object value) {
        this.value = value;
    }
}
```

**Generic кутия**

```java
public class Box {
    private Object value;
 
    public Object getValue() {
        return value;
    }
 
    public void setValue(Object value) {
        this.value = value;
    }
}
```

## Създаване на инстанции

```java
// пълен сиснтаксис
Box<Integer> integerBox = new Box<Integer>();
// кратък синтаксис
Box<Integer> integerBox = new Box<>();
```

Конвенция за именуване на параметрите за тип:
- E - Element
- T - Type
- K - Key
- V - Value
- N - Number
- S, U, V etc. - 2-ри, 3-ти, 4-ти тип

## Generic методи
- Могат да ползват типовите параметри на класа/метода
- Могат да добавят нови параметри за тип, недекларирани от класа
- Новите параметри за тип са видими единствено за метода, който ги декларира
- Generic методите могат да са статични, нестатични или конструктори

## Пример

```java
public class Pair<K, V> {
    private K key;
    private V value;
 
    // Generic конструктор
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Generic методи
    public K getKey() { return key; }
    public void setKey(K key) { this.key = key; }
    public V getValue() { return value; }
    public void setValue(V value) { this.value = value; }
}
```

```java
//клас с общо предназначение
public class Util {
 
    // Generic статичен метод
    public static <K, V> boolean areEqual(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                   p1.getValue().equals(p2.getValue());
    }
 
}
```
```java
//Generic методи - извикване
Pair<Integer, String> p1 = new Pair<>(1, "apple");
Pair<Integer, String> p2 = new Pair<>(2, "pear");
 
// ълен синтаксис
boolean areEqual = Util.<Integer, String>areEqual(p1, p2);
 
// кратък синтаксис
areEqual = Util.areEqual(p1, p2);
```

## Generic типове и наследяване
- Integer is-a Object
- Integer is-a Number
- Double is-a Number
- Box<Integer> is-not-а Box<Number> (Техният общ родител е Object)

## Ограничени (bounded/restricted) Generic типове

Може да се специфицира, че generic тип е съвместим само с даден тип или негови наследници/имплементации (upper bound).

```java
public <T extends Number> List<T> fromArrayToList(T[] a) {
    // [...]
}
```

```java
// Ако типовете са повече от един, те се разделят с &, като в този случай
// най-много един може да бъде клас (останалите трябва да са интерфейси)
// и ако има клас, той трябва да стои първи в списъка.
// Обърнете внимание, че въпреки че Comparable е интерфейс, а не клас,
// ключовата дума е пак extends.
public <T extends Number & Comparable> List<T> anotherMethod(T[] a) {
    // [...]
}
```

## Generic и колекции

- Всички ипове колекции имат Generic еквивалент което позволява използването на предефинираните алгоритми върху колекции с програмно дефинирани обекти.
- За да могат да бъдат използвани е необходимо дефиниране на:
  - интерфейса Comparable
  - метода hashCode()
  - метода equals()

