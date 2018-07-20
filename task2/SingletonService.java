package iit.by.classwork.lesson22_practical_work.task2;

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

    public void writeOfStreams(int stream) {
        stream = 5;
        for (int i = 0; i <= stream; i++) {
            ThreadWithFile threadWithFile = new ThreadWithFile(i);
            threadWithFile.start();
        }

    }

    public void readOfStreams(int stream) {
        stream = 5;
        for (int i = 0; i <= stream; i++) {
            ThreadReadFileService threadReadFileService = new ThreadReadFileService(i);
            threadReadFileService.call();
        }
    }
}
