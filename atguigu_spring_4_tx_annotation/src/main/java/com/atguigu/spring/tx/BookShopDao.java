package com.atguigu.spring.tx;

public interface BookShopDao {

    /**
     * ������Ż�ȡ��ĵ���
     */
    int findBookPriceByIsbn(String isbn);

    /**
     * �������Ŀ��. ʹ��Ŷ�Ӧ�Ŀ�� - 1
     */
    void updateBookStock(String isbn);

    /**
     * �����û����˻����: ʹ username �� balance - price
     */
    void updateUserAccount(String username, int price);
}
