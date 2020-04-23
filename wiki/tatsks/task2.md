# Задача

1. Да се състави интерфейс IEMail с методи за сравняване на текстови съобщения:
- public int compareToId(String id);
- public int compareToMessage(String mess);

2. Да се състави абстрактен клас EMailMessage
с член променлива String strEMailMessage;
- Конструктори:
  - по подразб.
  - експлицитен
- Абстрактни методи:
  - setEMailMessage(String mess); // изпращане на съобщение
  - getEMailMessage(); // получаване на съобщение
3. Да се състави публичен клас EMailImpl наследник на EMailMessage имплементира IEMail, Comparable
- Частни:
  - номер - число
  - идентификационен низ
  - пощенски Провайдер низ
  - съобщение низ

- Конструктори
  - num,id,provider, mess
  - по общ стринг, напр:

**Пример**
```
1-name1@yahoo.com:=abcd trs bak

-, @, := са разделители на елементите
```

- Методи:
  - set/get
  - създава стринг по параметрите: num,id,provider,mess
  - сравнител по идентиф. сравнител по съобщ. -compareTo()
  - стрингова интерпретация: toString()
  - за равенство: equals()

4. Да се добави клас PostBox за съхраняване на колекции от писма (EMailImpl) 
- Частни членове от тип Collection: 
  - inColl - за входните писма;
  - outColl – за изходните.
Конструктор-създава ArrayList имплементации на колекциите.
Методи:
- за получаване на членовете - getIn, getOut;
- за сортиране на входната колекция по идентификатор - providerIdSort() - връща сортиран списък List<EMailImpl>
- за сортиране на входната колекция по текста на съобщението - messageSort() - връща сортиран списък List<EMailImpl>
- за запълване на изходната колекция от подадена като параметър колекция fillOut(Collection<EMailImpl> fromColl);

5. Главна функция
- създава обект от PostBox;
- зарежда го с даннии:
```
7-AliBaba@yahoo.bg:=aTest Message 1
2-AliBaba1@abv.bg:=cvTest Message 2
3-AliBaba2@gmail.bg:=tyTest Message 3
4-asdbaasdtkir3@abv.bg:=aaTest Message 4
5-baasdtkir4@post.bg:=baTest Message 5
6-asdAliBaba5@abv.bg:=aiTest Message 6
```
- Сортира по Id, извежда;
- Сортира по Text, извежда;
- Зарежда изходната колекция от входната;
