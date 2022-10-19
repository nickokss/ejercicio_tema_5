package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;
@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	CursoDao dao;
	
	@Override
	public List<Curso> cursos() {
		return dao.findAll();
	}

	@Override
	public Curso buscarCurso(int id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void altaCurso(Curso curso) {
		dao.save(curso);

	}

	@Override
	public void actualizarCurso(Curso curso) {
		dao.save(curso);

	}

	@Override
	public List<Curso> eliminarCurso(int id) {
		dao.deleteById(id);
		return dao.findAll();
	}

}
