package com.PetStop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PetStop.model.Pet;
import com.PetStop.model.User;

@Repository
public interface PetRepository extends PagingAndSortingRepository<Pet, Integer>,JpaRepository<Pet,Integer>,CrudRepository<Pet,Integer> {

	
	
	public List<Pet> findAllByPetNameOrPetAgeOrPetPlace(String petname,int petage,String petplace);
	//public List<Pet> findAllByOwnerId(int ownerid);
    Pet save(Pet pet);
	//List<Pet> findAll();
	//Page<Pet> findAll(Pageable pagable);
	public List<Pet> findAllByUser(User user);
	public List<Pet> findAllByUserNot(User user);
	public List<Pet> findAllByUserNotOrUserNull(User user);
	public Pet findByPetId(Pet pet);
	public Pet findByPetId(Integer id);
	
	
	
	
	/*@Query(name="select * from pets where ownerid!= :id", nativeQuery=true)
	public List<Pet> findAll(@Param("id") int id);
	*/
}