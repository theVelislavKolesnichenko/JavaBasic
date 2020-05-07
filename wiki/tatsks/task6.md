# Задача

I. Да се състави интерфейс ILibraryBook за обслужване на библиотечна книга:

- Методи:
  - Книга се заема от читателя аргумент: void get(Reader rdr);
  - Книга се връща: void ret();

II. Да се състави интерфейс IReader за обслужване на читател:
Читателя заема (get)/освобождава (ret) книгата(аргумент)

III. Да се състави клас Applicant скрити членове:

1. Скрити (Защитени) членове име, дата на постъпване в университет, успех:
- име : String
- дата на раждане : GregorianCalendar
- успех : double

- Конструктор:
  - public Applicant(GregorianCalendar birth, String name, double uspeh)
- Методи : get/set toString

IV. Да се състави клас Student, наследник на Applicant имплементиращ Comparable скрити членове:
- фак. номер : String
- Конструктори:
  - public Student(String name, String f_nom)
  - public Student(GregorianCalendar date, String name, double uspeh, String f_nom) {
- Методи : 
  - get/set toString equals

V. Да се състави клас Reader, наследник на Student, имплементиращ интерфейс IReader,Comparable:

1. Експлицитни конструктори:
- public Reader(String nm,String fn)
- public Reader(GregorianCalendar date, String name, double uspeh, String f_nom)

2. Методи четене/запис еквивалентност и стрингова интерпретация:
- get/set,toString()

VI. Да се състави клас LibraryBook, имплиментиращ ILibraryBook,Comparable:
- public class LibraryBook implements ILibraryBook,Comparable

1. Частни членове:
- Читател : Reader
- Име на книга: String
- Статус: boolean
2. Експлицитни конструктори
- public LibraryBook(String bn)
- public LibraryBook(String bn,boolean st)
3. Методи четене/запис,за сравнение и стрингова интерпретация:

VII. Да се състави клас Main с главна функция:

1. Създава List (да се използва клас ArrayList) от обекти от VI с файл:
формат
<име_на_книга1> <име_на_книга2>...
Примерно съдържание:
Books.txt
book0
book1
2. Симулира заемане1 от библиотека,Извежда;
3. Симулира заемане2 от библиотека,Извежда;
4. Сортира, извежда
5. Проверява за еквивалентност, извежда