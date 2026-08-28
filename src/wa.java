import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record wa(xe a, Optional<Path> b, Optional<URI> c) {
   public wa(xe $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
