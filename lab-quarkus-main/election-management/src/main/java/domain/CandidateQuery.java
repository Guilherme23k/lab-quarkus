package domain;

import org.inferred.freebuilder.FreeBuilder;
import org.inferred.freebuilder.shaded.com.google.googlejavaformat.Op;

import java.util.Optional;
import java.util.Set;

@FreeBuilder

public interface CandidateQuery{
    Optional<Set<String>> ids();
    Optional<String> name();
    class Builder extends CandidateQuery_Builder {}
}
