import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fyf {
   fyf a = new fyf() {
      @Override
      public CompletableFuture<Optional<cmx>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fyf a(UserApiService $$0, ffr $$1, Path $$2) {
      return (fyf)($$1.g() == ffr.a.c ? new fxm($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cmx>> a();

   boolean b();
}
