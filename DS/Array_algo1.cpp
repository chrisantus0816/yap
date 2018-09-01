#include <iostream>
#include <unordered_map>
using namespace std;
/*
  배열에 있는 동일한 요소가 두번 나오는 최대 간격 을 구한다.
 효율적인 사용법은 해싱이다. 입력 배열을 해시맵에서 첫번째
 발생하는 인덱스로 저장한다.
 다른 모든 경우에 대해 인덱스와 해시맵에 저장된 첫번째 인덱스의 차이를 찾음
 지금까지 결과보다 차이가 많이 나는 경우 결과 업데이트
 */

//Function to find maximum distance between equal elements

int maxDistance(int arr[],int n)
{
    //Used to store element to first index mapping
    unordered_map<int,int> mp;
    
    //Traverse elements and find maximum distance between
    //same occurences with the help of map
    int max_dist=0;
    for(int i=0;i<n;i++)
    {
        //If this is first occurence of element, insert its
        //index in map
        if(mp.find(arr[i])==mp.end())
            mp[arr[i]]=i;
        
        //Else update max distance
        else
            max_dist=max(max_dist,i-mp[arr[i]]);
    }
    return max_dist;
}

int main()
{
    int arr[]={3,2,1,2,1,4,5,8,6,7,4,2};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<maxDistance(arr,n)<<endl;
    return 0;
}
