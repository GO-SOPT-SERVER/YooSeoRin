package sopt.org.firstSeminar.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    private static int balance = 0;

    @Override
    public int getMoney() {
        return balance;
    }

    @Override
    public int inMoney(int money) {
        balance += money;
        return balance;
    }

    @Override
    public int outMoney(int money) {
        balance -= money;
        return balance;
    }
}
