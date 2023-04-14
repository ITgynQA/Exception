public class NotFoundException extends RuntimeException {
    private int id;

    public NotFoundException(int id, String msg) {

        super(msg = "Element with this id" + id + "not found");
        this.id = id;
    }
}
