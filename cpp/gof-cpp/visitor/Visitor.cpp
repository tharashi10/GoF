class Visitor {
    public:
        //純粋仮想関数 =0
        virtual visit(File& file)=0;
        virtual visit(Directory& directory)=0;
};