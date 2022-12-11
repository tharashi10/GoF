#include "Visitor.cpp"
class Element{
    public:
        virtual void accept(Visitor& v)=0;
};