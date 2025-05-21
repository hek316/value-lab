public class Game {
    private int width, height;
    private Room[] rooms;
    private Position position;

    private void showRoom() {
        System.out.println("당신은 [ " +  roomAt(position).name() + " ] 에 있습니다.");
        System.out.println(roomAt(position).description());
    }

    private boolean isBlocked(Position position) {
        return position.x() < 0 || position.y() >= height || position.x() >= width || roomAt(position) == null;
    }

    private void tryMove(int incX, int incY) {
        if (isBlocked(position.shift(incX, incY))) {
            showRoom();
        } else {
            this.position = position.shift(incX, incY);
            showRoom();
        }
    }


    private Room roomAt(Position position) {
        return rooms[position.x() + position.y() * width];
    }

}