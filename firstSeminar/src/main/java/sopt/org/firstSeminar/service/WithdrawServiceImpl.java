package sopt.org.firstSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.firstSeminar.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class WithdrawServiceImpl implements WithdrawService {

    private final AccountRepository accountRepository;

    @Override
    public int withdrawMoney(int money) {
        int balance = accountRepository.outMoney(money);
        return balance;
    }
}
