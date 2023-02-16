import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.posters.PostersManager;

public class PostersManagerTest {
    @Test
    public void addOneAndFindAll() {
        PostersManager manager = new PostersManager();
        manager.add("Film I");
        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSomeAndFindAll() {
        PostersManager manager = new PostersManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyArray() {
        PostersManager manager = new PostersManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithLimit() {
        PostersManager manager = new PostersManager(5);
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastWithLimitAndFilmsLessThenLimit() {
        PostersManager manager = new PostersManager(5);
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastWithLimitAndFilmsMoreThenLimit() {
        PostersManager manager = new PostersManager(5);
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLastWithoutLimit() {
        PostersManager manager = new PostersManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");
        manager.add("Film VIII");
        manager.add("Film IX");
        manager.add("Film X");
        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastLessLimit() {
        PostersManager manager = new PostersManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
