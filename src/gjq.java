import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gjq {
   gjq a = new gjq() {
      @Override
      public CompletableFuture<Optional<cqu>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gjq a(UserApiService $$0, fos $$1, Path $$2) {
      return (gjq)($$1.g() == fos.a.c ? new giv($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cqu>> a();

   boolean b();
}
