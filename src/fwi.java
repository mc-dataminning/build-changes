import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fwi {
   fwi a = new fwi() {
      @Override
      public CompletableFuture<Optional<clj>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fwi a(UserApiService $$0, fdt $$1, Path $$2) {
      return (fwi)($$1.g() == fdt.a.c ? new fvp($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<clj>> a();

   boolean b();
}
