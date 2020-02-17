# Tипове данни и променливи

Java е статично типизиран език, всички променливи трябва да бъдат декларирани преди да бъдат използвани и типът на дадена променлива се фиксира в декларацията ѝ и не може да се променя
Декларацията включва името и типа и може да е съчетана или не с инициализация

- декларация
```Java
int a, b;
```
- инициализация (присвояване на стойност)
```Java
a = 1234;
b = 99;
```
- комбиниране на декларация и инициализация
```Java
int c = a + b;
```
Примитивни типове
- Булев тип
- Числени типове
  - Целочислени типове
  - Типове за числа с плаваща запетая
- Reference типове


## Примитивни типове данни
Тип данни	| Размер	| Минимум	| Максимум | Минимална стойност | Максимална стойност
--|--|--|--|--|--|
boolean |	- |	- |	- | - | -
byte |	8 | бита |	-128	| +127 | Byte.MIN_VALUE | Byte.MAX_VALUE
char |	16 | бита |	Unicode 0	 | Unicode 2^16 - 1 | (int) Character.MIN_VALUE | Character.MAX_VALUE 
short |	16 | бита |	-215 | +2^15 - 1 | Short.MIN_VALUE | Short.MAX_VALUE
int |	32 бита |	-2^31 |	+2^31 - 1 | Integer.MIN_VALUE | Integer.MAX_VALUE
long | 64 бита | -263 | +263 - 1 | Long.MIN_VALUE | Long.MAX_VALUE
float | 32 бита | IEEE754 | IEEE754 | - | -
double | 64 бита | IEEE754 | IEEE754 | - | -
void | - | - | - | - | - 

## Литерали (стойности) на примитивните типове 

```Java
int i = 1;           // int by default
long l = 1L;         // L or l
double d = 0.1;      // d or D is optional
double d2 = 1e-1;    // same, in scientific
float f = 0.1f;       // will not compile, why?
char c = 'A';
char c2 = '\u0041';  // again, 'A'
```

# Reference типове

## String класа за низове, всяка промяна на низ води до създаване на нов String обект, а стария остава непроменен.

- разделяне на ноз на под низове метода split
```
String str1 = "Current year is 2020";
 
String[] tokens = str1.split(" "); // разделител – интервал
 
// tokens = ["Current", "year", "is", "2020"]
 
int year = Integer.parseInt(tokens[3]); 
// year == 2019
```

## if-else
```Java
if (booleanExpression) {
    // statements
}
 
if (booleanExpression) {
    // statements
} else {
    // statements
}
```
## Итерация - while
```Java
while (booleanExpression) {
    statement
}
```
## Итерация - do-while
```Java
do {
    statement
} while (booleanExpression);
```
## Итерация - for
```Java
for (initialization; booleanExpression; step) {
    statement
}
```

## Switch
```Java
switch (selector) {
    case value1 : statement; break; 
    case value2 : statement; break; 
    case value3 : statement; break; 
    // [... ]
    default: statement; 
}
```

## Масиви
```Java
int[] a;     // preferred syntax
int a[];     // also valid
 
// explicit initialization
// can be done only during declaration
int[] a = {1, 2, 3, 4};
 
int[] b = new int[7];
b.length;
```

## Многомерни масиви
```Java
int[][] a;
a = new int[3][4];
 
int[][] b = {
    { 1, 0, 12, -1 },
    { 7, -3, 2, 5 },
    { -5, -2, 2, -9 },
};
```

# Методи
```Java
public static double sqrt(double c) {
  	if(c < 0) 
      return Double.NaN;
    double err = 1e-15;
    double t = c;
    while(Math.abc(t - c/t) > err * t)
      t = (c/t + t) / 2.0;
    return t;
}
```



