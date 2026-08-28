import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ggl {
   ggl a = new ggl() {
      @Override
      public CompletableFuture<Optional<coy>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static ggl a(UserApiService $$0, flu $$1, Path $$2) {
      return (ggl)($$1.g() == flu.a.c ? new gfr($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<coy>> a();

   boolean b();
}
