class Visitor {
    public:
        //純粋仮想関数 =0
        virtual void visit(File file)=0;
        virtual void visit(Directory directory)=0;
};