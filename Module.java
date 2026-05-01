public class Module {
    private String name;
    private int level;
    private boolean passed;

    public Module(String name, int level, boolean passed) {
        this.name = name;
        this.level = level;
        this.passed = passed;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}