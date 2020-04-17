1.	Създаване на проект в eclipse

a.	Стартирате eclipse от изпълнимия файл
 
 ![image](https://user-images.githubusercontent.com/10382663/79543228-c1e95c00-8095-11ea-8572-b005dd51f9af.png)

b.	Избирате workspace – работно пространство, папка в която ще се съхраняват проектите и натиснете Launch
 
 ![image](https://user-images.githubusercontent.com/10382663/79543231-c4e44c80-8095-11ea-865a-fa66439a85f7.png)

c.	Изключете Welcome screen
 
 ![image](https://user-images.githubusercontent.com/10382663/79543237-c746a680-8095-11ea-9c1f-6c52d523f8a9.png)

d.	Проекта се създава от File -> New->Project…
 
 ![image](https://user-images.githubusercontent.com/10382663/79543272-d6c5ef80-8095-11ea-8606-2604931d84d9.png)

e.	От отвореният прозорец се избира wizard – Java Project
 
![image](https://user-images.githubusercontent.com/10382663/79543276-d9284980-8095-11ea-9b03-5511e4f635c8.png) 

f.	В отворилия се wizard се попълва името на проекта (FirstJavaProject)
 
 ![image](https://user-images.githubusercontent.com/10382663/79543280-dc233a00-8095-11ea-93ea-3c8e898539d4.png)

g.	Ново създадения проект се намира в Package Explorer от лявата страна на работния прозорец
 
 ![image](https://user-images.githubusercontent.com/10382663/79543285-de859400-8095-11ea-89ef-36a05cf31db2.png)
 
2.	Създаване на java source файлове
a.	Разгъвате проекта от Package Explorer. В папката JRE System Library се намират системните библиотеки за работа с Java. Папката src съхранява source файловете с Java програмния код.
 
 ![image](https://user-images.githubusercontent.com/10382663/79543296-e2191b00-8095-11ea-91aa-f9109cb086ff.png)

b.	С десен бутон на мишката върху папката src се отваря контекстно меню, за създаване на нови файлове се избира New->Class – създава клас файл
 
c.	В новопоявилия се прозорец се създава нов source файл
-	Source folder е папката е проекта за файловете с програмен код
-	Package е под папка в Source folder където ще се съхраняват файловете – пакета носи името на организацията която създава проекта. Като има формат на url адрес в обратен ред. Този адрес може да се ползва в последствие за отдалечен достъп до проекта.
-	Name е името на файла. Имената на файловете и имената на класовете в тях трябва да съвпадат. Конвенцията в Java определя имената на класовете да са с големи букви.
-	Modifiers e модификатора за достъп до класа
-	Superclass е родителския клас.
-	Interfaces за имплементиране на интерфейси, не е задължително при създаването на нов клас
-	public static void main(String[] args) чекбокса за автоматично генериране на main метод

![image](https://user-images.githubusercontent.com/10382663/79543299-e5aca200-8095-11ea-917a-34ac4dc65fc0.png)
 
d.	Само един клас в проекта трябва да има main метод това ще е входната точка към проекта.
 

3.	Дефиниране на клас
Дефинирайте клас Bank Account:

a.	Защитени полета, конвенцията в Java определя имената на променливите да започва с малка буква, ако се състой от повече от една дума, всяка следваща да започва с голяма буква.

i.	id: int

ii.	balance: double

```java
package bg.tu_varna.java;

public class BankAccount {
	private int id;
	private double balance;
}
```

b.	Създаване на Getters и Setters – това са методи за достъп до стойностите на полетата

i.	Getters – метод за извличане стойностите

ii.	Setters – метод за поставяне на стойност

```java
package bg.tu_varna.java;
public class BankAccount {
	private int id;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
```

c.	Създаване на методи за депозит и теглене

i.	deposit(double amount): void

ii.	withdraw(double amount): void

```java
package bg.tu_varna.java;

public class BankAccount {
	private int id;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
```

d.	Override на метода toSting()

```java
package bg.tu_varna.java;

public class BankAccount {
	private int id;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	@Override
	public String toString() {
		return "ID: " + this.id + " Balance" + this.balance;
	}
}
```

e.	Създаване на App клас който да тества класа BankAccaunt с меню за:

i.	Създаване по id – ако се опитва да се създаде акаунт със съществуващо id да се изпише „Акаунт вече съществува“

ii.	Депозит по id и сума – ако се добавяте в не съществуващ акаунт да се изпише „Акаунтът не съществува“ 

iii.	Теглене по id и сума - ако се тегли от не съществуващ акаунт да се изпише „Акаунтът не съществува“. Ако се тегли сума с по голяма стойност от наличната да изпише „Недостатъчен баланс“

iv.	Извеждане по id

v.	Изход
 
```java
package bg.tu_varna.java;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Създаване на колекция с ключ и стойност за съхранение на акауните
		HashMap<Integer, BankAccount> accounts = new HashMap<Integer, BankAccount>();
		
		// Създаване на цикъл за въвеждане
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		while (!command.equals("End")) {
			String[] cmdArgs = command.split("\\s+");
			// Проверка на въведената команда
			String cmdType = cmdArgs[0];
			switch (cmdType) {
			case "Create":
				exexCreate(cmdArgs, accounts);				
				break;
			case "Deposit":
				exexDeposit(cmdArgs, accounts);				
				break;
			case "Withdraw":
				exexWithdraw(cmdArgs, accounts);				
				break;
			case "Print":
				exexPrint(cmdArgs, accounts);				
				break;
			}
			
			command = scanner.nextLine();
		}
	}

	private static void exexPrint(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		if(!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
		} else {
			System.out.println(accounts.get(id));
		}		
	}

	private static void exexWithdraw(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		int withdraw = Integer.valueOf(cmdArgs[2]);
		if(!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
		} else if(accounts.get(id).getBalance() < withdraw) {
			System.out.println("Insufficient balances");
		} else {
			accounts.get(id).withdraw(withdraw);
		}
	}

	private static void exexDeposit(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		int deposit = Integer.valueOf(cmdArgs[2]);
		if(!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
		} else {
			accounts.get(id).deposit(deposit);
		}
	}

	private static void exexCreate(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		if(accounts.containsKey(id)) {
			System.out.println("Account already exists");
		} else {
			BankAccount account = new BankAccount();
			account.setId(id);
			accounts.put(id, account);
		}
	}
}
```