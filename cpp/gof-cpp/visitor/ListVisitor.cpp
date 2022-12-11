#include "Visitor.cpp"
#include "File.cpp"
#include "Directory.cpp"
#include <string> 
#include <iostream>
using namespace std; 

// データ構造をわたり歩きながら一覧を表示するクラス
class ListVisitor : public Visitor{
    private:
        string currentdir;
    virtual void visit(File file) override{
        string s;
        s.append(currentdir).append("/").append(file);
        cout <<  s << endl;
    }
    virtual void visit(Directory directory) override{
        // TODO
    }
};
