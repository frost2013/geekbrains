// exercise06.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int main()
{
	system("chcp 1251");

	int age = 0;
	int tmp = 0;

	cout << "Введите, пожалуйста, свой возраст: [1-150] ";
	cin >> age;

	if (age < 1 || age > 150) {
		cout << "Вы ввели возраст вне указанного диапазона" << endl;
	}
	else {
		if (age % 100 > 10 && age % 100 < 20) {
			cout << "Вам [" << age << "] лет" << endl;
		}
		else {
			tmp = age % 10;
			if (tmp == 1) {
				cout << "Вам [" << age << "] год" << endl;
			}
			if (tmp >= 2 && tmp <= 4) {
				cout << "Вам [" << age << "] года" << endl;
			}
			if (tmp == 0 || tmp >= 5) {
				cout << "Вам [" << age << "] лет" << endl;
			}
		}
	}

    return 0;
}

