import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyg {
   fyg a = new fyg() {
      @Override
      public CompletableFuture<Optional<cmy>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyg a(UserApiService $$0, ffs $$1, Path $$2) {
      return (fyg)($$1.g() == ffs.a.c ? new fxn($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmy>> a();

   boolean b();
}
