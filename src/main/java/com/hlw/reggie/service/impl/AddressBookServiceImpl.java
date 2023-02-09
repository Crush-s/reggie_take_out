package com.hlw.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlw.reggie.entity.AddressBook;
import com.hlw.reggie.mapper.AddressBookMapper;
import com.hlw.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements
        AddressBookService {

}
