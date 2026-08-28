import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gke {
   gke a = new gke() {
      @Override
      public CompletableFuture<Optional<cra>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gke a(UserApiService $$0, fpe $$1, Path $$2) {
      return (gke)($$1.g() == fpe.a.c ? new gjj($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cra>> a();

   boolean b();
}
