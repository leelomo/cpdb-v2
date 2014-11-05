
package hk.ed.cpdb.dao;

import hk.ed.cpdb.entity.Role;
import hk.ed.cpdb.entity.User;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao {

	@SuppressWarnings("unchecked")
	public User getByName(String name){
		Criteria cri = getSessionFactory().getCurrentSession().createCriteria(User.class, "ur");
		cri.add(Restrictions.eq("ur.name", name));
		cri.createAlias("ur.role", "role", JoinType.INNER_JOIN);
		return (User) cri.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public User getById(Integer id){
		return (User) getSessionFactory().getCurrentSession().get(User.class, id);

	}

	@SuppressWarnings("unchecked")
	public List<User> listAllUser(){
		Criteria cri = getSessionFactory().getCurrentSession().createCriteria(User.class, "ur");
		cri.createAlias("ur.role", "role", JoinType.INNER_JOIN);
		return cri.list();
	}

	@SuppressWarnings("unchecked")
	public List<Role> listAllRole(){
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().createCriteria(Role.class).list();
	}
	
	@SuppressWarnings("unchecked")
	public Role getRoleById(Integer id){
		return (Role) getSessionFactory().getCurrentSession().get(Role.class, id);

	}

	public List<Integer> getTeamMembers(Integer userId){
		Query query = getSessionFactory().getCurrentSession().createQuery(
		        "Select Distinct tm1.user.id from TeamMember tm1 where tm1.team = (select tm2.team from TeamMember tm2 where tm2.user.id = :id)");
		query.setParameter("id", userId);
		return query.list();
	}

}
