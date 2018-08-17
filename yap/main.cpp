//
//  main.cpp
//  yap
//
//  Created by 이원준 on 2018. 8. 16..
//  Copyright © 2018년 LEEWONJUN. All rights reserved.
//

#include <iostream>

using namespace std;

class Marine
{
    int hp;
    int coord_x,coord_y;
    int damage;
    bool is_dead;
    
public:
    Marine();
    Marine(int x,int y);
    
    int attack();
    void be_attacked(int damage_earn);
    void move(int x,int y);
    
    void show_status();
};

Marine::Marine()
{
    hp=50;
    coord_x=coord_y=0;
    damage=5;
    is_dead=false;
}

Marine::Marine(int x,int y)
{
    coord_x=x;
    coord_y=y;
    hp=50;
    damage=5;
    is_dead=false;
}

void Marine::move(int x,int y)
{
    coord_x=x;
    coord_y=y;
}

int Marine::attack()
{
    return damage;
}

void Marine::be_attacked(int damage_earn)
{
    hp-=damage_earn;
    if(hp<=0)
        is_dead=true;
}

void Marine::show_status()
{
    cout<<"***Marine***"<<endl;
    cout<<"Location: ("<<coord_x<<","<<coord_y<<")"<<endl;
    cout<<"HP: "<<hp<<endl;
}

int main(int argc, const char * argv[]) {
    
    Marine marine1(2,3);
    Marine marine2(3,5);
    
    marine1.show_status();
    marine2.show_status();
    
    cout<<endl<<"마린 1 이 마린 2 를 공격 ! "<<endl;
    marine2.be_attacked(marine1.attack());
    marine1.show_status();
    marine2.show_status();
    
    return 0;
}
