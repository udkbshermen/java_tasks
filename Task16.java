interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    boolean feed (boolean timeToEat){
        //put gorilla food into cage
    }

    void groom(){
        //lather, rinse, repeat
    }

    void per(){
        //pet at your own risk
    }
}