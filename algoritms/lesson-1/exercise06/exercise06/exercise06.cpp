// exercise06.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

using namespace std;

int main()
{
	system("chcp 1251");

	int age = 0;
	int tmp = 0;

	cout << "�������, ����������, ���� �������: [1-150] ";
	cin >> age;

	if (age < 1 || age > 150) {
		cout << "�� ����� ������� ��� ���������� ���������" << endl;
	}
	else {
		if (age % 100 > 10 && age % 100 < 20) {
			cout << "��� [" << age << "] ���" << endl;
		}
		else {
			tmp = age % 10;
			if (tmp == 1) {
				cout << "��� [" << age << "] ���" << endl;
			}
			if (tmp >= 2 && tmp <= 4) {
				cout << "��� [" << age << "] ����" << endl;
			}
			if (tmp == 0 || tmp >= 5) {
				cout << "��� [" << age << "] ���" << endl;
			}
		}
	}

    return 0;
}

