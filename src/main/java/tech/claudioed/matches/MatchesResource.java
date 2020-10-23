package tech.claudioed.matches;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/matches")
public class MatchesResource {

    @GetMapping("/{id}")
    public ResponseEntity<Match> matches(@PathVariable("id")String id){
        final var match = Match.builder().awayTeam("Real Madrid").homeTeam("Barcelona").championship("UEFA Champions League").build();
        return ResponseEntity.ok(match);
    }

}
