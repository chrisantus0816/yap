#include <iostream>
#include <unordered_map>
using namespace std;
//두개의 루프를 사용하기때문에 시간복잡도 O(n^2)
//요소가 범위에 제한되지 않은 경우 지정된 배열에서 중복 항목 찾기 
void printDuplicates(int arr[], int n)
{
    //unordered_map to store frequencies
    unordered_map<int,int> freq;
    for(int i=0;i<n;i++)
        freq[arr[i]]++;
    
    bool dup=false;
    unordered_map<int,int>::iterator itr;
    for(itr=freq.begin();itr!=freq.end();itr++)
    {
        //if frequency is more than 1
        //print the element
        if(itr->second>1)
        {
            cout<<itr->first<<" ";
            dup=true;
        }
    }
    //no duplicates present
    if(dup==false)
        cout<<"1";
}

int main()
{
    int arr[]={12,11,40,12,5,6,5,12,11};
    int n=sizeof(arr)/sizeof(arr[0]);
    printDuplicates(arr,n);
    return 0;
}
