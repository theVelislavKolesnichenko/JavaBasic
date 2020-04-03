# Wrapper types

Wrapper types - представляват референтни аналози (класове) на примитивните типове
Използват се:
- Където синтаксисът на езика изисква обект, а не примитивен тип
- Когато ни трябват константи или помощни функции, които са имплементирани в съответния wrapper клас
Имплицитно се конвертират към съответния си примитивен тип, и обратно

## Примитивни типове и wrapper типове
|Тип данни |Размер |Минимум |Максимум |Wrapper
|-|-|-|-|-|
boolean |- |- |-| Boolean
char | 16 бита |Unicode 0 |Unicode 2<sup>16</sup> - 1 |Character
byte |8 бита |-128 |+127 |Byte
short |16 бита |-2<sup>15</sup> |+2<sup>15</sup> - 1 | Short
int	| 32 бита |-2<sup>31</sup> | +2<sup>31</sup> - 1 |Integer
long |64 бита |-2<sup>63</sup>	| +2<sup>63</sup> - 1 |	Long
float |32 бита |IEEE754 |IEEE754 |Float
double |64 бита |IEEE754 |IEEE754 |Double
void |- |- |- |Void

**Примери**

```java
Integer.MAX_VALUE; // Максимална стойност на int
Integer.MIN_VALUE; //минимална стойност на int
new Integer(25).intValue(); //Създаване на Integer обект и извличане на стойноста му.
String s = "15";
Integer.parseInt(s); //Преобразуване на String в число
```

Autoboxing
```java
char c = 'a'; // примитивен типове

Character ch1 = new Character('a'); //wrapper калс


Character ch2 = 'x'; // autoboxing: char неявно се превръща в Character

char c2 = ch1; // character  неявно преобразуван в char
```
