#include "Entry.cpp"
#include "Visitor.cpp"
#include <string>
#include <vector>
class Directory : public Entry{
    private:
        std::string name;
        std::vector<Entry> directory;
    public :
        Directory(std::string n, int s){
            this->name = n;
        };
    public :
        std::string getName() override{
            return name;
        };
        int getSize() override{
            int size=0;
            for (auto it=directory.begin; it!=directory.end(); ++it){
                // std::cout << *it << std::endl;
                size+= it.getSize();
            };
            return size;
        };

    public:
        Entry add(Entry entry){
            directory.push_back(entry);
            return *this;
        };
    
    public:
        virtual void accept(Visitor& v) override
        {
            v.visit(*this);
        };
};
