import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ggj {
   ggj a = new ggj() {
      @Override
      public CompletableFuture<Optional<cox>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static ggj a(UserApiService $$0, flt $$1, Path $$2) {
      return (ggj)($$1.g() == flt.a.c ? new gfp($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cox>> a();

   boolean b();
}
