// exercise07.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int main()
{
	system("chcp 1251");

	int x1 = 0,
		y1 = 0,
		x2 = 0,
		y2 = 0;
	
	cout << "Последовательно введите координату 1 [x1, y1]: " << endl;
	cout << "x1: [1-8] ";
	cin >> x1;
	if (x1 < 1 || x1 > 8) {
		cout << "Недопустимый диапазон для x1" << endl;
	}
	cout << "y1: [1-8] ";
	cin >> y1;
	if (y1 < 1 || y1 > 8) {
		cout << "Недопустимый диапазон для y1" << endl;
	}

	cout << "Последовательно введите координату 2 [x2, y2]: " << endl;
	cout << "x2: [1-8] ";
	cin >> x2;
	if (x2 < 1 || x2 > 8) {
		cout << "Недопустимый диапазон для x2" << endl;
	}
	cout << "y2: [1-8] ";
	cin >> y2;
	if (y2 < 1 || y2 > 8) {
		cout << "Недопустимый диапазон для y2" << endl;
	}

	if ((x1 + y1) % 2 == (x2 + y2) % 2) {
		cout << "Фигуры принадлежат одному цветовому полю" << endl;
	}
	else {
		cout << "Фигуры НЕ принадлежат одному цветовому полю" << endl;
	}

    return 0;
}

