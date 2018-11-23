package playing.kolade.com.interfaceinjava;

public class KickBoxer implements Fighting{

    @Override
    public String throwJab() {
        return "throw harder jab";
    }

    @Override
    public String throwCross() {
        return "throw unprofessional cross";
    }

    @Override
    public String throwHook() {
        return "throw few hooks";
    }

    @Override
    public String throwUppercut() {
        return "throw weak but fast uppercut";
    }
}
