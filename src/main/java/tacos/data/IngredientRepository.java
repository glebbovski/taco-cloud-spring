package tacos.data;

import java.util.Optional;

import tacos.Ingredient;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{


}