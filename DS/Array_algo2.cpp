#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;
/*
 
 curMax: keeps track of maximum number of points which have same slope as selected point ( point[i] ).
 overlapPoints: keeps track of number of points ( point[j] ) which overlaps with selected point ( point[i] ).
 In the above calculation we're finding points which have same slope as given point.
 So, if n points have same slope as given point , it means they all lie on same line.So in total n+1 points lie on line.(n points+given point)
 
 Now we need number of points with slope same as of selected point.
 So, we add curMax+overlapPoints+1
 
 for eg { {1,1},{1,1},{0,0},{-1,-1} }
 in 1st iteration we select point {0,0}
 so we get curMax=2 , overlapPoints=1
 so we get 2+1+1 points with same slope
 as we can clearly see all these points lie on same line y=x
 
 and finally we need to take maximum num of points with same slope for each selected point
 so we use
 if(maxpoint> curMax + overlapPoints + 1)
 {
 maxpoint=curMax + overlapPoints + 1;
 }
 which can also be written as
 maxPoint = max(maxPoint, curMax + overlapPoints + 1);
 
*/

int gcd(int a, int b) {
    return (b==0?a:gcd(b,a%b));
}

//method to find maximum colinear point
long maxPointOnSameLine(vector <pair<int,int>> points)
{
    long N=points.size();
    if(N<2)
        return N;
    int maxPoint=0;
    int curMax,overlapPoints,verticalPoints;
    
    //map to store slope pair
    unordered_map<pair<int,int>,int> slopeMap;
    
    //looping for each point
    for(int i=0;i<N;i++)
    {
        curMax=overlapPoints=verticalPoints=0;
        
        //looping from i+1 to ignore same pair again
        for(int j=i+1;j<N;j++){
            //If both point are equal then just
            //increase overlapPoint count
            if(points[i]==points[j])
                overlapPoints++;
            
            //If x co-ordinate is same, then both
            //point are vertical to each other
            else if(points[i].first==points[j].first)
                verticalPoints++;
            else{
                int yDif=points[j].second - points[i].second;
                int xDif=points[j].first - points[i].first;
                int g=gcd(xDif,yDif);
                
                //reducing the difference by their gcd
                yDif/=g;
                xDif/=g;
                
                //increasing the frequency of current slope
                //in map
                slopeMap[make_pair(yDif,xDif)]++;
                curMax=max(curMax,slopeMap[make_pair(yDif,xDif)]);
                
                
                
            }
            curMax=max(curMax,verticalPoints);
        }
        //updating global maximum by current point's maximum
        maxPoint=max(maxPoint,curMax+overlapPoints+1);
        slopeMap.clear();
    }
    return maxPoint;
}


int main()
{
    const int N=6;
    int arr[N][2]={{-1,1},{0,0},{1,1},{2,2},{3,3},{3,4}};
    
    vector<pair<int,int>> points;
    for(int i=0;i<N;i++){
        points.push_back(make_pair(arr[i][0],arr[i][1]));
    }
    
    cout<<maxPointOnSameLine(points)<<endl;
    return 0;
}
