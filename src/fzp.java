import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fzp {
   fzp a = new fzp() {
      @Override
      public CompletableFuture<Optional<cmz>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fzp a(UserApiService $$0, fgz $$1, Path $$2) {
      return (fzp)($$1.g() == fgz.a.c ? new fyw($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmz>> a();

   boolean b();
}
