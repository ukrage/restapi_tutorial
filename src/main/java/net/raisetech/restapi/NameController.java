package net.raisetech.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class NameController {
    @GetMapping("/names")
    public List<NameResponse> getNames() {
        List<NameResponse> names = List.of(
                new NameResponse("Keigo", "Ura"),
                new NameResponse("Hanako", "Yamada"),
                new NameResponse("Ichiro", "Midorikawa")
        );
        return names;
    }

    @PostMapping("/names")
    public ResponseEntity<CreateResponse> createName(@RequestBody nameCreateRequest nameRequest, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/names/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body(new CreateResponse("a new name is created."));
    }
}
