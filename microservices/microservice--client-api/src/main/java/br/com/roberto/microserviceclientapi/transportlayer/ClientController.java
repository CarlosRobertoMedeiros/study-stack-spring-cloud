package br.com.roberto.microserviceclientapi.transportlayer;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@Tag(name = "Cadastro Negativo", description = "Operações relacionadas ao Cadastro Negativo")
@RestController
@RequestMapping("api/v1")
public class ClientController {

    @Operation(summary = "Obtém todos os cadastrados negativados")
    @ApiResponses(value = {

            @ApiResponse(responseCode = "400", description = "Negativados não encontrado",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "500", description = "Erro interno",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),
            @ApiResponse(responseCode = "501", description = "Ainda não implementado",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Void.class))}),

    })

    @GetMapping("/")
    public Collection<Book> findBooks() {
        Collection<Book> books = new ArrayList<>();
        books.add(new Book("40"));
        books.add(new Book("20"));
        return books;
    }


}
