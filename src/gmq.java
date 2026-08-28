import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gmq {
   gmq a = new gmq() {
      @Override
      public CompletableFuture<Optional<csc>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gmq a(UserApiService $$0, frr $$1, Path $$2) {
      return (gmq)($$1.g() == frr.a.c ? new glv($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<csc>> a();

   boolean b();
}
