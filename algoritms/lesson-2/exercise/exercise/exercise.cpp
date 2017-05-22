// exercise.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int Menu()
{
	int menuItem = 0;

	cout << "������� ���� ���������:" << endl;
	cout << "[1] ������� 1" << endl;
	cout << "[2] ������� 2" << endl;
	cout << "[3] ������� 3" << endl;
	cout << "[4] ������� 4" << endl;
	cout << "[5] ������� 5" << endl;
	cout << "[6] ������� 6" << endl << endl;
	cout << "[0] ����� �� ���������" << endl << endl;

	cout << "������� ����� ����: ";
	cin >> menuItem;

	return menuItem;
}

void exercise01()
{
	cout << "�������: ������ a � b � ������� �������� � ���� ����� �� a �� b." << endl  << endl;
	int a = 0,
		b = 0;
	cout << "������� ����� a: ";
	cin >> a;
	cout << "������� ����� b: ";
	cin >> b;

	for (int iter = a; iter <= b; iter++) {
		cout << "����� [" << iter << "]. ������� ����� = [" << (iter * iter) << "]. ��� ����� = [" << (iter * iter * iter) << "]" << endl;
	}

	cout << endl;
}

void exercise02()
{
	cout << "�������: ���� ����� ������������� ����� N � K. ��������� ������ �������� �������� � ���������, " << endl
		<< "����� ������� �� ������� ������ N �� K, � ����� ������� �� ����� �������." << endl << endl;

	int n = 148;
	int k = 12;
	int division = 0;
	int remainder = n;

	cout << "����� N: [" << n << "]" << endl;
	cout << "����� K: [" << k << "]" << endl;

	while (remainder >= k)
	{
		division++;
		remainder -= k;
	}

	cout << "������� �� �������: [" << division << "]" << endl;
	cout << "������� �� �������: [" << remainder << "]" << endl;

	cout << endl;
}

void exercise03()
{
	cout << "�������: ���� ����� ����� N (> 0). � ������� �������� ������� ������ � ������ ������� �� ������� ����������, ������� �� � ������ ����� N �������� �����." << endl
		<< "���� �������, �� ������� True, ���� ��� � ������� False." << endl << endl;

	int n = 254;
	int remainder = n;
	bool result = false;

	cout << "���� �����: [" << n << "]" << endl;

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
		cout << "������� � ����� �������� �����: [��]" << endl;
	}
	else
	{
		cout << "������� � ����� �������� �����: [���]" << endl;
	}

	cout << endl;
}

void exercise04()
{
	cout << "�������: � ���������� �������� �����, ���� �� ����� ������ 0." << endl
		<< "���������� ������� �������������� ���� ������������� ������ �����, �������������� �� 8." << endl << endl;

	int count = 0;
	int summ = 0;
	int input = 0;

	do
	{
		cout << "������� ����� �����: [*8] ";
		cin >> input;

		if (input % 10 == 8)
		{
			summ += input;
			count++;
		}

	} while (input != 0);

	if (count == 0)
	{
		cout << "�� ���� ������� �� ������ �����, ���������������� �����������." << endl;
	}
	else
	{
		cout << "������� = [" << count << "] �����, ����� = [" << summ << "]. ������� �������������� = [" << (double)(summ / count) << "]" << endl;
	}

	cout << endl;
}

void exercise05()
{
	cout << "�������: �������� ������� ���������� ������������� �� ���� �����." << endl << endl;

	int max = 0;
	int countNumbers = 3;
	int input = 0;

	cout << "����� ������ " << countNumbers << " �����." << endl;

	for (int iter = 0; iter < countNumbers; iter++) {
		cout << "������� �����[" << iter << "]: ";
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

	cout << "������������ �� " << countNumbers << " ����� = [" << max << "]" << endl;

	cout << endl;
}

void exercise06()
{
	cout << "�������: �������� �������, ������������ ��������� ����� �� 1 �� 100." << endl << endl;

	cout << "�) � �������������� ����������� ������� rand()" << endl;
	srand(100);

	for (int iter = 0; iter < 5; iter++)
	{
		cout << "����� �� ����� [" << iter << "] = [" << (rand() % 100) << "]" << endl;
	}
	cout << endl << "�) ��� ������������� ����������� ������� rand() (������ � ������)" << endl;
	int x = 1;
	int a = 2;
	int b = 3;
	int m = 100;

	for (int iter = 0; iter < 5; iter++)
	{
		x = (a * x + b) % m;
		cout << "����� �� ����� [" << iter << "] = [" << x << "]" << endl;
	}

	cout << endl;
}

int main()
{
	system("chcp 1251");

	cout << "����� ���������: ��������� ������.\n\n" << endl;
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