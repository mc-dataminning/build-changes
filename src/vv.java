import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record vv(xa a, Optional<Path> b, Optional<URI> c) {
   public vv(xa $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
