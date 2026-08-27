import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fxd {
   fxd a = new fxd() {
      @Override
      public CompletableFuture<Optional<cly>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fxd a(UserApiService $$0, feo $$1, Path $$2) {
      return (fxd)($$1.g() == feo.a.c ? new fwk($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cly>> a();

   boolean b();
}
