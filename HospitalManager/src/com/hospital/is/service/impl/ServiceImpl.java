package com.hospital.is.service.impl;

import java.util.Map;

import com.hospital.is.service.Service;

public class ServiceImpl<T> implements Service<T> {

	@Override
	public T create(T t) {
		return null;
	}

	@Override
	public Map<Integer, T> getAll() {
//		return (Map<Integer, T>) StaticDatabase.getGenericMap(t.getClass().getName());
		return null;
	}

	@Override
	public T getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T t, long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
