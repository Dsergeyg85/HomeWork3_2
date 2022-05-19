public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        /*
        OnTaskErrorListener errorListener = result -> {
            System.out.println(result);
        };
        OnTaskErrorListener errorListener = new OnTaskErrorListener() {
            @Override
            public void onError(String result) {
                System.out.println(result);
            }
        };*/

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
