package pl.pingwit.classwork_12.recursion;

/**
 * @author Pavel Radkevich
 * @since 7.03.23
 */
public class Folder {

    private final String name;
    private String file;
    private Folder folder;

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", file='" + file + '\'' +
                ", folder=" + folder +
                '}';
    }
}
