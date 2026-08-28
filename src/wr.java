import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record wr(xv a, Optional<Path> b, Optional<URI> c) {
   public wr(xv $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
