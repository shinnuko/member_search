package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BoardDto;

@Service
public class BoardDao implements BoardRepository {
	    @Autowired
	    BoardRepository board;

	@Override
	public List<BoardDto> findAll() {
		
		return board.findAll();
	}

	@Override
	public List<BoardDto> findAll(Sort sort) {
		
		return board.findAll();
	}

	@Override
	public List<BoardDto> findAllById(Iterable<Integer> ids) {
		
		return board.findAllById(ids);
	}

	@Override
	public <S extends BoardDto> List<S> saveAll(Iterable<S> entities) {
		
		return board.saveAll(entities);
	}

	@Override
	public void flush() {
		
		board.flush();

	}

	@Override
	public <S extends BoardDto> S saveAndFlush(S entity) {
		
		return board.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<BoardDto> entities) {
		
		board.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		
		board.deleteAllInBatch();

	}

	@Override
	public BoardDto getOne(Integer id) {
		
		return board.getOne(id);
	}

	@Override
	public <S extends BoardDto> List<S> findAll(Example<S> example) {
		
		return board.findAll(example);
	}

	@Override
	public <S extends BoardDto> List<S> findAll(Example<S> example, Sort sort) {
		
		return board.findAll(example, sort);
	}

	@Override
	public Page<BoardDto> findAll(Pageable pageable) {
		
		return board.findAll(pageable);
	}

	@Override
	public <S extends BoardDto> S save(S entity) {
		
		return board.save(entity);
	}

	@Override
	public Optional<BoardDto> findById(Integer id) {
		
		return board.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		
		return board.existsById(id);
	}

	@Override
	public long count() {
		
		return board.count();
	}

	@Override
	public void deleteById(Integer id) {
		
		board.deleteById(id);

	}

	@Override
	public void delete(BoardDto entity) {
		// TODO 自動生成されたメソッド・スタブ
		board.delete(entity);

	}

	@Override
	public void deleteAll(Iterable<? extends BoardDto> entities) {
		// TODO 自動生成されたメソッド・スタブ
		board.deleteAll(entities);

	}

	@Override
	public void deleteAll() {
		// TODO 自動生成されたメソッド・スタブ
		board.deleteAll();
	}

	@Override
	public <S extends BoardDto> Optional<S> findOne(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return board.findOne(example);
	}

	@Override
	public <S extends BoardDto> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO 自動生成されたメソッド・スタブ
		return board.findAll(example, pageable);
	}

	@Override
	public <S extends BoardDto> long count(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return board.count(example);
	}

	@Override
	public <S extends BoardDto> boolean exists(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return board.exists(example);
	}

}
