package sopt.org.firstSeminar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.firstSeminar.service.BalanceService;
import sopt.org.firstSeminar.service.DepositService;
import sopt.org.firstSeminar.service.WithdrawService;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class BankController {

    private final BalanceService balanceService;
    private final DepositService depositService;
    private final WithdrawService withdrawService;

    @GetMapping("/balance-inquiry")
    public String balanceInquiryCredit() {
        int balance = balanceService.balanceInquiryMoney();
        return "잔액 - " + balance;
    }

    @PostMapping("/deposit")
    public String depositCredit(@RequestBody RequestDto request) {
        int balance = depositService.depositMoney(request.getMoney());
        return request.getMoney() + "원 입금했습니다.\n" + "잔액 - " + balance;
    }

    @PostMapping("/withdraw")
    public String withdrawCredit(@RequestBody RequestDto request) {
        int balance = withdrawService.withdrawMoney(request.getMoney());
        return request.getMoney() + "원 출금했습니다.\n" + "잔액 - " + balance;
    }
}
