import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gmo {
   gmo a = new gmo() {
      @Override
      public CompletableFuture<Optional<csa>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gmo a(UserApiService $$0, frp $$1, Path $$2) {
      return (gmo)($$1.g() == frp.a.c ? new glt($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<csa>> a();

   boolean b();
}
