// exercise03.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"


int main()
{
	system("chcp 1251");

	int a = 5,
		b = 9,
		c = 0;

	printf("\n������ 2 �����: a=[%d], b=[%d]", a, b);
	printf("\n������ ����� � ������� 3-�� ����������.");

	c = a;
	printf("\n��� 1: a=[%d], b=[%d], c=[%d]", a, b, c);
	a = b;
	printf("\n��� 2: a=[%d], b=[%d], c=[%d]", a, b, c);
	b = c;
	printf("\n��� 3: a=[%d], b=[%d], c=[%d]", a, b, c);
	printf("\n������!\n");

	/*
	������, ����� � ���������, ��������� ���� ����� ��������� ��� ��� �����������
	*/
	a = 3;
	b = 7;

	printf("\n������ 2 �����: a=[%d], b=[%d]", a, b);
	a = a + b;
	printf("\n��� 1: a=[%d], b=[%d]", a, b);
	b = a - b;
	printf("\n��� 2: a=[%d], b=[%d]", a, b);
	a = a - b;
	printf("\n��� 3: a=[%d], b=[%d]", a, b);
	printf("\n������!\n");

    return 0;
}

