import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record vk(wp a, Optional<Path> b, Optional<URI> c) {
   public vk(wp $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
