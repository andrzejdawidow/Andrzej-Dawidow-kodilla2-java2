package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Test
    public void testInvoiceDaoSave() {
    //Given
        Product product1 = new Product("eggs");
        Item item1 = new Item(new BigDecimal(10),
                200, new BigDecimal(100));
        List<Item> items = new ArrayList<>();
        items.add(item1);
        item1.setProduct(product1);
        Invoice invoice = new Invoice("One", items);
        item1.setInvoice(invoice);
    //When
        productDao.save(product1);
        invoiceDao.save(invoice);
        int id = invoice.getId();
    //Then
        Assert.assertNotEquals(0, id);
    //CleanUp
        // invoiceDao.delete(id);

    }
}
