// exercise04.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int main()
{
	system("chcp 1251");

	double a = 1,
		b = -26,
		c = 120,
		d = 0,
		x1 = 0,
		x2 = 0;

	cout << "Вычисляем корень квадратного уравнения вида: ax^2 + bx + c = 0." << endl;
	cout << "Вычислим корень на примере коэффициентов: a=[" << a << "], b=[" << b << "], c=[" << c << "]" << endl;

	d = sqrt(b * b - 4 * a * c);
	x1 = (-1 * b + d) / (2 * a);
	x2 = (-1 * b - d) / (2 * a);

	cout << "Найдено решение: x1=[" << x1 << "], x2=[" << x2 << "]" << endl;

	cout << "Хотите сами ввести коэффициенты? [0 - Нет, 1 - Да] ";
	cin >> d;
	if (d == 1) {
		cout << "Требуется ввести коэффициенты уравнения." << endl;

		cout << "Введите коэффициент a: ";
		cin >> a;
		cout << "Введите коэффициент b: ";
		cin >> b;
		cout << "Введите коэффициент c: ";
		cin >> c;

		d = sqrt(b * b - 4 * a * c);
		x1 = (-1 * b + d) / (2 * a);
		x2 = (-1 * b - d) / (2 * a);

		cout << "Найдено решение: x1=[" << x1 << "], x2=[" << x2 << "]" << endl;
	}

    return 0;
}

