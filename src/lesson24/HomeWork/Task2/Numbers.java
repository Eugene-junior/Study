package HomeWork.Task2;

import java.util.Objects;

public class Numbers {
    Integer num;

    private Numbers(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "num=" + num +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return Objects.equals(num, numbers.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
