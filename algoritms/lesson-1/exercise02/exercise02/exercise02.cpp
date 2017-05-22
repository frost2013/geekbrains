// exercise02.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

int main()
{
	system("chcp 1251");

	int a = 3,
		b = 5,
		c = 1,
		d = 8,
		max = a,
		answer = 0;

	if (max < b)
	{
		max = b;
	}

	if (max < c)
	{
		max = c;
	}

	if (max < d)
	{
		max = d;
	}

	printf("\nБыли введены числа: [%d, %d, %d, %d]", a, b, c, d);
	printf("\nМаксимальное число из них: %d", max);

	printf("\n\nХотите сами попробовать ввести их? [0 - Нет, 1 - Да] ");
	scanf("%d", &answer);
	if (answer == 1) {
		printf("Введите число a: ");
		scanf("%d", &a);
		printf("Введите число b: ");
		scanf("%d", &b);
		printf("Введите число c: ");
		scanf("%d", &c);
		printf("Введите число d: ");
		scanf("%d", &d);

		max = a;
		if (max < b)
		{
			max = b;
		}

		if (max < c)
		{
			max = c;
		}

		if (max < d)
		{
			max = d;
		}
		printf("Максимальное число из введенных: %d\n", max);
	}
	
    return 0;
}

