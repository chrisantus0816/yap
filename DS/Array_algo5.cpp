#include <iostream>
#include <unordered_map>
// 가장 빈번한 요소의 모든 발생을 포함하는 가장 작은 하위 배열 출력
using namespace std;

void smallestSubsegment(int a[],int n)
{
    //To store left most occurence of elements
    unordered_map<int,int> left;
    
    //To store counts of elements
    unordered_map<int,int> count;
    //To store maximum frequency
    int mx=0;
    //To store length and starting index of smallest result window
    int mn,strindex;
    
    for(int i=0;i<n;i++)
    {
        int x=a[i];
        //First occurence of an element ,
        //store the index
        if(count[x]==0)
        {
            left[x]=i;
            count[x]=1;
        }
        //increase the frequency of elements
        else
            count[x]++;
        
        //Find maximum repeated element and
        //store its last occurence and first
        //occurence
        if(count[x]>mx){
            mx=count[x];
            mn=i-left[x]+1; //length of subsegment
            strindex=left[x];
        }
        //select subsegment of smallest size
        else if(count[x]==mx && i-left[x]+1<mn){
            mn=i-left[x]+1;
            strindex=left[x];
        }
    }
    
    //Print the subsegment with all occurence of a most frequent element
    for(int i=strindex;i<strindex+mn;i++)
        cout<<a[i]<<" ";
}
int main()
{
    int A[]={1,2,2,3,2,1,3,2};
    int n=sizeof(A)/sizeof(A[0]);
    smallestSubsegment(A,n);
    
    
    return 0;
}
