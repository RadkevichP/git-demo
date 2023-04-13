package pl.pingwit.classwork_12.recursion;

/**
 * @author Pavel Radkevich
 * @since 7.03.23
 */
public class FolderTraverser {

    public String printPath(Folder folder, String path) {
        String folderName = folder.getName();
        if (folder.getFile() != null) {
            System.out.printf("Мы находимся в папке %s и в ней лежит файл %s", folderName, folder.getFile());
            System.out.println();
        }
        path = path + "/" + folderName;
        if (folder.getFolder() == null) {
            return path;
        }
        return printPath(folder.getFolder(), path);
    }
}
