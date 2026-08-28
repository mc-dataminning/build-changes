import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record wf(xj a, Optional<Path> b, Optional<URI> c) {
   public wf(xj $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
