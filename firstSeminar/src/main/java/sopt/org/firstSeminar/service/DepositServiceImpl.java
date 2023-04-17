package sopt.org.firstSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.firstSeminar.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService{

    private final AccountRepository accountRepository;

    @Override
    public int depositMoney(int money) {
        int balance = accountRepository.inMoney(money);
        return balance;
    }
}
