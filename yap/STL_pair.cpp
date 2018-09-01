#include <iostream>
#include <utility>
#include <string>
/*
 pair(data_type1,data_type2) Pair_name (값1,값2);
 pair를 초기화하지않으면 첫번째 값이 자동으로 0 으로 초기화됨
 pair안의 string형태의 초기화는 null을 가리킨다 ( class )
 
 */
using namespace std;

int main()
{
    pair<int,char> PAIR1;
    pair<string,double> PAIR2 ("GeeksForGeeks",1.23);
    pair<string,double> PAIR3;
    
    pair<int,int> p1=make_pair(1,12);
    pair<int,int> p2=make_pair(9,12);
    
    pair<char,int> p3=make_pair('A',1);
    pair<char,int> p4=make_pair('B',2);
    
    PAIR1.first=100;
    PAIR1.second='G';
    
    PAIR3=make_pair("GeeksForGeeks is Best",4.56);
    
    cout<<PAIR1.first<<" ";
    cout<<PAIR1.second<<endl;
    
    
    cout<<PAIR2.first <<" ";
    cout<<PAIR2.second <<endl;
    
    cout<<PAIR3.first<<" ";
    cout<<PAIR3.second<<endl;
    
    
    cout<<(p1==p2)<<endl; //false 0
    cout<<(p1!=p2)<<endl; //true 1
    cout<<(p1>=p2)<<endl; //false 0
    cout<<(p1<=p2)<<endl; //true 1
    cout<<(p1>p2)<<endl; //false 0
    cout<<(p1<p2)<<endl; //true 1
    
    cout<<"Before swapping:\n";
    cout<<"Contents of pair3 = "<<p3.first<<" "<<p3.second<<endl;
    
    cout<<"Contents of pair4 = "<<p4.first<<" "<<p4.second<<endl;
    
    p3.swap(p4);
    
    cout<<"\nAfter swapping:\n";
    cout<<"Contents of pair3 = "<<p3.first<<" "<<p3.second<<endl;
    cout<<"Contents of pair4 = "<<p4.first<<" "<<p4.second<<endl;
    
    pair<string,int> g1;
    pair<string,int> g2("Quiz",3);
    pair<string,int> g3(g2);
    pair<int,int> g4(5,10);
    
    g1=make_pair(string("Geeks"),1);
    g2.first=".com";
    g2.second=2;
    
    cout<<"This is pair g"<<g1.second<<" with " << "value "<<g1.first<<"."<<endl<<endl;
    cout<<"This is pair g"<<g3.second<<" with value "<<g3.first<<" This pair was initialzied as a copy of "
    <<"pair g2"<<endl<<endl;
    cout<<"This is pair g"<<g2.second<<" with value "<<g2.first<<"\nThe values of this pair were"
    <<" changed after intitialization."<<endl<<endl;
    
    cout<<"This is pair g4 with values "<<g4.first<<" and "<<g4.second<<" made for showing addtion.\nThe "
    <<"sum of the values in this pair is "<<g4.first+g4.second<<"."<<endl<<endl;
    
    cout<<"We can concatenate the values of"<< " the pairs g1,g2 and g3 : "
    <<g1.first+g3.first+g2.first<<endl<<endl;
    
    cout<<"We can also swap pairs "<<"(but type of pairs should be same) : "<<endl;
    cout<<"Before Swapping, "<<"g1 has "<<g1.first<<" and g2 has "<<g2.first<<endl;
    swap(g1,g2);
    cout<<"After swapping, "<<"g1 has "<<g1.first<<" and g2 has "<<g2.first;
    
    return 0;
    
}
