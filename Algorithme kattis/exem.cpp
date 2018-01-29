#include <iostream>
#include <new>
using namespace std;
int main()
{
    int x, y;
    int* s;
    x = 2;
    s = new (nothrow) int[x];
    if (s == 0)
        cout << "Memory could not be allocated";
    else {
        for (y = 0; y < x; y++) {
            s[y] = 1;
        }
        for (y = 0; y < x; y++)
            cout << s[y];
        delete[] s;
    }
    return 0;
}