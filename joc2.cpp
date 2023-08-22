
#include <iostream>

using namespace std;

int main()
{
    int n,c = 0;
    cout << "Enter n: " << endl;
    cin >> n;
    
    int a[n];
    cout << "Enter array: " << endl;
    for(int i = 0; i < n; i++)
        cin >> a[i];
        
    
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            if (a[i] > a[j])
                c++;
        }
    }
    
    cout << c << endl;
    return 0;
}
