class SimpleCounter {



    private static SimpleCounter instance = new SimpleCounter();
    public int counter;


    private SimpleCounter() { }

     public static SimpleCounter getInstance() {

        instance.counter = 0;
        return instance;
    }
}
