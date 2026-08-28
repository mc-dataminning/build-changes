import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record vx(xc a, Optional<Path> b, Optional<URI> c) {
   public vx(xc $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
