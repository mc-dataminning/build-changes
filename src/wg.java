import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record wg(xk a, Optional<Path> b, Optional<URI> c) {
   public wg(xk $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
