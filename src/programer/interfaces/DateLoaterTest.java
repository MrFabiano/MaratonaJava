package programer.interfaces;

public class DateLoaterTest {

    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();


        dataBaseLoader.remove();
        fileLoader.remove();


    }

}
