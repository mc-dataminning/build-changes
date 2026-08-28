import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record vx(xg a, Optional<Path> b, Optional<URI> c) {
   public vx(xg $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
