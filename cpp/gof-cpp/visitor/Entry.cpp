#include <string>
#include "Element.hpp"
class Entry : public Element
{
    public:
        virtual std::string getName()=0;
        virtual int getSize()=0;
};
