import presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter ps = new Presenter();
        try{
            ps.main();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}