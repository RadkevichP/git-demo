package pl.pingwit.classwork_12.recursion;

/**
 * @author Pavel Radkevich
 * @since 7.03.23
 */
public class FolderApp {

    public static void main(String[] args) {
        Folder folder7 = new Folder("folder-7");
        folder7.setFile("Dummy file");

        Folder folder6 = new Folder("folder-6");
        folder6.setFolder(folder7);

        Folder folder5 = new Folder("folder-5");
        folder5.setFolder(folder6);
        folder5.setFile("Just file");

        Folder folder4 = new Folder("folder-4");
        folder4.setFolder(folder5);

        Folder folder3 = new Folder("folder-3");
        folder3.setFolder(folder4);

        Folder folder2 = new Folder("folder-2");
        folder2.setFolder(folder3);

        Folder folder1 = new Folder("folder-1");
        folder1.setFolder(folder2);

        FolderTraverser folderTraverser = new FolderTraverser();
        System.out.println("-----------------------------------------------");
        String path = folderTraverser.printPath(folder1, "/usr/pavel");

        System.out.println(path);
    }
}
