import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gby {
   gby a = new gby() {
      @Override
      public CompletableFuture<Optional<cnz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gby a(UserApiService $$0, fjc $$1, Path $$2) {
      return (gby)($$1.g() == fjc.a.c ? new gbf($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cnz>> a();

   boolean b();
}
