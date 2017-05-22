// exercise.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int Menu()
{
	int menuItem = 0;

	cout << "Главное меню программы:" << endl;
	cout << "[1] Задание 1" << endl;
	cout << "[2] Задание 2" << endl;
	cout << "[3] Задание 3" << endl;
	cout << "[4] Задание 4" << endl;
	cout << "[5] Задание 5" << endl;
	cout << "[6] Задание 6" << endl << endl;
	cout << "[0] Выйти из программы" << endl << endl;

	cout << "Введите пункт меню: ";
	cin >> menuItem;

	return menuItem;
}

void exercise01()
{
	cout << "Задание: ввести a и b и вывести квадраты и кубы чисел от a до b." << endl  << endl;
	int a = 0,
		b = 0;
	cout << "Введите число a: ";
	cin >> a;
	cout << "Введите число b: ";
	cin >> b;

	for (int iter = a; iter <= b; iter++) {
		cout << "Число [" << iter << "]. Квадрат числа = [" << (iter * iter) << "]. Куб числа = [" << (iter * iter * iter) << "]" << endl;
	}

	cout << endl;
}

void exercise02()
{
	cout << "Задание: даны целые положительные числа N и K. Используя только операции сложения и вычитания, " << endl
		<< "найти частное от деления нацело N на K, а также остаток от этого деления." << endl << endl;

	int n = 148;
	int k = 12;
	int division = 0;
	int remainder = n;

	cout << "Число N: [" << n << "]" << endl;
	cout << "Число K: [" << k << "]" << endl;

	while (remainder >= k)
	{
		division++;
		remainder -= k;
	}

	cout << "Частное от деления: [" << division << "]" << endl;
	cout << "Остаток от деления: [" << remainder << "]" << endl;

	cout << endl;
}

void exercise03()
{
	cout << "Задание: дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления определить, имеются ли в записи числа N нечетные цифры." << endl
		<< "Если имеются, то вывести True, если нет — вывести False." << endl << endl;

	int n = 254;
	int remainder = n;
	bool result = false;

	cout << "Дано число: [" << n << "]" << endl;

	while (n >= 0 && result == false)
	{
		remainder = n % 10;
		if (remainder % 2 == 1) {
			result = true;
		}
		n = (int)(n / 10);
	}

	if (result)
	{
		cout << "Наличие в числе нечетных чисел: [Да]" << endl;
	}
	else
	{
		cout << "Наличие в числе нечетных чисел: [Нет]" << endl;
	}

	cout << endl;
}

void exercise04()
{
	cout << "Задание: с клавиатуры вводятся числа, пока не будет введен 0." << endl
		<< "Подсчитать среднее арифметическое всех положительных четных чисел, оканчивающихся на 8." << endl << endl;

	int count = 0;
	int summ = 0;
	int input = 0;

	do
	{
		cout << "Введите целое число: [*8] ";
		cin >> input;

		if (input % 10 == 8)
		{
			summ += input;
			count++;
		}

	} while (input != 0);

	if (count == 0)
	{
		cout << "Не было введено ни одного числа, соответствующего требованиям." << endl;
	}
	else
	{
		cout << "Введено = [" << count << "] чисел, сумма = [" << summ << "]. Среднее арифметические = [" << (double)(summ / count) << "]" << endl;
	}

	cout << endl;
}

void exercise05()
{
	cout << "Задание: написать функцию нахождения максимального из трех чисел." << endl << endl;

	int max = 0;
	int countNumbers = 3;
	int input = 0;

	cout << "Нужно ввести " << countNumbers << " числа." << endl;

	for (int iter = 0; iter < countNumbers; iter++) {
		cout << "Введите число[" << iter << "]: ";
		cin >> input;

		if (iter == 0)
		{
			max = input;
		}
		else if (max < input)
		{
			max = input;
		}
	}

	cout << "Максимальное из " << countNumbers << " чисел = [" << max << "]" << endl;

	cout << endl;
}

void exercise06()
{
	cout << "Задание: Написать функцию, генерирующую случайное число от 1 до 100." << endl << endl;

	cout << "а) с использованием стандартной функции rand()" << endl;
	srand(100);

	for (int iter = 0; iter < 5; iter++)
	{
		cout << "Номер по счету [" << iter << "] = [" << (rand() % 100) << "]" << endl;
	}
	cout << endl << "б) без использования стандартной функции rand() (пример с теории)" << endl;
	int x = 1;
	int a = 2;
	int b = 3;
	int m = 100;

	for (int iter = 0; iter < 5; iter++)
	{
		x = (a * x + b) % m;
		cout << "Номер по счету [" << iter << "] = [" << x << "]" << endl;
	}

	cout << endl;
}

int main()
{
	system("chcp 1251");

	cout << "Автор программы: Ковалышев Михаил.\n\n" << endl;
	int commandExit = 0;
	int command = 0;

	do {
		command = Menu();
		switch (command)
		{
		case 1:
			exercise01();
			break;
		case 2:
			exercise02();
			break;
		case 3:
			exercise03();
			break;
		case 4:
			exercise04();
			break;
		case 5:
			exercise05();
			break;
		case 6:
			exercise06();
			break;
		default:
			break;
		}
	} while (command != commandExit);

	return 0;
}