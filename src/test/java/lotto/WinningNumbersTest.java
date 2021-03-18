package lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("당첨자테스트")
class WinningNumbersTest {
    LottoNumbers lottoNumbers1;
    LottoNumbers lottoNumbers2;
    LottoNumbers lottoNumbers3;
    LottoNumbers lottoNumbers4;
    LottoNumbers lottoNumbers5;
    LottoNumbers lottoNumbers6;
    LottoNumbers lottoNumbers7;
    LottoNumbers lottoNumbers8;
    LottoNumbers lottoNumbers9;
    LottoNumbers lottoNumbers10;
    LottoNumbers lottoNumbers11;
    LottoNumbers lottoNumbers12;
    LottoNumbers lottoNumbers13;
    LottoNumbers lottoNumbers14;

    @Test
    @DisplayName("[8, 21, 23, 41, 42, 43]\n" +
            "[3, 5, 11, 16, 32, 38]\n" +
            "[7, 11, 16, 35, 36, 44]\n" +
            "[1, 8, 11, 31, 41, 42]\n" +
            "[13, 14, 16, 38, 42, 45]\n" +
            "[7, 11, 30, 40, 42, 43]\n" +
            "[2, 13, 22, 32, 38, 45]\n" +
            "[23, 25, 33, 36, 39, 41]\n" +
            "[1, 3, 5, 14, 22, 45]\n" +
            "[5, 9, 38, 41, 43, 44]\n" +
            "[2, 8, 9, 18, 19, 21]\n" +
            "[13, 14, 18, 21, 23, 35]\n" +
            "[17, 21, 29, 37, 42, 45]\n" +
            "[3, 8, 27, 30, 35, 44]\n" +
            "\n" +
            "지난 주 당첨 번호를 입력해 주세요.\n" +
            "1, 2, 3, 4, 5, 6\n" +
            "\n" +
            "당첨 통계\n" +
            "---------\n" +
            "3개 일치 (5000원)- 1개\n" +
            "4개 일치 (50000원)- 0개\n" +
            "5개 일치 (1500000원)- 0개\n" +
            "6개 일치 (2000000000원)- 0개\n")
    void ex1() {
        List<LottoNumbers> lottoNumbers = new ArrayList<>();

        lottoNumbers.add(lottoNumbers1);
        lottoNumbers.add(lottoNumbers2);
        lottoNumbers.add(lottoNumbers3);
        lottoNumbers.add(lottoNumbers4);
        lottoNumbers.add(lottoNumbers5);
        lottoNumbers.add(lottoNumbers6);
        lottoNumbers.add(lottoNumbers7);
        lottoNumbers.add(lottoNumbers8);
        lottoNumbers.add(lottoNumbers9);
        lottoNumbers.add(lottoNumbers10);
        lottoNumbers.add(lottoNumbers11);
        lottoNumbers.add(lottoNumbers12);
        lottoNumbers.add(lottoNumbers13);
        lottoNumbers.add(lottoNumbers14);

        WinningNumbers winningNumbers = new WinningNumbers(new int[]{1, 2, 3, 4, 5, 6});
        assertThat(winningNumbers.getWinNumbers(lottoNumbers).get(3))
                .isEqualTo(1);
        assertThat(winningNumbers.getWinNumbers(lottoNumbers).get(4))
                .isEqualTo(0);
        assertThat(winningNumbers.getWinNumbers(lottoNumbers).get(5))
                .isEqualTo(0);
        assertThat(winningNumbers.getWinNumbers(lottoNumbers).get(6))
                .isEqualTo(0);
    }

    @BeforeEach
    void init() {
        lottoNumbers1 = new LottoNumbers(Arrays.asList(8, 21, 23, 41, 42, 43));
        lottoNumbers2 = new LottoNumbers(Arrays.asList(3, 5, 11, 16, 32, 38));
        lottoNumbers3 = new LottoNumbers(Arrays.asList(7, 11, 16, 35, 36, 44));
        lottoNumbers4 = new LottoNumbers(Arrays.asList(1, 8, 11, 31, 41, 42));
        lottoNumbers5 = new LottoNumbers(Arrays.asList(13, 14, 16, 38, 42, 45));
        lottoNumbers6 = new LottoNumbers(Arrays.asList(7, 11, 30, 40, 42, 43));
        lottoNumbers7 = new LottoNumbers(Arrays.asList(2, 13, 22, 32, 38, 45));
        lottoNumbers8 = new LottoNumbers(Arrays.asList(23, 25, 33, 36, 39, 41));
        lottoNumbers9 = new LottoNumbers(Arrays.asList(1, 3, 5, 14, 22, 45));
        lottoNumbers10 = new LottoNumbers(Arrays.asList(5, 9, 38, 41, 43, 44));
        lottoNumbers11 = new LottoNumbers(Arrays.asList(2, 8, 9, 18, 19, 21));
        lottoNumbers12 = new LottoNumbers(Arrays.asList(13, 14, 18, 21, 23, 35));
        lottoNumbers13 = new LottoNumbers(Arrays.asList(17, 21, 29, 37, 42, 45));
        lottoNumbers14 = new LottoNumbers(Arrays.asList(3, 8, 27, 30, 35, 44));
    }
}
