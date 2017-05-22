// exercise03.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"


int main()
{
	system("chcp 1251");

	int a = 5,
		b = 9,
		c = 0;

	printf("\nЗаданы 2 числа: a=[%d], b=[%d]", a, b);
	printf("\nМеняем числа с помощью 3-ей переменной.");

	c = a;
	printf("\nШаг 1: a=[%d], b=[%d], c=[%d]", a, b, c);
	a = b;
	printf("\nШаг 2: a=[%d], b=[%d], c=[%d]", a, b, c);
	b = c;
	printf("\nШаг 3: a=[%d], b=[%d], c=[%d]", a, b, c);
	printf("\nГотово!\n");

	/*
	Честно, нашел в интернете, поскольку было очень интересно как это реализовать
	*/
	a = 3;
	b = 7;

	printf("\nЗаданы 2 числа: a=[%d], b=[%d]", a, b);
	a = a + b;
	printf("\nШаг 1: a=[%d], b=[%d]", a, b);
	b = a - b;
	printf("\nШаг 2: a=[%d], b=[%d]", a, b);
	a = a - b;
	printf("\nШаг 3: a=[%d], b=[%d]", a, b);
	printf("\nГотово!\n");

    return 0;
}

