import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record wh(xl a, Optional<Path> b, Optional<URI> c) {
   public wh(xl $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
