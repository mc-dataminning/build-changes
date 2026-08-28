import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ggn {
   ggn a = new ggn() {
      @Override
      public CompletableFuture<Optional<cpa>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static ggn a(UserApiService $$0, flw $$1, Path $$2) {
      return (ggn)($$1.g() == flw.a.c ? new gft($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpa>> a();

   boolean b();
}
