package homeWork2.gb;

import java.util.Arrays;

/*
Изображение представлено целочисленным изображением сетки m x n,
где изображение [i] [j] представляет значение пикселя изображения.
Вам также даны три целых числа sr, sc и color.
Вы должны выполнить заливку изображения, начиная с пиксельного изображения[sr][sc].
Чтобы выполнить заливку потоком, рассмотрим начальный пиксель, плюс любые пиксели,
соединенные в 4 направлениях с начальным пикселем того же цвета,
что и начальный пиксель, плюс любые пиксели, соединенные в 4 направлениях с этими пикселями
(также с тем же цветом), и так далее. Замените цвет всех вышеупомянутых пикселей на color.

Верните измененное изображение после выполнения заливки потоком.

Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
 */
public class Fill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(image));
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int color, int cur) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || cur != image[sr][sc]) {
            return;
        }
        image[sr][sc] = color;
        fill(image, sr - 1, sc, color, cur);
        fill(image, sr + 1, sc, color, cur);
        fill(image, sr, sc - 1, color, cur);
        fill(image, sr, sc + 1, color, cur);
    }
}
