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

	printf("\n���� ������� �����: [%d, %d, %d, %d]", a, b, c, d);
	printf("\n������������ ����� �� ���: %d", max);

	printf("\n\n������ ���� ����������� ������ ��? [0 - ���, 1 - ��] ");
	scanf("%d", &answer);
	if (answer == 1) {
		printf("������� ����� a: ");
		scanf("%d", &a);
		printf("������� ����� b: ");
		scanf("%d", &b);
		printf("������� ����� c: ");
		scanf("%d", &c);
		printf("������� ����� d: ");
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
		printf("������������ ����� �� ���������: %d\n", max);
	}
	
    return 0;
}

