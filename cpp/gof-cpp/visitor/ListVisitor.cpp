#include "Visitor.cpp"
#include <string> 
using namespace std; 

class ListVisitor : public Visitor{
    private:
        string currentdir;
    virtual void visit(File& file) override{
        // TODO
    }
    virtual void visit(Directory& directory) override{
        // TODO
    }
};
