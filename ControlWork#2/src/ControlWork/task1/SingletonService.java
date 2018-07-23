package ControlWork.task1;

public class SingletonService {

    private static SingletonService instance = null;

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

    public static void startOfStream(int n) {
        for (int i = 0; i < n; i++) {

            Stream stream = new Stream(i);

            stream.start();
        }
    }
}

