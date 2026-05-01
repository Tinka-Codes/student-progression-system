import java.util.ArrayList;

public class Student {
    private String name;
    private String type; // "first" or "returning"
    private int level;
    private ArrayList<Module> modules;

    public Student(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.modules = new ArrayList<>();
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}