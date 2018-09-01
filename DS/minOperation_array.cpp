#include <iostream>
#include <unordered_map>
// 모든 요소를 배열로 동일하게 만들기 위한 최소 연산
/*
 주어진 양의정수가 n인 배열 모든 요소를 동일하게 만들기위해서는
 최소 연산 횟수를 찾아야 한다.
 
 */
using namespace std;

//function for min operation
int minOperation(int arr[],int n)
{
    //Insert all elements in hash
    unordered_map<int,int> hash;
    
    for(int i=0;i<n;i++)
        hash[arr[i]]++;
    
    //find the max frequency
    int max_count=0;
    for(auto i:hash){
        if(max_count<i.second)
            max_count=i.second;
    }
    
    //return result
    return (n-max_count);
    
}

int main()
{
    int arr[]={1,5,2,1,3,2,1};
    
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<minOperation(arr,n);
    return 0;
}
