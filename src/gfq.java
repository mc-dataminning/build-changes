import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gfq {
   gfq a = new gfq() {
      @Override
      public CompletableFuture<Optional<cpu>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gfq a(UserApiService $$0, fml $$1, Path $$2) {
      return (gfq)($$1.g() == fml.a.c ? new gew($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpu>> a();

   boolean b();
}
