import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gbt {
   gbt a = new gbt() {
      @Override
      public CompletableFuture<Optional<cnw>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gbt a(UserApiService $$0, fiy $$1, Path $$2) {
      return (gbt)($$1.g() == fiy.a.c ? new gba($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cnw>> a();

   boolean b();
}
