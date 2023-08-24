#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cout << "Enter String: " << endl;
    cin >> s;
    
    int len = s.length();
    
    stack<char> ch;
    
    for(int i = 0; i < len; i++){
        if(ch.empty() || s[i] == '(' || ch.top() != '('){
            ch.push(s[i]);
        }
            
        else{
            if(!ch.empty() && ch.top() == '('){
                ch.pop();
            }
        }
        
    }
    
    int x,y;
    x = y = 0;
    while(!ch.empty()){
        char z = ch.top();
        ch.pop();
        
        if(z == '(')
            x++;
        else
            y++;
    }
    
    if(x == y &&  x == 0){
        cout << "0"<< endl;
        cout << "The exp is balanced"<< endl;
    }
    else{
        cout << x << "')' is needed" << endl;
        cout << y <<"'(' is needed" << endl;
    }
    

    return 0;
}
