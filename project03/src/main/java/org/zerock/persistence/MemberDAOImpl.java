<<<<<<< HEAD
package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}

	@Override
	public String idCheck(String id) {
		return sqlSession.selectOne(namespace+".idCheck",id);
		
	}
	
	
}
=======
package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}

	@Override
	public String idCheck(String id) {
		return sqlSession.selectOne(namespace+".idCheck",id);
		
	}
	
	
}
>>>>>>> refs/remotes/origin/master
