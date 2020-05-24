package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BordDto;

@Service
public class BordDao implements BordRepository {
	    @Autowired
	    BordRepository bord;

	@Override
	public List<BordDto> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAll();
	}

	@Override
	public List<BordDto> findAll(Sort sort) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAll();
	}

	@Override
	public List<BordDto> findAllById(Iterable<Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAllById(ids);
	}

	@Override
	public <S extends BordDto> List<S> saveAll(Iterable<S> entities) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO 自動生成されたメソッド・スタブ
		bord.flush();
		
	}

	@Override
	public <S extends BordDto> S saveAndFlush(S entity) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<BordDto> entities) {
		// TODO 自動生成されたメソッド・スタブ
		bord.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO 自動生成されたメソッド・スタブ
		bord.deleteAllInBatch();
		
	}

	@Override
	public BordDto getOne(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.getOne(id);
	}

	@Override
	public <S extends BordDto> List<S> findAll(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAll(example);
	}

	@Override
	public <S extends BordDto> List<S> findAll(Example<S> example, Sort sort) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAll(example, sort);
	}

	@Override
	public Page<BordDto> findAll(Pageable pageable) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAll(pageable);
	}

	@Override
	public <S extends BordDto> S save(S entity) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.save(entity);
	}

	@Override
	public Optional<BordDto> findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.existsById(id);
	}

	@Override
	public long count() {
		// TODO 自動生成されたメソッド・スタブ
		return bord.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		bord.deleteById(id);
		
	}

	@Override
	public void delete(BordDto entity) {
		// TODO 自動生成されたメソッド・スタブ
		bord.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<? extends BordDto> entities) {
		// TODO 自動生成されたメソッド・スタブ
		bord.deleteAll(entities);
		
	}

	@Override
	public void deleteAll() {
		// TODO 自動生成されたメソッド・スタブ
		bord.deleteAll();
	}

	@Override
	public <S extends BordDto> Optional<S> findOne(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findOne(example);
	}

	@Override
	public <S extends BordDto> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.findAll(example, pageable);
	}

	@Override
	public <S extends BordDto> long count(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.count(example);
	}

	@Override
	public <S extends BordDto> boolean exists(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return bord.exists(example);
	}

}
