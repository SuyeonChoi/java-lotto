package lotterymachine.view;

import lotterymachine.dto.LotteryResultDto;
import lotterymachine.model.LotteryTicket;

import java.util.List;

public class OutputView {

    public static void printNumberOfTicket(int number) {
        System.out.printf("%d개를 구매했습니다.%n", number);
    }

    public static void printLotteryTickets(List<LotteryTicket> lotteryTickets) {
        StringBuilder stringBuilder = new StringBuilder();
        for (LotteryTicket lotteryTicket : lotteryTickets) {
            stringBuilder.append(lotteryTicket.getBalls().toString()).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static void printStatistics(List<LotteryResultDto> winningLotteries) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("당첨 통계").append("\n").append("---------").append("\n");
        winningLotteries.forEach(lottery -> stringBuilder.append(getLotteryStatistic(lottery)));
        System.out.println(stringBuilder);
    }

    private static String getLotteryStatistic(LotteryResultDto lottery) {
        if (lottery.isBonus()) {
            return String.format("%d개 일치, 보너스 볼 일치 (%d원) - %d개%n", lottery.getCountOfMatchingNumbers(),
                    lottery.getWinningPrice(), lottery.getNumberOfMatchingTicket());
        }
        return String.format("%d개 일치 (%d원) - %d개%n", lottery.getCountOfMatchingNumbers(),
                lottery.getWinningPrice(), lottery.getNumberOfMatchingTicket());
    }

    public static void printProfitRate(double calculateProfitRate) {
        System.out.printf("총 수익률은 %.2f입니다.", calculateProfitRate);
        System.out.printf("(기준이 1이기 때문에 결과적으로 %s라는 의미임)", extracted(calculateProfitRate));
    }

    private static String extracted(double calculateProfitRate) {
        if (calculateProfitRate < 1) {
            return "손해";
        }
        return "이득";
    }

    public static void printException(String message) {
        System.out.println(message);
    }
}
