// exercise05.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"


int main()
{
	system("chcp 1251");

	int month = 0;
	printf("\n������� ����� ������: [1-12] ");
	scanf("%d", &month);

	if (month < 1 || month > 12) {
		printf("�� ����� ����� ��� ����������� ���������.\n");
	}
	else {
		if (month == 12) {
			month = 0;
		}

		if (month >= 0 && month <= 2) {
			printf("����� ����: ����\n");
		}
		if (month >= 3 && month <= 5) {
			printf("����� ����: �����\n");
		}
		if (month >= 6 && month <= 8) {
			printf("����� ����: ����\n");
		}
		if (month >= 9 && month <= 11) {
			printf("����� ����: �����\n");
		}
	}

    return 0;
}

