import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyh {
   fyh a = new fyh() {
      @Override
      public CompletableFuture<Optional<cmz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyh a(UserApiService $$0, fft $$1, Path $$2) {
      return (fyh)($$1.g() == fft.a.c ? new fxo($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmz>> a();

   boolean b();
}
