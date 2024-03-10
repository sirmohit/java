#include<iostream>
using namespace std;
int main()
{
    char a;
    int isLowercaseVowel,isUppercaseVowel;
    cout<<"Enter an alphabet"<<endl;
    cin>>a;
    isLowercaseVowel=(a == 'a' || a =='e' ||a == 'i'||a == 'o'||a == 'u');
    isUppercaseVowel=(a == 'A' || a =='E' ||a == 'I'||a == 'O'||a == 'U');
    if( isLowercaseVowel||isUppercaseVowel)
    cout<<a<<" :is a vowel"<<endl;
    else
        cout<<a<<":is a consonant";
    return 0;

}
