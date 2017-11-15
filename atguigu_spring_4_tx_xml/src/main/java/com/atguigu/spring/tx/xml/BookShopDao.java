package com.atguigu.spring.tx.xml;

public interface BookShopDao {

    /**
     * ������Ż�ȡ��ĵ���
     * @param isbn
     * @return
     */
    int findBookPriceByIsbn(String isbn);

    /**
     * �������Ŀ��. ʹ��Ŷ�Ӧ�Ŀ�� - 1
     * @param isbn
     */
    void updateBookStock(String isbn);

    /**
     * �����û����˻����: ʹ username �� balance - price
     * @param username
     * @param price
     */
    void updateUserAccount(String username, int price);
}
