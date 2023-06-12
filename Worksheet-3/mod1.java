import java.util.Scanner;
class area
{
    int width;
    int length;
    int height;
    area()
    {
        width = 5;
        length = 6;
        height = 1;
    }
    void volume()
    {
        int volume = width * height * length;
        System.out.println(volume);
    }
}


class mod1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            area obj = new area();
            obj.volume();
            //System.out.println(obj.volume);
        }
    }
}