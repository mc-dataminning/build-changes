import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fzr {
   fzr a = new fzr() {
      @Override
      public CompletableFuture<Optional<cmz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fzr a(UserApiService $$0, fhb $$1, Path $$2) {
      return (fzr)($$1.g() == fhb.a.c ? new fyy($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmz>> a();

   boolean b();
}
