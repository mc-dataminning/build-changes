import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record vq(wv a, Optional<Path> b, Optional<URI> c) {
   public vq(wv $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
