package sopt.org.firstSeminar.repository;

public interface AccountRepository {

    int getMoney();
    int inMoney(int money);
    int outMoney(int money);
}
