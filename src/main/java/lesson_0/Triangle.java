package lesson_0;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Triangle {
    private int a;
    private int b;
    private int c;

    private void checkSidesArePositive(){
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("Triangle is invalid: sides must be positive");
        }
    }

    private void checkValidTriangle(){
        if (a >= b+c || b >= a+c || c >= b+a){
            throw new IllegalArgumentException("Triangle is invalid: one side greater than sum of another sides");
        }
    }
    public int countPerimeter() {
        checkSidesArePositive();
        checkValidTriangle();
        return a+b+c;
    }
}
