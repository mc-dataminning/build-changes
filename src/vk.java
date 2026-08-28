import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record vk(wo a, Optional<Path> b, Optional<URI> c) {
   public vk(wo $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
