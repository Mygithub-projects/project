package com.PetStop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PetStop.model.Pet;
import com.PetStop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//public void buyPet();
	//public List<Pet> getMyPets();
	//public void authenticateUser();
	public User save(User user);
	public List<User> findAll();
	/*@Query(value="select petuser.id from petuser where petuser.username=?", nativeQuery=true)
	public User findUserById(@Param("username") String username);*/
	/*@Query(value="select * from petuser u where u.userpasswd=:password and u.username=:username",nativeQuery=true)
	public User findUserByName(@Param("password") String password,@Param("username") String username);*/
	public User findByUserNameAndPassword(String userName, String password);
	public int findOwnerIdByUserName(String userName);
	
	 public User findByUserName(String userName); 
}
