public class Test {
    public static void main(String[] args)
{
    String misc[] = {"A", "B", "C", "D", "E","F"};
    for (int skip = 1; skip < misc.length; skip += 2)
    {
        System.out.println(misc[skip] + " ");
    }
}
}
