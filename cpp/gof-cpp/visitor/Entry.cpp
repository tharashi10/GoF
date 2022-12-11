#include <string>
class Entry
{
    public:
        Entry(/* args */);
        ~Entry();
        virtual std::string getName()=0;
        virtual int getSize()=0;
};

Entry::Entry(/* args */)
{
}

Entry::~Entry()
{
}
