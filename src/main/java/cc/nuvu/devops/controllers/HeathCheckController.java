package cc.nuvu.devops.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HeathCheckController {

      @GetMapping(value = "",  produces = "application/json")
      public ResponseEntity<?> healthCheck() {
            return ResponseEntity.ok().body("{ \"message\" : \"ok\"}");
      }
}
