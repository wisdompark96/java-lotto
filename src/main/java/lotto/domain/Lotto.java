package lotto.domain;

import java.util.List;

public class Lotto {
    private static final int LOTTO_LENGTH = 6;
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int MIN_LOTTO_NUMBER = 1;
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateLength(numbers);
        validateDuplicateNumber(numbers);
        for (Integer number : numbers) {
            validateNumber(number);
        }
        this.numbers = numbers;
    }

    public String printNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : numbers) {
            stringBuilder.append(number + ", ");
        }
        stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length() - 1, "");
        return stringBuilder.toString();
    }

    public int findMatchingCount(List<Integer> winningNum) {
        return (int) numbers.stream().filter(winningNum::contains).count();
    }

    private void validateLength(List<Integer> numbers) {
        if (numbers.size() != LOTTO_LENGTH) {
            throw new IllegalArgumentException("로또 숫자 수는 6개여야 합니다.");
        }
    }

    private void validateNumber(Integer number) {
        if (number < MIN_LOTTO_NUMBER) {
            throw new IllegalArgumentException("로또는 0보다 커야 합니다.");
        }

        if (number > MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException("로또 최대 값은 45입니다.");
        }
    }

    private void validateDuplicateNumber(List<Integer> numbers) {
        long length = numbers.stream().distinct().count();
        if (length != LOTTO_LENGTH) {
            throw new IllegalArgumentException("로또 수는 중복되면 안됩니다.");
        }
    }
}
