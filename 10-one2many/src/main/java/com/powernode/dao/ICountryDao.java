package com.powernode.dao;

import com.powernode.po.Country;

public interface ICountryDao {

    Country selectCountryById(int cid);

}
