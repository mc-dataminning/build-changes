import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface fzz {
   fzz a = new fzz() {
      @Override
      public CompletableFuture<Optional<cma>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static fzz a(UserApiService $$0, fgy $$1, Path $$2) {
      return (fzz)($$1.g() == fgy.a.c ? new fzg($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cma>> a();

   boolean b();
}
