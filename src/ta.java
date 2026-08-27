import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@FunctionalInterface
public interface ta {
   ta a = ($$0, $$1) -> CompletableFuture.completedFuture($$1);

   CompletableFuture<tf> decorate(@Nullable akl var1, tf var2);
}
