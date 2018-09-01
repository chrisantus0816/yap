#include <iostream>
#include <map>

using namespace std;

int main()
{
    map <char,int> mp;
    pair<map<char,int>::iterator, map<char,int>::iterator> it;
    
    mp['a']=5;
    mp['b']=10;
    mp['c']=15;
    mp['h']=20;
    mp['k']=30;
    
    //using equal_range() to search for 'b'
    //key found
    //1st element of "it" has the address to lower_bound(b)
    //2nd element of "it" has the address to upper_bound(c)
    
    it=mp.equal_range('b');
    
    cout<<"The lower_bound of key is : "<<it.first->first<<" -> "<<it.first->second<<endl;
    cout<<endl;
    
    
    cout<<"The upper_bound of key is : "<<it.second->first<<" -> "<<it.second->second<<endl;
    cout<<endl;
    
    cout<<endl<<endl;
    
    //using equal_range() to search for 'd'
    //key not found
    //Both elements of it point to next greater key
    //key -'h'
    
    it=mp.equal_range('d');
    cout<<"The lower_bound of key is : "<<it.first->first<<" -> "<<it.first->second<<endl;
    cout<<endl;
    
    
    cout<<"The upper_bound of key is : "<<it.second->first<<" -> "<<it.second->second<<endl;
    cout<<endl;
    
    
    
    
    return 0;
}
