import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gfs {
   gfs a = new gfs() {
      @Override
      public CompletableFuture<Optional<cpq>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gfs a(UserApiService $$0, fml $$1, Path $$2) {
      return (gfs)($$1.g() == fml.a.c ? new gey($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cpq>> a();

   boolean b();
}
