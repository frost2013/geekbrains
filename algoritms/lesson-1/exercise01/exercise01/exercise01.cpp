// exercise01.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int main()
{
	system("chcp 1251");
	cout << endl;

	double weight = 0, height = 0;
	cout << "¬ведите своей вес: [кг.] ";
	cin >> weight;
	cout << "¬ведите свой рост: [м.] ";
	cin >> height;

	cout << "¬аш вес [" << weight << "] и ваш рост [" << height << "]" << endl;
	cout << "¬аш индекс массы: [" << (weight / (height * height)) << "]" << endl;

    return 0;
}

