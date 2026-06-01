import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class SizeCounter extends SimpleFileVisitor<Path> {
    long total = 0;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes a) {
        total = total + a.size();
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) {
        try {
            Path root = Path.of(System.getProperty("user.home"));
            SizeCounter c = new SizeCounter();
            Files.walkFileTree(root, c);
            System.out.println(root + "전체 크기: " + c.total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
