#include "Visitor.cpp"
using namespace std;
class Element{
    public:
        virtual void accept(Visitor& v)=0;
};