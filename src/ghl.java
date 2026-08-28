import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ghl {
   ghl a = new ghl() {
      @Override
      public CompletableFuture<Optional<cpt>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static ghl a(UserApiService $$0, fms $$1, Path $$2) {
      return (ghl)($$1.g() == fms.a.c ? new ggr($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpt>> a();

   boolean b();
}
