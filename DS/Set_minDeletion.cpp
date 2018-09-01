#include <iostream>
#include <unordered_map>
//배열의 모든 요소를 동일하게 만들기 위한 최소삭제 작업
using namespace std;
//Function to get minimum number of elements to be deleted
//from array to make array elements equal
int minDelete(int arr[],int n)
{
    //Create an hash map and store frequencies of all
    //array elements in it using element as key and
    //frequency as value
    unordered_map <int,int> freq;
    for(int i=0;i<n;i++)
        freq[arr[i]]++;
    
    //Find maximum frequency among all frequencies.
    int max_freq=INT_MIN;
    for(auto itr=freq.begin();itr!=freq.end();itr++)
        max_freq=max(max_freq,itr->second);
    
    //To minimize delete operations, we remove all
    // elements but the most frequent element
    return n-max_freq;
    
}

int main()
{
    int arr[]={4,3,4,4,2,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<minDelete(arr,n)<<endl;
    return 0;
}
