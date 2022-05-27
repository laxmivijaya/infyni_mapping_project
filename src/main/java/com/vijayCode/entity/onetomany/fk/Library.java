package com.vijayCode.entity.onetomany.fk;

import com.vijayCode.entity.onetomany.fk.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(name="library")
@AllArgsConstructor
@NoArgsConstructor
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer libraryId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="bookId_fk")
    private List<Book> books;
}
