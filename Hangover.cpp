#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
	float cards[2000];
	float temp;
	int count = 0;
	for (int i = 0; i < 2000; ++i)
	{
		scanf("%f", &temp);
		if (temp == 0.00)
		{
			break;
		}
		cards[i] = temp;
		count++;
	}

	for (int j = 0; j < count; ++j)
	{
		float hangLength = 0.00;
		for (float i = 2; i < 2000; ++i)
			{
				
				hangLength += 1/i;
				if (hangLength >= cards[j])
				{
					cout << (int)(i - 1) << " cards(s)" << endl;
					break;
				}
			}
	}
	return 0;
}