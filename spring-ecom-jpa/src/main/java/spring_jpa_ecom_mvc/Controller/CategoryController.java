package spring_jpa_ecom_mvc.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import spring_jpa_ecom_mvc.DTO.CategoryDTO;
import spring_jpa_ecom_mvc.Entities.Category;
import spring_jpa_ecom_mvc.Services.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categorylist")
    public List<Category> categoryList()
    {
        List<Category> allCategories = categoryService.findAllCategories();
        return allCategories;
    };

    @GetMapping("/findbyId/{id}")
    public Category findById(@PathVariable int id)
    {
        Category category = categoryService.findCategoryById(id);
        return category;
    };

    @RequestMapping("/getone")
    public CategoryDTO getCategory(
            @RequestParam int id,
            @RequestParam String name
    )
    {
        System.out.println("Category id:-"+id+",CategoryName:-"+name);
            return null;
    }

    @RequestMapping(value = "/catfrombody",method = RequestMethod.POST)
    public Category getCategoryFromBody(
            @RequestBody CategoryDTO categoryDTO
    )
    {
        Category category = new Category();
        category.setCategoryName(categoryDTO.getCategoryName());
        category.setCategoryDescription(categoryDTO.getCategoryDescription());
        Category category1 = categoryService.createCategory(category);
        return category1;

    };

    //image uploading --> we preferably use the params
    @PostMapping("/image")
    public String imageUploader
            (@RequestParam("file") MultipartFile file)
    {
        String filename = file.getOriginalFilename();
        return  filename;

    };

    //controller Level Exception Handler
//    @ExceptionHandler(RuntimeException.class)
//    public String handleException(RuntimeException ex)
//    {
//        System.out.println("Run-Time Exception"+ex.getMessage());
//        return "error occurred"+ex.getMessage();
//    };

//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<String> handleException(RuntimeException ex)
//    {
//        System.out.println("Error Occurred "+ex.getMessage());
////        return ResponseEntity.status(400).body(ex.getMessage());
//        //if error codes not remembered then
//
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body("Error Occurred:-"+ex.getMessage());
//    }

}
