#include <iostream>
/*
key - 발견되는 요소
ptr - 검사할 배열의 포인터
count - 배열의 요소 수
size - 배열 내의 각 요소 사이즈(바이트 단위)
comp -

void * bsearch(const void* key, const void* ptr, std::size_t count,
               std::size_t size, *comp)

*/
using namespace std;

int compare(const void *ap, const void *bp)
{
    //typecasting
    const int* a=(int*)ap;
    const int* b=(int*)bp;
    
    if(*a<*b)
        return -1;
    else if(*a>*b)
        return 1;
    else
        return 0;
}

int main()
{
    
    int arr[]={1,2,3,4,5,6,7,8};
    int ARR_SIZE=sizeof(arr)/sizeof(arr[0]);
    int key1=4;//element to be found
    //calling std::bsearch
    //typecasting the returned pointer to int
    int* p1=(int*)bsearch(&key1,arr,ARR_SIZE,sizeof(arr[0]),compare);
    //if non-zero value is returned, key is found
    if(p1)
        cout<<key1<<" found at position "<<(p1-arr)<<endl;
    else
        cout<<key1<<" not found"<<endl;
    
    //element to be found
    int key2=9;
    int *p2=(int*)bsearch(&key2,arr,ARR_SIZE,sizeof(arr[0]),compare);
    /
    if(p2)
        cout<<key2<<" found at position "<<(p2-arr)<<endl;
    else
        cout<<key2<<" not found"<<endl;
    
    
    
    return 0;
}
