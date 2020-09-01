package pack;

public class ClassWithLongStrings {

    public void foo(){}

    public static void main(String[] args) {
        System.out.println("git rebase has two primary backends: apply and merge. (The apply backend used to be known as the am backend, but the name led to confusion as it looks like a verb instead of a noun. Also, the merge backend used to be known as the interactive backend, but it is now used for non-interactive cases as well. Both were renamed based on lower-level functionality that underpinned each.) There are some subtle differences in how these two backends behave:\n" +
                "\n" +
                "Empty commits\n" +
                "The apply backend unfortunately drops intentionally empty commits, i.e. commits that started empty, though these are rare in practice. It also drops commits that become empty and has no option for controlling this behavior.\n" +
                "\n" +
                "The merge backend keeps intentionally empty commits by default (though with -i they are marked as empty in the todo list editor, or they can be dropped automatically with --no-keep-empty).\n" +
                "\n" +
                "Similar to the apply backend, by default the merge backend drops commits that become empty unless -i/--interactive is specified (in which case it stops and asks the user what to do). The merge backend also has an --empty={drop,keep,ask} option for changing the behavior of handling commits that become empty.");
    }
}
