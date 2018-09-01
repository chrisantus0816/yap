#include <iostream>
#include <unordered_map>
//시간복잡도 O(n)을 갖는다. 해싱사용 
using namespace std;

int mostFrequent(int arr[],int n)
{
    //Insert all elements in hash
    unordered_map<int,int> hash;
    for(int i=0;i<n;i++)
        hash[arr[i]]++;
    
    //find the max frequency
    int max_count=0,res=-1;
    for(auto i:hash){
        if(max_count<i.second){ //빈도수
            res=i.first; //arr[i]요소의 값
            max_count=i.second; //해당 빈도수가 max_count가 된다.
        }
    }
    return res;
}

int main()
{
    int arr[]={1,5,2,1,3,2,1};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<mostFrequent(arr,n)<<endl;
    return 0;
}
