package sopt.org.firstSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.firstSeminar.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService{

    private final AccountRepository accountRepository;

    @Override
    public int balanceInquiryMoney() {
        int balance = accountRepository.getMoney();
        return balance;
    }
}
