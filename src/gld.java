import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface gld {
   gld a = new gld() {
      @Override
      public CompletableFuture<Optional<crp>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static gld a(UserApiService $$0, fqf $$1, Path $$2) {
      return (gld)($$1.g() == fqf.a.c ? new gki($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<crp>> a();

   boolean b();
}
