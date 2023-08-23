
#include <bits/stdc++.h>
//#include<stack>

using namespace std;

int main()
{
    string s;
    cout << "Enter String: " << endl;
    cin >> s;
    
    int len = s.length();
    
    stack<char> ch;
    
    int x,y,z;
    x = y = 0;
    
    for(int i = 0; i < len; i++){
        if(s[i] != ')'){
            ch.push(s[i]);
            x++;
        }
            
        else{
            if(!ch.empty()){
                ch.pop();
                y++;
            }
        }
        
    }
    
    z = len - (x + y);
    y = y + z;
    
    if(x != y){
        if(x > y){
            cout << x - y << endl;
            cout << "')' is needed" << endl;
        }
        else {
            cout << y - x << endl;
            cout << "'(' is needed" << endl;
        }
        
    }
    else{
        cout << "0"<< endl;
        cout << "The exp is balanced"<< endl;
    }
    

    return 0;
}
