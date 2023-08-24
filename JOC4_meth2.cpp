// JOC4 using hashing
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cout << "Enter the size of array: " << endl;
    cin >> n;
    
    bool arr[n] = {false};
    int a[n];
    cout << "Enter the array: " << endl;
    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    
    for(int i = 0; i < n; i++){
        if(a[i] > 0)
            arr[a[i]] = true;
    }
    
    int i;
    for(i = 1; i < n; i++){
        if(arr[i] == false){
            break;
        }
    }
    
    
    cout << i;
    

    return 0;
}
