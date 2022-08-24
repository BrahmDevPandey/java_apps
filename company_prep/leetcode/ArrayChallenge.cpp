#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;

string ArrayChallenge(int arr[], int len)
{
    int res[len];
    int i;

    for (i = 0; i < len; i++)
    {
        res[i] = 1;
    }

    for (i = 0; i < len; i++)
    {
        for (int j = 0; j < len; j++)
        {
            if (i != j)
                res[i] *= arr[j];
        }
    }

    string str = "";
    for (i = 0; i < len - 1; i++)
    {
        str += to_string(res[i]);
        str += '-';
    }
    str += to_string(res[i]);

    reverse(str.begin(), str.end());
    str += ":6297ui1yqwpv";
    return str;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << ArrayChallenge(arr, n);
    return 0;
}