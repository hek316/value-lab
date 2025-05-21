public class Game {
    private int width, height;
    private Room[] rooms;
    private int x, y;

    private void showRoom() {
        System.out.println("당신은 [ " +  roomAt(x, y).name() + " ] 에 있습니다.");
        System.out.println(roomAt(x, y).description());
    }

    private boolean isBlocked(int x, int y) {
        return y < 0 || y >= height || x >= width || roomAt(x, y) == null;
    }

    private void tryMove(int incX, int incY) {

    }


    private Room roomAt(int x, int y) {
        return rooms[x + y * width];
    }

}
