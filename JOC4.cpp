#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cout << "Enter the size of array: " << endl;
    cin >> n;
    
    int a[n];
    cout << "Enter the array: " << endl;
    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    
    sort(a,a+n);
    
    int cnt = 1;
    int i;
    for(i = 0; i < n; i++){
        if(a[i] > 0){
            if(cnt == a[i])
                cnt++;
            else
                break;
        }
    }
    
    if(i != n)
        cout << cnt;
    else
        cout << a[i-1] + 1;

    return 0;
}

