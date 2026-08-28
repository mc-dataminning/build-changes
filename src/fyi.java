import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyi {
   fyi a = new fyi() {
      @Override
      public CompletableFuture<Optional<cna>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyi a(UserApiService $$0, ffu $$1, Path $$2) {
      return (fyi)($$1.g() == ffu.a.c ? new fxp($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cna>> a();

   boolean b();
}
