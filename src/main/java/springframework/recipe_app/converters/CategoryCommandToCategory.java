package springframework.recipe_app.converters;

import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.stereotype.Component;
import springframework.recipe_app.commands.CategoryCommand;
import springframework.recipe_app.domain.Category;

import org.springframework.core.convert.converter.Converter;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
