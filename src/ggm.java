import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ggm {
   ggm a = new ggm() {
      @Override
      public CompletableFuture<Optional<coz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static ggm a(UserApiService $$0, flv $$1, Path $$2) {
      return (ggm)($$1.g() == flv.a.c ? new gfs($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<coz>> a();

   boolean b();
}
