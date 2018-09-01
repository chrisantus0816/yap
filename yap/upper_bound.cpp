#include <iostream>
#include <map>
using namespace std;

int main()
{
    map <char,int> mp;
    
    map<char,int> :: iterator it;
    map<char,int> :: iterator it1;
    map<char,int> :: iterator it2;
    
    //inserting values
    mp['a']=5;
    mp['b']=10;
    mp['c']=15;
    mp['h']=20;
    mp['k']=30;
    
    //using upper_bound() to search for 'b' key found "it"
    // has address of key value pair next to 'b' i.e 'c'
    
    it=mp.upper_bound('b');
    
    if(it==mp.end())
        cout<< "Key - Value pair not present in map"<<endl;
    else
        cout<< "Key - Value pair returned : "<<it->first<<" -> "<<it->second<<endl;
    
    cout<<endl;
    
    //using upper_bound() to search for 'd'
    //key not found
    //"it1" has address of next greater key.
    //key - 'h'
    it1=mp.upper_bound('d');
    if(it1==mp.end())
        cout<< "Key - Value pair not present in map"<<endl;
    else
        cout<< "Key - Value pair returned : "<<it1->first<<" -> "<<it1->second<<endl;
    
    cout<<endl;
    
    //using upper_bound() to search for 'p'
    //key not found
    //"it2" has address of next greater key
    //all keys are smaller , hence returns mp.end()
    it2=mp.upper_bound('p');
    
    if(it2==mp.end())
        cout<< "Key - Value pair not present in map"<<endl;
    else
        cout<< "Key - Value pair returned : "<<it2->first<<" -> "<<it2->second<<endl;
    
    cout<<endl;
}
