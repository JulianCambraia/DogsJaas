package br.com.jfac.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.jfac.dao.DogDAO;
import br.com.jfac.model.Dog;

@Stateless
public class DogFacadeImpl implements DogFacade {
	
	@EJB
	private DogDAO dogDAO;

	@Override
	public void save(Dog dog) {
		isDogWithAllData(dog);
		
		dogDAO.save(dog);

	}

	@Override
	public Dog update(Dog dog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Dog dog) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dog find(int entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dog> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private void isDogWithAllData(Dog dog) {
		boolean hasError = false;
		
		if (dog == null) {
			hasError = true;
		}
		
		if (dog.getName() == null){
			hasError = true;
		}
		
		if (dog.getWeight() <= 0) {
			hasError = true;
		}
		
		if (hasError) {
			throw new IllegalArgumentException("N�o foram encontrados dados para a classe Dog. Verifique o Nome ou se o Peso possuem valor informado.");
		}
	}
}
