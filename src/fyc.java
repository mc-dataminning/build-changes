import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyc {
   fyc a = new fyc() {
      @Override
      public CompletableFuture<Optional<cmu>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyc a(UserApiService $$0, ffo $$1, Path $$2) {
      return (fyc)($$1.g() == ffo.a.c ? new fxj($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmu>> a();

   boolean b();
}
