package box2;

public enum Sizes {
    XXS(32){
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34){
        @Override
        public String getDescription(){
            return "Маленький размер";
        }
    },
    S(36){
        @Override
        public String getDescription(){
            return "Подростковый размер";
        }
    },
    M(38){
        @Override
        public String getDescription(){
            return "Средний размер размер";
        }
    },
    L(40){};

    private int euroSize;
    Sizes(int size){
        this.euroSize = size;
    }


    public String getDescription(){
        return "Взрослый размер";
    }
}
