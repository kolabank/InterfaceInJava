package playing.kolade.com.interfaceinjava;

public class Boxer implements Fighting {

    @Override
    public String throwJab() {
        return "throw faster jab";
    }

    @Override
    public String throwCross() {
        return "throw sleek cross";
    }

    @Override
    public String throwHook() {
        return "throw many hooks";
    }

    @Override
    public String throwUppercut() {
        return "throw very strong uppercuts";
    }
}
