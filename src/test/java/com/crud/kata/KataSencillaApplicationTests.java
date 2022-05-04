package com.crud.kata;

import com.crud.kata.model.Todo;
import com.crud.kata.repository.ITodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;


import java.util.List;
import java.util.Optional;

import static  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)

class KataSencillaApplicationTests {
	@Autowired
	ITodoRepository iTodoRepository;

//guardar usuario

	@Test
	public void testSave(){
		Todo todoModel = new Todo("Realizar Back Spring Boot","Adryan Ynfante", false);
		Todo todoModelRegistrado = iTodoRepository.save(todoModel);
		assertNotNull(todoModelRegistrado);
	}


}
