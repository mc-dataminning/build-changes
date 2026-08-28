import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyv {
   fyv a = new fyv() {
      @Override
      public CompletableFuture<Optional<cmm>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyv a(UserApiService $$0, fgh $$1, Path $$2) {
      return (fyv)($$1.g() == fgh.a.c ? new fyc($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmm>> a();

   boolean b();
}
