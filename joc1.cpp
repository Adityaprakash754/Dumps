#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cout << "Enter no test cases" << endl;
    cin >> t;
    
    while(t--){
        float a_pur, ret;
        int ap,n,ch;
        cout << "Enter amount of purchase and amount paid" << endl;
        cin >> a_pur;
        cin >> ap;
        
        ret = ap - a_pur;
        
        cout << "Enter no of denominations" << endl;
        cin >> n;
        
        pair <float,int> p[n];
        cout << "Enter denomination and it's count" << endl;
        for(int i = 0; i < n; i++){
            cin >> p[i].first;
            cin >> p[i].second;
        }
        
        
        cout << "Enter 1: for more 2: for less change " << endl;
        cin >> ch;
        
        int soln [n] = {0};
        float temp = ret;
            
        if(ch == 1){
            sort(p, p + n);
            
            int i = 0;
            while(temp > 0){
                while(temp > 0 && p[i].second > 0){
                    soln[i]++ ;
                    p[i].second--;
                    temp -= p[i].first; 
                }
                i++;
            }
            
            
            if(temp < 0){
                i = i - 2;
                temp = temp * (-1);
                while(temp != 0){
                    int x = temp / p[i].first;
                    if(x > 0){
                        if(soln[i] - x >= 0){
                            soln[i] -= x;
                            p[i].second += x;
                            temp -= x*p[i].first;
                        }
                        else{
                            int t1 = soln[i];
                            soln[i] = 0;
                            p[i].second += t1;
                            temp -= t1*p[i].first;
                        }
                    }
                    else
                        i--;
                }
            }
        }
        
        else if(ch == 2){
            sort(p, p + n, greater < pair <float, int> > ());
            
            int i = 0;
            while(temp > 0){
                while(temp > 0 && p[i].second > 0 && temp - p[i].first >= 0){
                    soln[i]++ ;
                    p[i].second--;
                    temp -= p[i].first; 
                }
                i++;
            }
        }    
        
        cout << "Change to be returned: "<< ret << endl;
        for(int j = 0; j < n; j++){
            if(soln [j] != 0){
                cout << "Rs " << p[j].first << " = " << soln[j] << endl;
            }
        }
    }
    return 0;
}
