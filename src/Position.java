import java.util.Objects;

// 불변 객체에서는 생성자를 private 으로 감추고 정적 팩토리 메서드만 공개
public class Position {
    private final int x;
    private final int y;

    public static Position of(int x, int y) {  // 값 객체처럼 작은 클래스는 생성자 대신 정적 팩토리 메서드를 사용하여 가독성과 사용성을 개선
        return new Position(x, y);
    }

    private Position(int x, int y) { // 생성자
        this.x = x;
        this.y = y;
    }

    public int x() { return x; }
    public int y() { return y; }

    public Position shift(int incX, int incY) {
        return new Position(x + incX, y + incY); // 새로운 Positon 생성 후 반환
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
