import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fvc {
   fvc a = new fvc() {
      @Override
      public CompletableFuture<Optional<ckc>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fvc a(UserApiService $$0, fcn $$1, Path $$2) {
      return (fvc)($$1.g() == fcn.a.c ? new fuj($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<ckc>> a();

   boolean b();
}
