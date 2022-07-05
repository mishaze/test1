import java.util.Arrays;
public class testTask {

    /**
     * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset
     * на количество позиций readLength. Новые цены округляем “вниз”,
     * до меньшего целого числа.
     *
     * @param price      - исходные цены, цена должна быть больше нуля
     * @param discount   - % скидки, должен попадать в диапазон от 1 до 99
     * @param offset     - номер позиции, с которой нужно применить скидку, должен быть больше или равен нулю
     * @param readLength - количество позиций, к которым нужно применить скидку, должно быть больше нуля
     * @return - массив новых цен.
     */
    public int[] decryptData(int[] price,
                             int discount,
                             int offset,
                             int readLength) {

        int newLength = price.length - (offset + readLength);
        if (newLength < 0)
            throw new IllegalArgumentException();

        int[] result = Arrays.copyOfRange(price, offset, offset + readLength);

        for (int i = 0; i < result.length; i++)
            result[i] = result[i] - (result[i] * discount / 100);

        return result;

    }
}
