package app.mirtiza.linkservice.controllers;

import app.mirtiza.linkservice.dtos.CreateLinkDto;
import app.mirtiza.linkservice.models.Link;
import app.mirtiza.linkservice.services.LinkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("links")
public class LinkController {
    private final LinkService linkService;

    @PostMapping
    ResponseEntity<Link> createLink(@Valid @RequestBody CreateLinkDto linkDto) {
        return new ResponseEntity<>(linkService.createLink(linkDto), HttpStatus.CREATED);
    }
}
