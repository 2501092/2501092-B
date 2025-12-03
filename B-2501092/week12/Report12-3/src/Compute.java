public class Compute {

    // 숫자를 한글로 매핑하는 배열
    private final String[] NUMBERS = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
    // 4자리 그룹 내의 단위 배열 (천, 백, 십, 일)
    private final String[] UNITS = {"", "십", "백", "천"};
    // 4자리 그룹 간의 큰 단위 배열 (일, 만, 억, 조)
    private final String[] BIG_UNITS = {"", "만", "억", "조"};

    /**
     * 16자리 이하의 금액(long)을 한글 문자열로 변환하는 핵심 메서드
     */
    public String convertHangul(long money) {
        if (money == 0) {
            return "영";
        }

        String result = "";
        long temp = money;
        int bigUnitIndex = 0; // 큰 단위(만, 억, 조) 인덱스

        // 4자리씩 끊어서 반복 (최대 16자리 = 조까지 4번)
        while (temp > 0) {
            // 현재 4자리 블록의 숫자 (0 ~ 9999)
            int block = (int) (temp % 10000);

            // 4자리 블록을 한글로 변환 (예: 1234 -> 천이백삼십사)
            String hangulBlock = convertFourDigits(block, bigUnitIndex);

            // 현재 블록의 한글 + 큰 단위 + 이전 블록 결과
            result = hangulBlock + BIG_UNITS[bigUnitIndex] + result;

            // 다음 4자리 블록으로 이동
            temp /= 10000;
            bigUnitIndex++;
        }

        // 결과 문자열에 공백이 남아있을 경우 trim 처리
        return result.trim();
    }

    /**
     * 4자리 숫자 블록을 한글로 변환하는 내부 메서드
     * @param block 4자리 숫자 (0 ~ 9999)
     * @param bigUnitIndex 큰 단위(만, 억, 조) 인덱스 (0일 때는 '일' 단위를 생략하기 위함)
     * @return 4자리 블록의 한글 문자열
     */
    private String convertFourDigits(int block, int bigUnitIndex) {
        if (block == 0) {
            return "";
        }

        String blockHangul = "";
        int tempBlock = block;

        for (int i = 0; i < 4; i++) {
            int digit = tempBlock % 10;
            String unit = UNITS[i];

            if (digit != 0) {
                blockHangul = NUMBERS[digit] + unit + blockHangul;
            } else {
                blockHangul = unit + blockHangul;
            }

            tempBlock /= 10;
        }
        blockHangul = blockHangul.replaceAll("천|백|십", "");

        blockHangul = blockHangul.replaceAll("일십", "십");

        return blockHangul;
    }
}
