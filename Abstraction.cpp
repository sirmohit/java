#include<iostream>
using namespace std;
class Rectangle
{
private:
    int width,height;
public:
    void set_values(int x,int y)
    {
        width=x;
        height=y;
    }
    int area()
    {
      return width*height;
    }
        int getWidth()
        {
            return width;
        }
        int getHeight()
        {
            return height;
        }
};
int main()
{
    Rectangle obj;
    obj.set_values(23,45);
    cout<<obj.area();
    return 0;
}
