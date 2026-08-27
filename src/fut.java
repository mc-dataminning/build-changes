import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fut {
   fut a = new fut() {
      @Override
      public CompletableFuture<Optional<cjv>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fut a(UserApiService $$0, fce $$1, Path $$2) {
      return (fut)($$1.g() == fce.a.c ? new fua($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cjv>> a();

   boolean b();
}
