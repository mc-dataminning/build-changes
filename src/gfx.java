import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gfx {
   gfx a = new gfx() {
      @Override
      public CompletableFuture<Optional<cpz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gfx a(UserApiService $$0, fms $$1, Path $$2) {
      return (gfx)($$1.g() == fms.a.c ? new gfd($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpz>> a();

   boolean b();
}
