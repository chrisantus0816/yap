#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric> //for accumulate operation

using namespace std;

int main()
{
    int arr[]={10,20,5,23,42,15};
    int n=sizeof(arr)/sizeof(arr[0]);
    vector<int> vect(arr,arr+n);
    
    cout<<"Vector is : ";
    for(int i=0;i<n;i++)
        cout<<vect[i]<<" ";
    
    //Sorting the Vector in Ascending order
    sort(vect.begin(),vect.end());
    
    cout<<"\nVector after sorting is : ";
    for(int i=0;i<n;i++)
        cout<<vect[i]<<" ";
    
    //Reversing the Vector
    reverse(vect.begin(),vect.end());
    
    cout<<"\nVector after reversing is : ";
    for(int i=0;i<6;i++)
        cout<<vect[i]<<" ";
    
    cout<<"\nMaximum element of vector is : ";
    cout<<*max_element(vect.begin(),vect.end());
    
    cout<<"\nMinimum element of vector is : ";
    cout<<*min_element(vect.begin(),vect.end());
    
    //Starting the summation from 0
    cout<<"\nThe summation of vector elements is : ";
    cout<<accumulate(vect.begin(),vect.end(),0);
    
    int arr1[]={10,20,5,23,42,20,15};
    int length=sizeof(arr1)/sizeof(arr1[0]);
    vector<int> vect1(arr1,arr1+length);
    
    cout<<"\nOccurences of 20 in vector : ";
    //Counts the occurence of 20 from 1st to last element
    cout<<count(vect1.begin(),vect1.end(),20);
    
    //find() returns iterator to last address if element not present
    find(vect1.begin(),vect1.end(),5)!=
    vect.end( )? cout<<"\nElement found" : cout<<"\nElement not found";
    
    int arr2[]={5,10,15,20,20,23,42,45};
    int ssize=sizeof(arr2)/sizeof(arr2[0]);
    vector<int> vect3(arr2,arr2+ssize);
    
    //Sort the array to make sure that lower_bound() and upper_bound() work.
    sort(vect3.begin(),vect3.end());
    //Returns the last occruence of 20
    auto q=lower_bound(vect3.begin(),vect3.end(),20);
    //Returns the last occurence of 20
    auto p=upper_bound(vect3.begin(),vect3.end(),20);
    
    cout<<"The lower bound is at position : ";
    cout<<q-vect3.begin()<<endl;
    
    cout<<"The upper bound is at postiion : ";
    cout<<p-vect3.begin()<<endl;
    
    int arr4[] = {5, 10, 15, 20, 20, 23, 42, 45};
    int n4 = sizeof(arr4)/sizeof(arr4[0]);
    vector<int> vect4(arr4, arr4+n4);
    
    cout<<"Vector is : ";
    for(int i=0;i<6;i++)
        cout<<vect4[i]<<" ";
    
    //Delete second element of vector
    vect4.erase(vect4.begin()+1);
    
    cout<<"\nVector after erasing the element : ";
    for(int i=0;i<5;i++)
        cout<<vect4[i]<<" ";
    
    //sorting to enable use of unique()
    sort(vect4.begin(),vect4.end());
    
    cout<<"\nVector before removing duplicate " " occurrences : ";
    for(int i=0;i<5;i++)
        cout<<vect4[i]<<" ";
    //Delete the duplicate occurences
    vect4.erase(unique(vect4.begin(),vect4.end()),vect4.end());
    
    cout<<"\nVector after deleting duplicates : ";
    for(int i=0;i<vect4.size();i++)
        cout<<vect4[i]<<" ";
    
    
    
    return 0;
}
