// exercise01.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int main()
{
	system("chcp 1251");
	cout << endl;

	double weight = 0, height = 0;
	cout << "������� ����� ���: [��.] ";
	cin >> weight;
	cout << "������� ���� ����: [�.] ";
	cin >> height;

	cout << "��� ��� [" << weight << "] � ��� ���� [" << height << "]" << endl;
	cout << "��� ������ �����: [" << (weight / (height * height)) << "]" << endl;

    return 0;
}

