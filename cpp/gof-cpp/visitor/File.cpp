#include "Entry.cpp"
#include "Visitor.cpp"
#include <string>
class File : public Entry{
    private :
        std::string name;
        int size;
    public :
        File(std::string n, int s){
            this->name = n;
            this->size = s;
        };
    public :
        std::string getName() override{
            return name;
        };
        int getSize() override{
            return size;
        };
    
    public:
        virtual void accept(Visitor& v) override
        {
            v.visit(*this);
        };
};
