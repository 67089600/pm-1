package com.icker.pm.service;

import java.util.List;

import com.icker.pm.pojo.Discuss;
import com.icker.pm.pojo.Project;
import com.icker.pm.vo.DiscussVO;

public interface DiscussService {
	public List<Discuss> findAll(Project project) throws Exception;
	public boolean save(Discuss discuss) throws Exception;
	public boolean update(Discuss discuss) throws Exception;
	public boolean remove(Discuss discuss) throws Exception;
	public Discuss findById(Discuss discuss) throws Exception;
	public List<DiscussVO> findAllVOs(Project project) throws Exception;
	public boolean save(DiscussVO vo) throws Exception;
	public List<DiscussVO> findByType(Project project, String type) throws Exception;
	public void update(DiscussVO vo) throws Exception;
	public Discuss findById(String id) throws Exception;
	public List<Discuss> findByTitle(String proId, String title) throws Exception;
}
