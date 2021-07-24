package com.pawelszpunar.module.dashboard;

import com.pawelszpunar.module.dashboard.dto.ArticleDto;
import com.pawelszpunar.module.dashboard.dto.CommentDto;
import com.pawelszpunar.module.dashboard.dto.MenuDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardRestController {

    @GetMapping("/api/dashboard/menu")
    public List<MenuDto> getDashboardMenu() {
        return List.of(
                new MenuDto("AWS", "http://michalszalkowski.com/aws/"),
                new MenuDto("Security", "http://michalszalkowski.com/security/"),
                new MenuDto("Java", "http://michalszalkowski.com/java/")
        );
    }

    @GetMapping("/api/dashboard/articles")
    public ArticleDto getDashboardArticles() {
        return new ArticleDto()
                .setTitle("Lorem ipsum dolor sit amet")
                .setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl tortor, blandit in vehicula et, egestas tempor massa. Vestibulum id placerat felis. In hac habitasse platea dictumst. Nam auctor nibh sit amet est molestie suscipit. Phasellus molestie elementum lobortis. Curabitur nisl justo, egestas sed massa sit amet, vestibulum fermentum est. In condimentum dui turpis, vel egestas lacus malesuada ut. Maecenas et feugiat orci. Integer consequat ante et tellus iaculis, a eleifend nisi congue. Donec at euismod odio. Phasellus sed enim ac orci convallis venenatis sed at mauris. In hac habitasse platea dictumst. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Donec lacinia viverra leo, at consectetur turpis ornare id. Sed elementum sem ac est lobortis scelerisque.")
                .setComments(
                        List.of(
                                new CommentDto("Michał", "test 1"),
                                new CommentDto("Ala", "test 2"),
                                new CommentDto("Marta", "test 3")
                        )
                );
    }

}
